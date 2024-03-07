package Nawa3.Nawa3.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class CrawlingDto {

    private Integer rank;
    private Integer count;
    private String placeType;
    private LocalDateTime created;
    private String timeType;
    private String imgSource;

}
