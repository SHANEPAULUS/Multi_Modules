import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by SHANE on 2015/09/07.
 */
public class TestException {
    @Test(expected=Exception.class)
    public void testException() throws Exception {
        Double x=null;
        Double y=2.0;
        Double half=y/x;
        //Assert.assertNull(half);
    }
}
