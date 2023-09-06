package Nawa3.Nawa3.controller;


import Nawa3.Nawa3.Entity.Restaurant;
import Nawa3.Nawa3.dto.RestaurantResponseDto;
import Nawa3.Nawa3.service.RestaurantService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor

public class RestaurantController {

    private final RestaurantService restaurantService;

    @GetMapping("/api/restaurants") // 전체 조회
    public List<RestaurantResponseDto> findAll() { // Restaurant 래핑하는 Response DTO 만들기
        List<RestaurantResponseDto> restaurantResponseDtos = restaurantService.findAllRestaurantResponse();
        return restaurantResponseDtos;
    }

    @PatchMapping("/api/restaurants/description") // 09-06 오후 7:02
    public void findByIdUpdateDescription() {
        restaurantService.updateDescription(null,);
    }



//    @GetMapping ("/api/restaurants")
//    public List<RestaurantResponseDto> findAll() { // 전체 조회
//        return restaurantService.findAllRestaurantResponse();
//    }

//    @DeleteMapping("/api/restaurants/{id}")
//    public void deleteRestaurantResponse (@PathVariable Long id) { // 선택 삭제
//        deleteRestaurantResponse(id);
//    }
}

