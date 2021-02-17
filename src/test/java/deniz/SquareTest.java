package deniz;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

public class SquareTest {
    @Test
    public void shouldHaveFourCorners(){
        //given
        Square square = new Square();

        //expect
        Assertions.assertEquals(4,square.getNumberOfVertices());

    }

    @Test
    public void shouldConsistOfFourSides(){
        //given
        Square square = new Square();

        //expect
        Assertions.assertEquals(4,square.getNumberofEdges());

    }

}