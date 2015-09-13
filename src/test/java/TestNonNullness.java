import org.junit.Assert;
import org.junit.Test;

/**
 * Created by SHANE on 2015/09/07.
 */
public class TestNonNullness {
    @Test
    public void testNotNull() throws Exception {
        int year=2015,now;
        now=year;

        Assert.assertNotNull(now);
    }
}
