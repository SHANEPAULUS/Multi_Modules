import junit.framework.Assert;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by SHANE on 2015/09/07.
 */
public class TestArraysContent {

    @Test
    public void testArrays() throws Exception {
        ArrayList<String> names=new ArrayList<String>();
        ArrayList<String> surnames=new ArrayList<String>();

        names.add("Shane");
        names.add("John");
        names.add("Anil");

        surnames.add("Shane");
        surnames.add("John");
        surnames.add("Anil");

        Assert.assertEquals(names.size(),surnames.size());
        Assert.assertEquals(names,surnames);
    }
}
