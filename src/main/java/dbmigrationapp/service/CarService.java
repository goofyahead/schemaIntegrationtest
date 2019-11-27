package dbmigrationapp.service;

import dbmigrationapp.models.Car;
import dbmigrationapp.repo.CarRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarService {

    private CarRepo repo;

    public CarService (CarRepo repo) {
        this.repo = repo;
    }

    public void storeCar(Car car){
        repo.save(car);
    }

}
