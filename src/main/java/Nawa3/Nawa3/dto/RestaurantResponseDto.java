package Nawa3.Nawa3.dto;

import Nawa3.Nawa3.entity.Restaurant;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RestaurantResponseDto { // 응답처리를 위한 DTO

    private Long id;
    private String name;
    private String description;
    private String placeType;
    private String imgSource;

    // Restaurant 엔티티를 파라미터로 받아 DTO를 반환하는 메서드
    public static RestaurantResponseDto of(Restaurant restaurant) {
        return new RestaurantResponseDto(
                restaurant.getRestaurantId(),
                restaurant.getName(),
                restaurant.getDescription(),
                restaurant.getPlaceType(),
                restaurant.getImgSource()
        );
    }
}