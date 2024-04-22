package Nawa3.Nawa3.entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public class Crawling {

    // primary key
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer count;

    // 순위
    @Column
    private Integer rank;

    @Column
    private String placeType;

    @Column
    private LocalDateTime created;

    @Column
    private String timeType;

    @Column
    private String imgSource;

}
