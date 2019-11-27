package dbmigrationapp.controller;

import dbmigrationapp.models.Car;
import dbmigrationapp.repo.CarRepo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarController {

    private final CarRepo carRepo;

    public CarController (CarRepo repo) {
        this.carRepo = repo;
    }

    @GetMapping("/create")
    public String carCreation(){
        Car mazda = Car.builder().cost(300).maker("Mazda").color("Red").build();
        Car saved = carRepo.save(mazda);
        return String.valueOf(saved.getId());
    }
}
