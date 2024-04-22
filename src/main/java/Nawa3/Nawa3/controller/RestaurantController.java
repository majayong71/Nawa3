package Nawa3.Nawa3.controller;

import Nawa3.Nawa3.dto.RestaurantRequestDto;
import Nawa3.Nawa3.dto.RestaurantResponseDto;
import Nawa3.Nawa3.entity.Restaurant;
import Nawa3.Nawa3.service.RestaurantService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor

public class RestaurantController {

    private final RestaurantService restaurantService;

    // 전체 조회
    @GetMapping("/api/restaurants/all")
    public List<RestaurantResponseDto> findAll() {
        List<Restaurant> restaurants = restaurantService.findAllRestaurants();
        return restaurants
                .stream()
                .map(RestaurantResponseDto::of)
                .collect(Collectors.toList());
    }

    // 이름으로 Entity 조회
    @GetMapping("/api/restaurants")
    public List<RestaurantResponseDto> findRestaurantsByName(@RequestParam String name) {
        List<Restaurant> restaurants = restaurantService.findRestaurantsByName(name);
        return restaurants
                .stream()
                .map(RestaurantResponseDto::of)
                .collect(Collectors.toList());
    }

    // 선택 삭제
    @DeleteMapping("/api/restaurants/{id}")
    public void deleteRestaurantResponse(@PathVariable Long id) {
        restaurantService.deleteById(id);
    }

    // 선택 수정
    @PutMapping("/api/restaurants/update/{id}")
    public ResponseEntity<RestaurantResponseDto> updateRestaurant(
            @PathVariable Long id,
            @RequestBody RestaurantRequestDto updateRequestDto) {

        Restaurant updateRestaurant = restaurantService.updateRestaurant(id, updateRequestDto);
        RestaurantResponseDto responseDto = RestaurantResponseDto.of(updateRestaurant);

        return ResponseEntity.ok(responseDto);
    }
}
