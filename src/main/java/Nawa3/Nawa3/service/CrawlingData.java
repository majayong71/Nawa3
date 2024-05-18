package Nawa3.Nawa3.service;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.List;

public class CrawlingData {

    private WebDriver driver;

    private static final String keyword = "주차장";
    private static final String url = "https://map.naver.com/v5/search";

    public void process () {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        driver = new ChromeDriver(options);

        getDataList();

        driver.close();

        driver.quit();
    }

    private void getDataList() {
        // (1) 브라우저에서 url로 이동한다.
        driver.get(url);
        // 브라우저 로딩될 때 까지 잠시 기다린다.
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));

        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe#searchIframe")));

        List<WebElement> elements = driver.findElements(By.cssSelector("name_text"));

        System.out.println("TestTest ===========================");
        System.out.println("elements.size() = " + elements.size());

        elements.get(0).click();

        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
        // 현재 프레임에서 상위 프레임으로 이동한다.
        driver.switchTo().defaultContent();

        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
        // (4) 상세정보가 나오는 프레임으로 이동한다.
        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe#entryIframe")));

        // (5) 상세정보 프레임에서 주소 정보가 들어있는 곳으로 이동한다.
        List<WebElement> placeSectionContents = driver.findElements(By.cssSelector(".place_section_content"));
        WebElement homeElement = placeSectionContents.get(1);

        // (6) "주소" 버튼 요소를 찾아 클릭한다.
        WebElement addressButton = homeElement.findElement(By.className("LDgIH"));
        addressButton.click();

        // (7) "도로명"과 "지번" 정보가 들어있는 div 요소를 찾아서, 해당 정보를 가져온다.
        WebElement addressDiv = driver.findElement(By.className("Y31Sf"));
        List<WebElement> addressInfos = addressDiv.findElements(By.className("nQ7Lh"));

        for (WebElement addressInfo : addressInfos) {
            WebElement addressType = addressInfo.findElement(By.tagName("span"));
            String address = addressInfo.getText().replace(addressType.getText(), "").trim();
            System.out.println(addressType.getText() + " : " + address);
        }
    }

    public static void main(String[] args) {
        CrawlingData crawlingData = new CrawlingData();
        crawlingData.process();
    }
}
