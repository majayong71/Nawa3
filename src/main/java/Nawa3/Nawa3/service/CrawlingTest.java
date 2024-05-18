package Nawa3.Nawa3.service;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class CrawlingTest {

    private static WebDriver driver; // WebDriver 인터페이스를 구현한 객체 참조 변수
    public static String WEB_DRIVER_ID = "webdriver.chrome.driver"; // Chrome WebDriver의 시스템 프로퍼티 키
    private static String WEB_DRIVER_PATH ="C:\\Users\\ASUS\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe"; // Chrome WebDriver의 경로

    // Chrome WebDriver 인스턴스를 반환하는 메서드
    public static WebDriver getChromeDriver() {
        // WebDriver 경로가 설정되어 있지 않은 경우에만 설정
        if (System.getProperty("webdriver.chrome.driver") == null) {
            // WebDriver 경로를 시스템 프로퍼티에 설정
            System.setProperty("webdriver.chrome.driver", WEB_DRIVER_PATH);
        }

        // Chrome WebDriver를 생성하고 설정된 옵션을 적용
        ChromeOptions chromeOptions = new ChromeOptions();
//        chromeOptions.setHeadless(true); // 헤드리스 모드로 실행하여 브라우저를 보이지 않게 설정
        chromeOptions.addArguments("--remote-allow-origins=*"); // 크로스 도메인 문제 해결
        chromeOptions.addArguments("--disable-web-security"); // 웹 보안 비활성화
        chromeOptions.addArguments("--disable-gpu"); // GPU 가속 비활성화
        chromeOptions.addArguments("--no-sandbox"); // 샌드박스 모드 비활성화
        chromeOptions.addArguments("--disable-dev-shm-usage"); // /dev/shm 파티션 사용 비활성화
        chromeOptions.addArguments("--disable-blink-features=AutomationControlled"); // 자동 제어 기능 비활성화
        chromeOptions.addArguments("user-agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/124.0.0.0 Safari/537.36");// 사용자 에이전트 설정
        chromeOptions.addArguments("Accept-Language=ko-KR,ko;q=0.9,en-US;q=0.8,en;q=0.7"); // 언어 설정
        chromeOptions.addArguments("Accept=text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7"); // Accept 헤더 설정

        // Chrome WebDriver 인스턴스 생성
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30)); // 페이지 로딩 타임아웃 설정
        return driver;
    }

    public static void main(String[] args) {
        // Chrome WebDriver 인스턴스 생성
        WebDriver driver = getChromeDriver();

        String url = "https://map.naver.com/p/search/%ED%99%8D%EB%8C%80%EC%9E%85%EA%B5%AC%EC%97%AD%EB%A7%9B%EC%A7%91?c=16.24,0,0,0,dh"; // 크롤링할 페이지 URL
        List<WebElement> webElementList = new ArrayList<>(); // 웹 요소를 담을 리스트
        String query ="span.place_bluelink.TYaxT"; // CSS 선택자
        String iframeId = "searchIframe"; // iframe 요소의 id

        try {
            driver.get(url);
            Thread.sleep(5000);
            //특정 iframe 으로 전환
            driver.switchTo().frame(driver.findElement(By.id(iframeId)));
            // iframe 내부에서 요소를 찾음
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            webElementList = driver.findElements(By.cssSelector(query));

            // 요소를 텍스트로 출력
            for (WebElement element : webElementList) {
                System.out.println(element.getText());
            }

            // 메인 페이지로 다시 전환
            driver.switchTo().defaultContent();

            System.out.println("Page title is: " + driver.getTitle());
            System.out.println("Current URL: " + driver.getCurrentUrl());

        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            driver.quit();
        }
    }
}


//package Nawa3.Nawa3.service;
//
//import org.jsoup.nodes.Document;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.springframework.util.ObjectUtils;
//
//import java.time.Duration;
//import java.util.ArrayList;
//import java.util.List;
//
//public class CrawlingTest {
//
//    private static WebDriver driver;
//    public static String WEB_DRIVER_ID = "webdriver.chrome.driver";
//    // WebDriver 경로
//    private static String WEB_DRIVER_PATH ="C:\\Users\\ASUS\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe";
//
//    public static WebDriver getChromeDriver() {
//        if (ObjectUtils.isEmpty(System.getProperty("webdriver.chrome.driver")))
//        {
//            System.setProperty("webdriver.chrome.driver", WEB_DRIVER_PATH);
//        }
//
//         //webDriver 옵션 설정
//         ChromeOptions chromeOptions = new ChromeOptions();
//         chromeOptions.setHeadless(true);
////         chromeOptions.addArguments("--lang=ko");
////         chromeOptions.addArguments("--no-sandbox");
////         chromeOptions.addArguments("--disable-dev-shm-usage");
////         chromeOptions.addArguments("--disable-gpu");
//         chromeOptions.addArguments("--user-agent=mozilla/5.0 (windows nt 10.0; win64; x64) applewebkit/537.36 (khtml, like gecko) chrome/94.0.4606.61 safari/537.36");
//         chromeOptions.setCapability("ignoreProtectedModeSettings", true);
//
//
//        WebDriver driver = new ChromeDriver(chromeOptions);
//        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
//        return driver;
//
//    }
//
//
//
//    public static void main(String[] args) {
//
//        System.setProperty(WEB_DRIVER_ID, WEB_DRIVER_PATH);
//
//        //Driver SetUp
//        ChromeOptions options = new ChromeOptions();
//        options.setCapability("ignoreProtectedModeSettings", true);
//        driver = new ChromeDriver(options);
//
//        String url = "https://map.naver.com/p/search/%ED%99%8D%EB%8C%80%EC%9E%85%EA%B5%AC%EC%97%AD%20%EB%A7%9B%EC%A7%91?c=15.80,0,0,0,dh";
//        Document doc;
//
//        WebDriver driver = CrawlingTest.getChromeDriver();
//        List<WebElement> webElementList = new ArrayList<>();
//        String query = "#id";
//        if (!ObjectUtils.isEmpty(driver)) {    driver.get(url);
//            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//
//            webElementList = driver.findElements(By.cssSelector(query));
//        }
//
//        System.out.println(webElementList.get(0).getText());
//
////        try {
////
////            doc = Jsoup.connect(url).get();
////            doc.toString();
////            System.out.println(doc.toString());
////
////            // 공백은 . 으로 표현
////            Elements e1 = doc.select(".place_bluelink");
////
////            for (int i = 0; i < 5; i++) {
////                String e2 = e1.get(i)
////                        .attr("style")
////                        .replace("width:100%;height:99px;background-image:url(\"", "")
////                        .replace("\")", "");
////                System.out.println(e2);
////            }
////        }
////        catch (Exception e) {
////            e.printStackTrace();
////        }
//    }
//}
