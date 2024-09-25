package Nawa3.Nawa3.service;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class CrawlingTest {
    public static void main(String[] args) {
        String iframeUrl = "https://pcmap.place.naver.com/place/list?query=%ED%99%8D%EB%8C%80%EC%9E%85%EA%B5%AC%EC%97%AD%EB%A7%9B%EC%A7%91&x=126.804843&y=37.398715&clientX=126.804843&clientY=37.398715&display=70&ts=1716879983079&mapUrl=https%3A%2F%2Fmap.naver.com%2Fp%2Fsearch%2F%ED%99%8D%EB%8C%80%EC%9E%85%EA%B5%AC%EC%97%AD%EB%A7%9B%EC%A7%91";

        try {
            // Jsoup을 사용해 iframe 페이지 가져오기
            Document iframeDoc = Jsoup.connect(iframeUrl).get();

            // 지정된 CSS 쿼리로 요소들 가져오기
            String query = "span.place_bluelink.TYaxT";
            Elements elements = iframeDoc.select(query);
            for (Element element : elements) {
                System.out.println(element.text());
            }

            // iframe 페이지 제목 출력
            String iframeTitle = iframeDoc.title();
            System.out.println("Iframe page title is: " + iframeTitle);

            // 현재 URL 출력
            System.out.println("Current URL: " + iframeUrl);

        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}