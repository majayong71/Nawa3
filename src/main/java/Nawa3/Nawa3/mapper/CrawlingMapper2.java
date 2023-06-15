package Nawa3.Nawa3.mapper;

import Nawa3.Nawa3.dto.CrawlingDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper //복습포인트.
public interface CrawlingMapper2 {

    List<CrawlingDto> selectAllCrawling2();

    // CrawlingDTO 를 배열에 담고 , 모든 데이터를 조회하는 메서드

    CrawlingDto selectAllCrawlingById2 (Integer id);

    // crawlingDTO 에 있는 데이터중 id값으로 조회하는 메서드

}
