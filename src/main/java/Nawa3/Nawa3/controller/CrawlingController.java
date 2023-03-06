package Nawa3.Nawa3.controller;


import Nawa3.Nawa3.dto.BackgroundDto;
import Nawa3.Nawa3.dto.CrawlingDto;
import Nawa3.Nawa3.service.BackgroundService;
import Nawa3.Nawa3.service.CrawlingService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CrawlingController {

    @Autowired
    private CrawlingService crawlingService;

    @Autowired
    private BackgroundService backgroundService;

    @GetMapping("/")
    public String nawaWelcomePage (Model model) {

        model.addAttribute("textcode","테스트코드");
        System.out.println(model);

        return "index";
    }

    @GetMapping("/test")
    @ResponseBody
    public CrawlingDto testData () {
        return crawlingService.getCrawling();
    }

    @GetMapping("/test2")
    @ResponseBody
    public BackgroundDto testDataA () {
        return backgroundService.getBackground();
    }
}
