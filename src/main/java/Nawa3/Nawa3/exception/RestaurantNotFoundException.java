package Nawa3.Nawa3.exception;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class RestaurantNotFoundException extends RuntimeException {
    int statusCode;
    String message;
}
