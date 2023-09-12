package Nawa3.Nawa3.repository;

import Nawa3.Nawa3.Entity.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {
                                                    // CRUD 기능
//    Optional<Restaurant> updateDescriptionById (Long id, String description);
}
