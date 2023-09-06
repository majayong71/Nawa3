package Nawa3.Nawa3.service;
import Nawa3.Nawa3.Entity.Restaurant;
import Nawa3.Nawa3.dto.RestaurantResponseDto;
import Nawa3.Nawa3.repository.RestaurantRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RestaurantService { // Restaurant 에 관련된 로직 , 기능 클래스

    private final RestaurantRepository restaurantRepository;

    public List<Restaurant> findAllRestaurant() { // 전체조회
        return restaurantRepository.findAll();
    }

    //전체조회 응답 ( stream 사용 했을 때 )
    public List<RestaurantResponseDto> findAllRestaurantResponse() {
        List<Restaurant> restaurants = restaurantRepository.findAll();

        // restaurants 인스턴스를 stream으로 변환하고 map 메서드를 이용해
        // RestaurantResponseDto 에 of 메서드를 이용해 값을 넣어주고
        // collect 메서드로 요소를 수집하여 원하는 형태로 반환한다.
        return restaurants.stream().map(RestaurantResponseDto::of).collect(Collectors.toList());

        /*
        List<RestaurantResponseDto> dtos = restaurants.stream()
                .map(restaurant -> new RestaurantResponseDto(
                        restaurant.getId(),
                        restaurant.getName(),
                        restaurant.getDescription(),
                        restaurant.getPlaceType(),
                        restaurant.getImgSource()
                        ))
                .collect(Collectors.toList());
        return dtos;
        */
    }

    //전체조회 응답 ( 반복문 사용 했을 때 )
    public List<RestaurantResponseDto> findAllRestaurantResponse2() {
        List<Restaurant> restaurants = restaurantRepository.findAll();

        //ArrayList를 생성하고 반복문을 통해 하나 하나 ArrayList에 집어넣는 코드
        List<RestaurantResponseDto> dtos = new ArrayList<>();
        for (Restaurant restaurant : restaurants) {
            RestaurantResponseDto dto = RestaurantResponseDto.of(restaurant);
            dtos.add(dto);
        }
        return dtos;
    }

    public void updateDescription (Long id, String description) {

        Restaurant restaurants = restaurantRepository.findById(id).get();
        restaurants.setDescription(description);
        restaurantRepository.save(restaurants);

    }

    public void deleteRestaurantResponse (Long id) { // 삭제
        restaurantRepository.deleteById(id);
    }


}
