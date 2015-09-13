import junit.framework.Assert;
import org.junit.Test;


/**
 * Created by SHANE on 2015/09/07.
 */
public class TestNullness {
    @Test
    public void testNull() throws Exception {
        String name="Shane Anil Paulus";
        String empty=null;

        name=empty;
        Assert.assertNull(name);
    }
}
