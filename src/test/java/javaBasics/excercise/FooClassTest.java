package javaBasics.excercise;

import org.junit.Test;

import static org.junit.Assert.*;

public class FooClassTest {
    @Test
    public void intToBinaryStringTest1() {
        FooClass fooClass = new FooClass();
        assertEquals("100000", fooClass.intToBinaryString(32));
    }

    @Test
    public void intToBinaryStringTest2() {
        FooClass fooClass = new FooClass();
        assertEquals("0", fooClass.intToBinaryString(0));
    }

    @Test
    public void intToBinaryStringTest3() {
        FooClass fooClass = new FooClass();
        for (int i = 0; i < 100; i++) {
            assertEquals(Integer.toBinaryString(i), fooClass.intToBinaryString(i));
        }
    }

    @Test
    public void intToBinaryStringTest4() {
        FooClass fooClass = new FooClass();
        assertEquals(Integer.toBinaryString(Integer.MAX_VALUE), fooClass.intToBinaryString(Integer.MAX_VALUE));

    }
}
