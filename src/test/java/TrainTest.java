import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TrainTest {

    Train train;

    @BeforeEach
    public void setUp(){
        train = new Train(1000, "District Line", true);
    }

    @Test
    public void addTrainLine(){
        String result = train.addTrainLine("Elizabeth Line");
        assertThat(result).isEqualTo("TFL are adding a new trainline in 2022: Elizabeth Line");
    }

    @Test
    public void checkDoorsStatus(){
        String trainOpen = "PlEASE MIND THE GAP!";
        assertThat(trainOpen.checkDoorStatus()).isEqualTo("PLEASE MIND THE GAP!");
    }

}
