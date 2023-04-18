import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;

public class Crawl {

    public static void main(String[] args) {

        String url = "https://search.naver.com/search.naver?sm=tab_hty.top&where=nexearch&query=%ED%99%8D%EB%8C%80+%EB%A7%9B%EC%A7%91&oquery=%ED%99%8D%EB%8C%80+%EB%A7%9B%EC%A7%91&tqi=hC6%2F%2Fsp0J14ssnoOIKVssssss%2B4-003887";
        Document doc;

        try {

            doc = Jsoup.connect(url).get();

            Elements e1 = doc.getElementsByAttributeValue("class", "cb7hz QmdzL");

            for (int i = 6; i < 24; i++) {

                String e2 = e1.get(i)
                        .attr("style")
                        .replace("width:100%;height:99px;background-image:url(\"", "")
                        .replace("\")", "");

                if (i == 7) {
                    String img1 = e2;
                    System.out.println(img1 + " img1 ");
                } else if (i == 8) {
                    String img2 = e2;
                    System.out.println(img2 + " img2 ");
                } else if (i == 9) {
                    String img3 = e2;
                    System.out.println(img3 + " img3 ");
                } else if (i == 10) {
                    String img4 = e2;
                    System.out.println(img4 + " img4 ");
                } else if (i == 11) {
                    String img5 = e2;
                    System.out.println(img5 + " img5 ");
                } else if (i == 12) {
                    String img6 = e2;
                    System.out.println(img6 + " img6 ");
                } else if (i == 13) {
                    String img7 = e2;
                    System.out.println(img7 + " img7 ");
                } else if (i == 14) {
                    String img8 = e2;
                    System.out.println(img8 + " img8 ");
                } else if (i == 15) {
                    String img9 = e2;
                    System.out.println(img9 + " img9 ");
                } else if (i == 16) {
                    String img10 = e2;
                    System.out.println(img10 + " img10 ");
                } else if (i == 17) {
                    String img11 = e2;
                    System.out.println(img11 + " img11 ");
                } else if (i == 18) {
                    String img12 = e2;
                    System.out.println(img12 + " img12 ");
                } else if (i == 19) {
                    String img13 = e2;
                    System.out.println(img13 + " img13 ");
                } else if (i == 20) {
                    String img14 = e2;
                    System.out.println(img14 + " img14 ");
                } else if (i == 21) {
                    String img15 = e2;
                    System.out.println(img15 + " img15 ");
                } else if (i == 22) {
                    String img16 = e2;
                    System.out.println(img16 + " img16 ");
                } else if (i == 23) {
                    String img17 = e2;
                    System.out.println(img17 + " img17 ");
                }
                // e2 를 변수에 하나씩 담으면 되겠다.
                // 조건문을 이용해보자.
            }
        } catch (IOException e) {
            System.out.println("에러 발생" + e.getMessage());
            e.printStackTrace();
        }
    }
}
//        try   // 네이버 지도에서 직접 크롤링 코드
//
//        {
//            doc = Jsoup.connect(url)
//            .userAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/99.0.4844.82 Safari/537.36")
//            .header("authority","pcmap.place.naver.com")
//            .header("method","GET")
//            .header("path","/restaurant/list?query=%ED%99%8D%EB%8C%80%20%EB%A7%9B%EC%A7%91&x=126.92195610000005&y=37.5529932999998&ts=1648532218300&mapUrl=https%3A%2F%2Fmap.naver.com%2Fv5%2Fsearch%2F%25ED%2599%258D%25EB%258C%2580%2520%25EB%25A7%259B%25EC%25A7%2591%3Fc%3D14128887.5235382%2C4516469.7966862%2C15%2C0%2C0%2C0%2Cdh")
//            .header("scheme","https")
//            .header("accept","text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9")
//            .header("accept-encoding","gzip, deflate, br")
//            .header("accept-language","ko-KR,ko;q=0.9,en-US;q=0.8,en;q=0.7")
//            .header("cache-control","max-age=0")
//            .header("cookie","NNB=4DTCGS5527TWC; ASID=3d53c1210000017e9ae7e6a500000068; nx_ssl=2; wcs_bt=sp_968053dca84720:1648112377|sp_80320d48213ce0:1648112376|sp_9681f4e88ba448:1648110811|sp_9728bc11f403a0:1648107808|sp_97a777dd106de0:1648106653|sp_96e3b0f71622c0:1647405231|sp_96e7303cf0a908:1647405229|sp_96e1072883b780:1647405225|sp_cbcf4f941d8dc8:1647405221|sp_f15871ba55c60:1647405219; _ga=GA1.2.1539515391.1642662056; _ga_7VKFYR6RV1=GS1.1.1648461889.48.0.1648461889.60")
//            .header("sec-ch-ua","\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"99\", \"Google Chrome\";v=\"99\"")
//            .header("sec-ch-ua-mobile","?0")
//            .header("sec-ch-ua-platform","Windows")
//            .header("sec-fetch-dest","document")
//            .header("sec-fetch-mode","navigate")
//            .header("sec-fetch-site","none")
//            .header("sec-fetch-user","?1")
//            .header("upgrade-insecure-requests","1")
//            .get();

//            Elements e1 = doc.select("div._1sfuL");

//            String url = "https://www.naver.com/";   // 실험 예제
//            Document doc = Jsoup.connect(url).get();
//
//            Elements e1 = doc.select("span.thumb_bd");
//
//            System.out.println(e1);
