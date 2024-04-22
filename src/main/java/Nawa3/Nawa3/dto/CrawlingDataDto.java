package Nawa3.Nawa3.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class CrawlingDataDto {

    private Integer crawlingId;
    private Integer rank;
    private String name;
    private String placeType;
    private LocalDateTime createdTime;
    private String imgSource;


    public static CrawlingDataDto of(Integer crawlingId, Integer rank, String placeType, LocalDateTime localDateTime, String imgSource) {
        CrawlingDataDto crawlingDataDto = new CrawlingDataDto();
        crawlingDataDto.setCrawlingId(crawlingId);
        crawlingDataDto.setRank(rank);
        crawlingDataDto.setPlaceType(placeType);
        crawlingDataDto.setCreatedTime(localDateTime);
        crawlingDataDto.setImgSource(imgSource);
        return crawlingDataDto;
    }

}