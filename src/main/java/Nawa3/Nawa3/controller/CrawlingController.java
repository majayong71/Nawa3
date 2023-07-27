package Nawa3.Nawa3.controller;
import Nawa3.Nawa3.dto.CrawlingDto;
import Nawa3.Nawa3.service.CrawlingService;
import Nawa3.Nawa3.service.CrawlingService2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController // @REST API 설계를 위한 클래스
public class CrawlingController {

    @Autowired
    private CrawlingService crawlingService;
    @Autowired
    private CrawlingService2 crawlingService2; // @AutoWired 는 등록,사용 할 때 다 써야한다.

    @GetMapping ("/data")
    public List<CrawlingDto> getData() {
        List<CrawlingDto> crawlingByImgsource = crawlingService.getCrawlingByImgSource(1);
        return crawlingByImgsource;
    }



/*
    @GetMapping("/testpage")
    public String nawaWelcomePage (Model model) {

        List<CrawlingDto> crawlingByImgSource = crawlingService.getCrawlingByImgSource(1);

        model.addAttribute("img1",crawlingByImgSource);

        System.out.println(crawlingByImgSource.get(0).getImgSource());

        return "index.html";

    }
*/

    @GetMapping("/test/12")
    public String testData41 (Model model) {
        model.addAttribute("img0",crawlingService.getCrawlingById(1));
        return "index.html";
    }
    @GetMapping("/test/10")
    public String testData3 (Model model) {
        model.addAttribute("img0",crawlingService.getCrawling());
        System.out.println(model);
        return "index2.html";
    }


    @GetMapping("/test")
    @ResponseBody
    public List<CrawlingDto> testData () {
        return crawlingService.getCrawling();
    }

    @GetMapping("/test2")
    @ResponseBody
    public List<CrawlingDto> testData2 () {
        return crawlingService2.getSelectAllCrawling();
    }

    @GetMapping("/test5/{id}")
    @ResponseBody
    public CrawlingDto testDataC (@PathVariable("id") Integer id) {
        return crawlingService2.getSelectCrawlingById(id);
    }


    @GetMapping("/test4/{id}")
    @ResponseBody
    public CrawlingDto testDataB (@PathVariable("id") Integer id) {
        return crawlingService.getCrawlingById(id);
    }

}
