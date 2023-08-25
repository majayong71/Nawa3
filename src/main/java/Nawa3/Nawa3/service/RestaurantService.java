package Nawa3.Nawa3.service;

import Nawa3.Nawa3.dto.Restaurant;
import Nawa3.Nawa3.repository.RestaurantRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RestaurantService { // Restaurant 에 관련된 로직 , 기능 클래스

    private final RestaurantRepository restaurantRepository;

    public List<Restaurant> findAllRestaurant() {
        return restaurantRepository.findAll();
    }



}
