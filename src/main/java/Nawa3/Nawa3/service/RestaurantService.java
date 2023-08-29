package Nawa3.Nawa3.service;

import Nawa3.Nawa3.dto.Restaurant;
import Nawa3.Nawa3.dto.RestaurantResponseDto;
import Nawa3.Nawa3.repository.RestaurantRepository;

import java.util.ArrayList;
import java.util.List;

import Nawa3.Nawa3.repository.RestaurantResponseDtoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RestaurantService { // Restaurant 에 관련된 로직 , 기능 클래스

    private final RestaurantRepository restaurantRepository;
    private final RestaurantResponseDtoRepository restaurantResponseDtoRepository;


    public List<Restaurant> findAllRestaurant() { // 전체조회
        return restaurantRepository.findAll();
    }

    public List<RestaurantResponseDto> findAllRestaurantResponse() { //전체조회 응답
        return restaurantResponseDtoRepository.findAll();
    }

    public void deleteRestaurantResponse (Long id) { // 삭제
        restaurantResponseDtoRepository.deleteById(id);
    }


}
