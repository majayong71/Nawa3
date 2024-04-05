package Nawa3.Nawa3.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public class Crawling {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer count; // primary key

    @Column
    private Integer rank; // 순위

    @Column
    private String placeType;

    @Column
    private LocalDateTime created;

    @Column
    private String timeType;

    @Column
    private String imgSource;

}
