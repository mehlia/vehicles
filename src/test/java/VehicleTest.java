import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class VehicleTest {

    Vehicle vehicle;
    Vehicle car;
    Vehicle train;
    Vehicle plane;
    String driver;


    @BeforeEach
    public void setUp(){
        car = new Train(1000, "Elizabeth Line", true);
        train = new Car(4, 5, 5, "petrol", "ground", "blue", "Toyota", 12000);
        driver = "Mehlia";
    }


    @Test
    public void assignAndGetDriver(){
        car.assignDriver(driver);
        assertThat(car.getDriver()).isEqualTo("Mehlia");

    }

//    @Test
//    car = new Train(1000, "Elizabeth Line", true);
//    train = new Car(4, 5, 5, "petrol", "ground", "blue", "Toyota", 12000);
//    assertThat(car.tflPublic()).isFalse();
//    assertThat(train.tflPublic()).isTrue();

}
