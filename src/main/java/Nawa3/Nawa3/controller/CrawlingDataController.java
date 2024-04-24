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

    @GetMapping("/")
    public String showImages(Model model) {
        // ID 리스트
        List<Integer> ids = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16);
        // 각 ID에 맞는 이미지 소스를 가져오기
        List<String> imageSources = crawlingServiceImpl.getImgSourcesByIds(ids);

        // 각 이미지 소스를 개별 모델 속성으로 추가
        for (int i = 0; i < ids.size(); i++) {
            model.addAttribute("model" + (i + 1), imageSources.get(i));
        }

        for (int i = 0; i < ids.size(); i++) {
            model.addAttribute("model" + (i + 1), imageSources.get(i));
            System.out.println("model" + (i + 1) + ": " + imageSources.get(i));
        }

        return "index";
    }

}
