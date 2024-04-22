package Nawa3.Nawa3.dto;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;


//응답처리를 위한 Entity
@Getter
@NoArgsConstructor
public class RestaurantRequestDto extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private String description;

    @Column(name = "place_type")
    private String placeType;

    @Column(name = "img_source")
    private String imgSource;


}
