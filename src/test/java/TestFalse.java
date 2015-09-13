import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by SHANE on 2015/09/07.
 */
public class TestFalse {
    @Test
    public void testFalse() throws Exception {
        Long studentNumber=2130562573L;
        Long persalNumber=2534256273L;

        Assert.assertFalse(studentNumber==persalNumber);
    }
}
