import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by SHANE on 2015/09/07.
 */
public class TestObjectEquality {
    @Test
    public void testObject() throws Exception {
        Object x=new Object();
        Object y=x;

        Assert.assertSame(x,y);
    }
}
