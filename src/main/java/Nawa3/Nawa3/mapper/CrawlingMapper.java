package Nawa3.Nawa3.mapper;

import Nawa3.Nawa3.dto.CrawlingDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;
import java.util.List;

@Mapper
public interface CrawlingMapper {

    List<CrawlingDto> selectAllCrawling();
}
