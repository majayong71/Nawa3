package Nawa3.Nawa3.service;

import Nawa3.Nawa3.dto.CrawlingDto;
import Nawa3.Nawa3.mapper.CrawlingMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CrawlingService {

    @Autowired
    private CrawlingMapper crawlingMapper;

    public CrawlingDto getCrawling() {
        return crawlingMapper.selectCrawling();
    }
}
