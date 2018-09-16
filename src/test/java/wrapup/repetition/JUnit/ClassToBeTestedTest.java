package wrapup.repetition.JUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class ClassToBeTestedTest extends ClassToBeTested {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void add_Test() {
        int a = 171;
        int b = 3560;
        int c = 3731;
        assertTrue(c == add(a, b));
    }

    @Test
    public void add_Test2() {
        int a = 0;
        int b = 0;
        int c = 0;
        assertTrue("zero to zero", c == add(a, b));  //komunikat przy błędzie
    }

    @Test
    @Ignore
    public void add_Test3() {
        int a = -3;
        int b = -4;
        int c = -7;
        assertTrue(c == add(a, b));
    }

    @Test(expected = StackOverflowError.class)
    public void add_Test4() {
        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE;
        int c = Integer.MAX_VALUE + Integer.MAX_VALUE;
        assertTrue(c == add(a, b));
    }

    @Test
    @Ignore
    public void add_Test5() {
        int a = 5;
        int b = -4;
        int c = 1;
        assertTrue(c == add(a, b));
    }
    @Test
    public void add_Test6() {
        int a = -5;
        int b = 4;
        int c = -1;
        assertTrue(c == add(a, b));
    }

    @Test
    public void factorial_Test() {
        int a = 4;
        int b = 24;
        assertEquals(factorial(a), b);
    }
    @Test (expected = IllegalArgumentException.class)
    public void factorial_Test2() {
        int a = -1;
        int b = 24;
        assertEquals(factorial(a), b);
    }

    @Test
    public void toBinary_Test() {
    }
    @Test
    public void sampleTest(){

    }
}