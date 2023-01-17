import com.algo.StringReversor;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StringReversorTest {

    StringReversor stringReversor;
    @Before
    public void setUp(){
        stringReversor = new StringReversor();
    }

    @Test
    public void whenStringIsEmpty(){
        Assert.assertEquals("",stringReversor.reversalMethod(""));
    }
    @Test
    public void givenString_ReverseString_ReturnString(){
        Assert.assertEquals( "World Hello",stringReversor.reversalMethod("Hello World"));
    }
}
