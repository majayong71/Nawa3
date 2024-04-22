package Nawa3.Nawa3.entity;

import Nawa3.Nawa3.dto.BaseTimeEntity;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

//크롤링 데이터를 예쁘게 넣는 테이블
public class Place extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "place_id")
    private String placeId; // id값
    private String img; // 이미지소스
    private Integer rank; // 데이터 순위
    private String description; // 설명
    private String name;  // 장소 이름
    private String link; //하이퍼링크
    private String type; //장소 타입

}
