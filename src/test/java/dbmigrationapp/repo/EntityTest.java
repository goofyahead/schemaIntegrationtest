package dbmigrationapp.repo;

import dbmigrationapp.models.Car;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;


@ExtendWith(SpringExtension.class)
@DataJpaTest
@TestPropertySource(properties = {
        "spring.jpa.hibernate.ddl-auto=validate"
})
class EntityTest {

    @Autowired
    CarRepo carRepo;

    @Test
    public void givenACarWhenSavingOnDbElementShouldBeThere() {
        carRepo.save(Car.builder().maker("Mazda").cost(300).color("Red").build());
        assertThat(carRepo.findByMaker("Mazda")).isNotNull();
        assertTrue(true);
    }

}