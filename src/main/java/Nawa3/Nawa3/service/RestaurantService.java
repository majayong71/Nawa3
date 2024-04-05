package Nawa3.Nawa3.service;

import Nawa3.Nawa3.Entity.Restaurant;
import Nawa3.Nawa3.dto.RestaurantRequestDto;
import Nawa3.Nawa3.exception.RestaurantNotFoundException;
import Nawa3.Nawa3.repository.RestaurantRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class RestaurantService { // Restaurant 에 관련된 로직 , 기능 클래스

    private final RestaurantRepository restaurantRepository;

    public List<Restaurant> findAllRestaurant() { // 전체조회
        return restaurantRepository.findAll();
    }

    public List<Restaurant> findRestaurantsByName(String name) {
        return restaurantRepository.findByNameLike(name);
    }

    public List<Restaurant> findAllRestaurants() { //전체조회 응답
        List<Restaurant> restaurants = restaurantRepository.findAll();
        return restaurants;
    }

    public void deleteById(Long id) { // 삭제
        Optional<Restaurant> restaurant = restaurantRepository.findById(id);
        if (restaurant.isEmpty()) {
            throw new RestaurantNotFoundException(401, "레스토랑이 존재하지 않습니다.");
        } else {
            restaurantRepository.deleteById(id);
        }
    }

    public Restaurant updateRestaurant(Long id, RestaurantRequestDto updateRequestDto) { //수정
        Restaurant restaurant = restaurantRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Restaurant not found with id: " + id));
        restaurant.setName(updateRequestDto.getName());
        restaurant.setDescription(updateRequestDto.getDescription());
        restaurant.setId(updateRequestDto.getId());
        restaurant.setImgSource(updateRequestDto.getImgSource());
        restaurant.setPlaceType(updateRequestDto.getPlaceType());

        return restaurantRepository.save(restaurant); // 변경 사항 저장
    }


}
