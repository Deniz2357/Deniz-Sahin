package deniz;

import org.junit.Test;

import static org.junit.Assert.*;

public class IcanDoTest {

    @Test
    public void test(){
        IcanDo test = new IcanDo();
        int result = test.addition(5,3);
        assertEquals(4,result);
    }

}