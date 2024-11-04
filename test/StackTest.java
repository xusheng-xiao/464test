import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StackTest {

    private Stack s;

    @Before
    public void setup() {
        s =  new Stack();
    }

    @Test
    public void testPush(){
        s.push(1);
        Assert.assertEquals(1, s.size());
    }

    @Test(expected = NullPointerException.class)
    public void testException() {
        Stack k = null;
        k.push(0);
    }
}
