package test;

import org.junit.Assert;
import org.junit.Test;

public class AssertionTest {

    @Test
    public void testAssertEquals() {
        boolean expected = true;
        boolean actual = true;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testAssertTrue() {
        int number = 10;

        Assert.assertTrue(number > 5);
    }

    @Test
    public void testAssertFalse() {
        int number = 3;

        Assert.assertFalse(number > 5);
    }

    @Test
    public void testAssertNotNull() {
        String name = "Sarah";

        Assert.assertNotNull(name);
    }

    @Test
    public void testAssertNull() {
        String name = null;

        Assert.assertNull(name);
    }

    @Test
    public void testAssertSame() {
        String firstName = "Sarah";
        String sameName = firstName;

        Assert.assertSame(firstName, sameName);
    }

    @Test
    public void testAssertNotSame() {
        String firstName = new String("Sarah");
        String secondName = new String("Sarah");

        Assert.assertNotSame(firstName, secondName);
    }

    @Test
    public void testAssertArrayEquals() {
        int[] expectedArray = { 1, 2, 3 };
        int[] resultArray = { 1, 2, 3 };

        Assert.assertArrayEquals(expectedArray, resultArray);
    }
}