import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class PlaneTest {

    Plane plane;

    @BeforeEach
    public void setUp(){
        plane = new Plane(900, "Emirates", 500);
    }

//    tests if airmiles are more than 1000, gets discounted price on ticket
    @Test
    public void discountedTicket(){
        double discountedTicket = plane.discountedTicket(1200);
        assertThat(discountedTicket).isEqualTo(450);
    }

}
