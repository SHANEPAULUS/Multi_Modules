import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SHANE on 2015/09/07.
 */
public class TestExceptionTimeOut {

    @Test(timeout=100)
    public void testTimeOut() throws Exception {
        List<Double> salaries=new ArrayList<Double>();
        salaries.add(2500.00);
        salaries.add(3000.00);
        salaries.add(6000.00);
        salaries.add(250000.00);
    }
}
