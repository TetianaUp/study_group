package tests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static org.testng.Assert.assertEquals;

public class Tests {

    @Test
    public void checkSoftAndHardAsserts(){
        SoftAssert soft = new SoftAssert();
        int one = 1;
        int two = 2;
        int three = 3;
        int four = 4;



        soft.assertEquals(one, three);
        soft.assertTrue(one > two);
        soft.assertTrue(three < four);


        soft.assertAll();
    }
}
