package Nawa3.Nawa3.dto;


import Nawa3.Nawa3.Entity.Restaurant;
import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
public class RestaurantResponseDto  { //응답처리를 위한 Entity

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

    //restaurant Entity 를 파라미터로 받아 Dto 를 반환해주는 메서드
    public static RestaurantResponseDto of (Restaurant restaurant) {
        return new RestaurantResponseDto
                       (
                        restaurant.getId(),
                        restaurant.getName(),
                        restaurant.getDescription(),
                        restaurant.getPlaceType(),
                        restaurant.getImgSource()
                       );
    }
}
