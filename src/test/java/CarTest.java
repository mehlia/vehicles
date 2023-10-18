import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CarTest {

    Car car;

    @BeforeEach
    public void setUp(){
        car = new Car(4, 5, 5,"petrol", "ground", "black", "Mercedes-Benz", 54000);
    }

    @Test
    public void addFuel(){
        assertThat(car.getFuelType()).isEqualTo("petrol");
    }

    @Test
    public void addMakeOfCar(){
        String result = car.addMake("Mercedes-Benz");
        assertThat(result).isEqualTo("The make of this car is Mercedes-Benz and is worth £54000.0");
    }


}
