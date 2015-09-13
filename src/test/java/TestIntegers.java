import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by SHANE on 2015/09/07.
 */
public class TestIntegers {
    @Test
    public void testInt() throws Exception {
        int x=5,y=7,z=9;
        int sum=x+y+z;

        Assert.assertEquals(x+y+z,sum);
    }
}
