package Nawa3.Nawa3.controller;


import Nawa3.Nawa3.service.CrawlingServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
@RequiredArgsConstructor
public class CrawlingDataController {

    private final CrawlingServiceImpl crawlingServiceImpl;

    @GetMapping("/images")
    public String getImageSources(Model model) {
        List<Integer> ids = Arrays.asList(8, 9, 10, 11); // 조회하려는 ID 목록
        List<String> imgSources = crawlingServiceImpl.getImgSourcesByIds(ids);
        model.addAttribute("imgsources", imgSources);
        return "imgSources";
    }


}
