package Nawa3.Nawa3.service;

import Nawa3.Nawa3.dto.CrawlingDto;
import Nawa3.Nawa3.mapper.CrawlingMapper2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service // 복습포인트
public class CrawlingService2 {

    @Autowired // 의존성주입
    private CrawlingMapper2 crawlingMapper2;

    public List<CrawlingDto> getSelectAllCrawling () {
        return crawlingMapper2.selectAllCrawling2();
    }

    public CrawlingDto getSelectCrawlingById(Integer id) {
        return crawlingMapper2.selectAllCrawlingById2(id);
    }
}
