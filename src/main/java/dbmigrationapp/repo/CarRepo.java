package dbmigrationapp.repo;

import dbmigrationapp.models.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepo extends JpaRepository<Car,Long> {
    Car findByMaker(String carMaker);
}
