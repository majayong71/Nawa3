package Nawa3.Nawa3.controller;

import Nawa3.Nawa3.dto.CrawlingDataDto;
import Nawa3.Nawa3.service.CrawlingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

// @REST API 설계를 위한 클래스
@RestController
public class CrawlingController {

    @Autowired
    private final CrawlingService crawlingService;

    public CrawlingController(CrawlingService crawlingService) {
        this.crawlingService = crawlingService;
    }

    @GetMapping("/crawlingData")
    public List<CrawlingDataDto> getAllCrawlingData() {
        List<CrawlingDataDto> crawlingDataDtoList = crawlingService.getAllCrawlingData();
        crawlingDataDtoList.forEach(System.out::println);
        return crawlingDataDtoList;
    }


}
