package Nawa3.Nawa3.controller;

import Nawa3.Nawa3.dto.RestaurantResponseDto;
import Nawa3.Nawa3.service.RestaurantService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
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

//    @PatchMapping("/api/restaurants/{id}/descriptions") //업데이트
//    public RestaurantService updateDescription(@PathVariable Long id, @RequestParam String description ) {
//        restaurantService.updateRestaurantDescription(id,description);
//        return restaurantService;
//    }
//    @PatchMapping("/{id}/description")
//    public ResponseEntity<RestaurantResponseDto> updateDescription(
//            @PathVariable Long id,
//            String description
//    )
//    {
//        Restaurant updatedRestaurant = restaurantService.updateRestaurantDescription(id, description);
//        if (updatedRestaurant != null) {
//            return ResponseEntity.ok(RestaurantResponseDto.of(updatedRestaurant));
//        } else {
//            return ResponseEntity.notFound().build();
//        }
//    }

    @PatchMapping("/{id}/description")
    public ResponseEntity<String> updateRestaurantDescription(
            @PathVariable Long id,
            @RequestBody String newDescription) {

        boolean updated = restaurantService.updateRestaurantDescription(id, newDescription);

        if (updated) {
            return ResponseEntity.ok("Description updated successfully");
        } else {
            return ResponseEntity.notFound().build();
        }
    }


//    @PatchMapping("api/restaurants/{id}/descriptions")
//    public List<RestaurantResponseDto> updateDescriptionById (@PathVariable Long id, String description) {
////Patch 요청을 받아 id값에 맞는 description을 수정해주고 RestaurantResponseDto 로 변환해주는 코드
//        Optional<Restaurant> restaurants = restaurantService.updateDescriptionById(id,description);
//        return restaurants.stream().map(RestaurantResponseDto::of).collect(Collectors.toList());
//    }

//    @GetMapping ("/api/restaurants")
//    public List<RestaurantResponseDto> findAll() { // 전체 조회
//        return restaurantService.findAllRestaurantResponse();
//    }

//    @DeleteMapping("/api/restaurants/{id}")
//    public void deleteRestaurantResponse (@PathVariable Long id) { // 선택 삭제
//        deleteRestaurantResponse(id);
//    }
}

