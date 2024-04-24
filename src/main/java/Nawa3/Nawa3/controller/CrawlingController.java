package Nawa3.Nawa3.controller;

import Nawa3.Nawa3.service.CrawlingService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

// @REST API 설계를 위한 클래스
@RestController
@RequiredArgsConstructor
public class CrawlingController {

    private final CrawlingService crawlingService;

//    @GetMapping("/")
//    public List<CrawlingDataDto> getAllCrawlingData() {
//        List<CrawlingDataDto> crawlingDataDtoList = crawlingService.getAllCrawlingData();
//        crawlingDataDtoList.forEach(System.out::println);
//        return crawlingDataDtoList;
//    }


}
