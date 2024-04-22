package Nawa3.Nawa3.entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
public class CrawlingData {

    // primary key
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "crawling_id")
    private Integer crawlingId;

    // 순위
    @Column
    private Integer rank;

    @Column
    private String name;

    @Column(name = "place_type")
    private String placeType;

    @Column(name = "created_time")
    private LocalDateTime createdTime;

    @Column(name = "img_source")
    private String imgSource;

}