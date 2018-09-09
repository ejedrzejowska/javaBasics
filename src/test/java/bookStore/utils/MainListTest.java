package bookStore.utils;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainListTest {
    private String[] table;
    private String testString = "Test String";

    @Before
    public void createList(){
        table = new String[1];
        table[0] = testString;
        System.out.println("Uruchamiam before");
    }

    @Test
    public void addTest(){
        MainList<String> mainList = new MainList<>();
        mainList.add(testString);
        assertArrayEquals(table, mainList.getTable());
    }

//    @Test
//    public void checkSizeAfterIncrease(){
//        MainList<String> mainList = new MainList<>();
//        mainList.add(testString);
//        mainList.add(testString);
//        mainList.add(testString);
//        assertEquals(3, mainList.getTable().length);
//    }

    @After
    public void emptyList(){
        table = new String[0];
        System.out.println("Uruchamiam after");
    }


}