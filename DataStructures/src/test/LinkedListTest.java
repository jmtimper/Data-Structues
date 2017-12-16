package test;

import main.LinkedList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LinkedListTest {

    @Test
    public void testAddLast(){
        LinkedList list = new LinkedList();
        list.addLast("word1");
        list.addLast("word2");
        list.addLast("word3");
        assertEquals("word1, word2, word3", list.toString());
    }

    @Test
    public void testAddAt(){
        LinkedList list = new LinkedList();
        list.addLast("word1");
        list.addLast("word2");
        list.addLast("word3");
        assertEquals("word1, word2, word3", list.toString());
        list.addAt("word4", 1);
        assertEquals("word1, word4, word2, word3", list.toString());
        list.addAt("word5", 69);
        assertEquals("word1, word4, word2, word3, word5", list.toString());
    }

    @Test
    public void testDelete(){
        LinkedList list = new LinkedList();
        list.addLast("word1");
        list.addLast("word2");
        list.addLast("word3");
        assertEquals("word1, word2, word3", list.toString());
        list.delete("word2");
        assertEquals("word1, word3", list.toString());
        list.delete("word2");
        assertEquals("word1, word3", list.toString());
        assertEquals(2, list.size());
    }
}
