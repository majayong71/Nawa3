package Nawa3.Nawa3.controller;


import Nawa3.Nawa3.dto.CrawlingDto;
import Nawa3.Nawa3.service.CrawlingService;
import Nawa3.Nawa3.service.CrawlingService2;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class CrawlingController {

    @Autowired
    private CrawlingService crawlingService;
    @Autowired
    private CrawlingService2 crawlingService2; // @AutoWired 는 등록,사용 할 때 다 써야한다.

    @GetMapping("/")
    public String nawaWelcomePage (Model model) {

        model.addAttribute("textcode","테스트코드");
        System.out.println(model);

        return "index";
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
