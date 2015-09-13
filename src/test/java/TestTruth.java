import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by SHANE on 2015/09/07.
 */
public class TestTruth {
    @Test
    public void testTruth() throws Exception {
        String name="Shane",middleName="Shane";
        Assert.assertTrue(name==middleName);
    }
}
