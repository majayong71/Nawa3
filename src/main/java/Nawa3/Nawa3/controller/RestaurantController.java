package Nawa3.Nawa3.controller;


import Nawa3.Nawa3.dto.Restaurant;
import Nawa3.Nawa3.dto.RestaurantResponseDto;
import Nawa3.Nawa3.service.RestaurantService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor

public class RestaurantController {

    private final RestaurantService restaurantService;

    @GetMapping ("/api/restaurants")
    public List<RestaurantResponseDto> findAll() {
        return restaurantService.findAllRestaurantResponse();
    }
}

