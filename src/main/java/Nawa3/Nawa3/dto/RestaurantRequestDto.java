package Nawa3.Nawa3.dto;


import Nawa3.Nawa3.Entity.Restaurant;
import jakarta.persistence.*;
import lombok.*;

@Getter
@NoArgsConstructor
public class RestaurantRequestDto extends BaseTimeEntity { //응답처리를 위한 Entity

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