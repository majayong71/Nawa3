package Nawa3.Nawa3.mapper;

import Nawa3.Nawa3.dto.CrawlingDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CrawlingMapper {

    CrawlingDto selectCrawling();
}
