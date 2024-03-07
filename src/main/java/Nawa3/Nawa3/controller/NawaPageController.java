package Nawa3.Nawa3.controller;
import Nawa3.Nawa3.dto.CrawlingDto;
import Nawa3.Nawa3.service.CrawlingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller // 데이터를 객체로 담아 템플릿으로 전달해주는 Controller 클래스
public class NawaPageController {

    @Autowired
    private CrawlingService crawlingService;

//    @GetMapping ("/")
//    public String nawaWelcomePage (Model model) {
//        List<CrawlingDto> crawlingByImgSource = crawlingService.getCrawlingByImgSource(1);
//        model.addAttribute("img1",crawlingByImgSource);
//        return "index";
//    }

    @GetMapping ("/")
    public String nawaWelcomePage () {
        return "index";
    }
}
