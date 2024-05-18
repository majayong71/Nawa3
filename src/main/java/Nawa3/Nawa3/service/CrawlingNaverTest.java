package Nawa3.Nawa3.service;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CrawlingNaverTest {

    private static WebDriver driver; // WebDriver 인터페이스를 구현한 객체 참조 변수
    public static String url = "https://www.naver.com/";

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get(url);

    }


}
