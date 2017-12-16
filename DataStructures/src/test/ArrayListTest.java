package test;

import main.ArrayList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class ArrayListTest {

    @Test
    public void testAdd(){
        ArrayList test1 = new ArrayList();
        test1.add("word1");
        test1.add("word2");
        test1.add("word3");
        test1.add("word4");
        assertEquals("word3", test1.getAt(2));
        assertEquals(test1.size(), 4);
    }

    @Test
    public void testToArray(){
        ArrayList test1 = new ArrayList();
        test1.add("word1");
        test1.add("word2");
        test1.add("word3");
        test1.add("word4");
        assertEquals("word1", test1.toArray()[0]);
        assertEquals("word2", test1.toArray()[1]);
        assertEquals("word3", test1.toArray()[2]);
        assertEquals("word4", test1.toArray()[3]);
    }

    @Test
    public void testMoreSpace(){
        ArrayList test1 = new ArrayList();
        test1.add("word1");
        test1.add("word2");
        test1.add("word3");
        test1.add("word4");
        test1.add("word5");
        test1.add("word6");
        assertEquals("word6", test1.getAt(5));
        assertEquals(test1.size(), 6);
    }

    @Test
    public void testRemove(){
        ArrayList test1 = new ArrayList();
        test1.add("word1");
        test1.add("word2");
        test1.add("word3");
        test1.add("word4");
        test1.add("word5");
        test1.add("word6");
        test1.remove("word5");
        assertEquals(test1.size(), 5);
        assertEquals("word4", test1.getAt(3));
        assertEquals("word6", test1.getAt(4));
        assertNull(test1.getAt(5));
    }

    @Test
    public void testTrim(){
        ArrayList test1 = new ArrayList();
        test1.add("word1");
        test1.add("word2");
        test1.add("word3");
        test1.add("word4");
        test1.add("word5");
        test1.add("word6");
        test1.trim();
        assertEquals(6, test1.size());
    }

    @Test
    public void testContains(){
        ArrayList test1 = new ArrayList();
        test1.add("word1");
        test1.add("word2");
        test1.add("word3");
        test1.add("word4");
        test1.add("word5");
        test1.add("word6");
        assertTrue(test1.contains("word4"));
        assertFalse(test1.contains("word7"));
    }

}
