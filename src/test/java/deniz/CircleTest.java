package deniz;

import deniz.Circle;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

public class CircleTest {

    @Test
    public void shouldHaveFourCorners(){
        //given
        Circle circle = new Circle();

        //expect
        Assertions.assertEquals(0,circle.getNumberOfVertices());

    }

    @Test
    public void shouldConsistOfFourSides(){
        //given
        Circle circle = new Circle();

        //expect
        Assertions.assertEquals(0,circle.getNumberofEdges());

    }

}