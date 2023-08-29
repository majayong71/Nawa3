package Nawa3.Nawa3.controller;


import Nawa3.Nawa3.dto.Restaurant;
import Nawa3.Nawa3.dto.RestaurantResponseDto;
import Nawa3.Nawa3.service.RestaurantService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor

public class RestaurantController {

    private final RestaurantService restaurantService;
    private final RestaurantResponseDto restaurantResponseDto;

    @GetMapping ("/api/restaurants")
    public List<RestaurantResponseDto> findAll() { // 전체 조회
        return restaurantService.findAllRestaurantResponse();
    }

    @DeleteMapping("/api/restaurants/{id}")
    public void deleteRestaurantResponse (@PathVariable Long id) { // 선택 삭제
        deleteRestaurantResponse(id);
    }
}

