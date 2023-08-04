package Nawa3.Nawa3.dto;


import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Timestamp;

@Data
@Entity //Entity 클래스
//데이터베이스의 테이블과 매핑되는 클래스로, DB와의 연동을 위한 필드와 메서드를 가지고있다.
public class CrawlingDTO2 {

    @Id @GeneratedValue (strategy = GenerationType.IDENTITY) // PK 생성값을 DB종류에 따라서 맞는 방식을 사용한다
    private int id;

    @Column
    private int rank;
    @Column
    private String place_type;
    @CreationTimestamp // 생성될때 시간이 입력된다
    private Timestamp created;
    @Column
    private String time_type;
    @Column
    private String img_source;

    /* JPA 는 public 또는 protected 의 기본 생성자가 필수이다
    기본 생성자를 꼭 넣어주자.*/
    public CrawlingDTO2 () {

    }
    // 기본생성자를 이용한 프록시기술등 활용도가 있는 부분이 있지만 나중에 알아보자




}
