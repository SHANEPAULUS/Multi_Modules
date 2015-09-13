import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by SHANE on 2015/09/07.
 */
public class TestFloatingPoint {
    @Test
    public void testFloat() throws Exception {
        Float divider=1.6F;
        Float km=120.0F;
        Float miles=km/divider;

        Assert.assertEquals(miles*divider,km);
    }
}
