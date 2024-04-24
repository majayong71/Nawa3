package Nawa3.Nawa3.entity;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity //Entity 클래스
@Getter
@Setter
@NoArgsConstructor
    /* JPA 는 public 또는 protected 의 기본 생성자가 필수이다
    기본 생성자를 꼭 넣어주자.*/
@AllArgsConstructor(access = AccessLevel.PRIVATE)
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