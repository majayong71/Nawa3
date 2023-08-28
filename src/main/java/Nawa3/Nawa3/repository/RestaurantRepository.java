package Nawa3.Nawa3.repository;

import Nawa3.Nawa3.dto.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {
                                                    // CRUD 기능
}
