package Nawa3.Nawa3.entity;
import Nawa3.Nawa3.dto.BaseTimeEntity;
import jakarta.persistence.*;
import lombok.*;
@Entity //Entity 클래스
@Getter
@Setter
@NoArgsConstructor
    /* JPA 는 public 또는 protected 의 기본 생성자가 필수이다
    기본 생성자를 꼭 넣어주자.*/
@AllArgsConstructor(access = AccessLevel.PRIVATE)

//데이터베이스의 테이블과 매핑되는 클래스로, DB와의 연동을 위한 필드와 메서드를 가지고있다.
public class Restaurant extends BaseTimeEntity {

    // PK 생성값을 DB종류에 따라서 맞는 방식을 사용한다
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "restaurant_id")
    private Long RestaurantId;

    @Column
    private String name;

    @Column
    private String description;

    //@Enumerated(EnumType.STRING) // Enum의 각 상수 값이 DB에 저장될 때 문자열 값으로 저장된다.
    //스네이크케이스
    @Column(name = "place_type")
    //카멜케이스
    private String placeType;

    @Column(name = "img_source")
    private String imgSource;


    // 기본생성자를 이용한 프록시기술등 활용도가 있는 부분이 있지만 나중에 알아보자
}
