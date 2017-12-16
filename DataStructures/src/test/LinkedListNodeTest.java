package test;

import main.LinkedListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LinkedListNodeTest {

    @Test
    public void testCreateList(){
        LinkedListNode head = new LinkedListNode("word1");
        LinkedListNode node1 = new LinkedListNode("word2");
        head.setNext(node1);
        assertEquals("word1, word2", head.toString());
    }

    @Test
    public void testInsert(){
        LinkedListNode node1 = new LinkedListNode("word2");
        LinkedListNode head = new LinkedListNode("word1", node1);
        assertEquals("word1, word2", head.toString());
        LinkedListNode node2 = new LinkedListNode("word3");
        head.setNext(node2);
        node2.setNext(node1);
        assertEquals("word1, word3, word2", head.toString());
    }

    @Test
    public void testDelete(){
        LinkedListNode node1 = new LinkedListNode("word2");
        LinkedListNode head = new LinkedListNode("word1", node1);
        LinkedListNode node2 = new LinkedListNode("word3");
        node1.setNext(node2);
        assertEquals("word1, word2, word3", head.toString());
        head.setNext(node2);
        node1.delete();
        assertEquals("word1, word3", head.toString());
    }
}
