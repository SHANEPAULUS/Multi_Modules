/**
 * Created by SHANE on 2015/09/07.
 */
import org.junit.*;
public class FailingTest {

    @Test
    public void testFail() throws Exception {
        long number=1L;
        Assert.assertNull(number);
    }
}
