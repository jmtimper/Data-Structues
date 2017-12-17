package test;

import main.BSTNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BSTTest {

    @Test
    public void testAddNode(){
        BSTNode root = new BSTNode(10);

        BSTNode child1 = new BSTNode(5);
        BSTNode child2 = new BSTNode(3);
        BSTNode child3 = new BSTNode(7);
        BSTNode child4 = new BSTNode(9);
        BSTNode child5 = new BSTNode(15);
        BSTNode child6 = new BSTNode(19);
        BSTNode child7 = new BSTNode(22);

        root.addNode(child1);
        root.addNode(child2);
        root.addNode(child3);
        root.addNode(child4);
        root.addNode(child5);
        root.addNode(child6);
        root.addNode(child7);

        assertEquals(15,root.getRightNode().getValue());
        assertEquals(19,root.getRightNode().getRightNode().getValue());
        assertEquals(22,root.getRightNode().getRightNode().getRightNode().getValue());
        assertEquals(5,root.getLeftNode().getValue());
        assertEquals(3,root.getLeftNode().getLeftNode().getValue());
        assertEquals(7,root.getLeftNode().getRightNode().getValue());
        assertEquals(9,root.getLeftNode().getRightNode().getRightNode().getValue());

    }

    @Test
    public void testContains(){
        BSTNode root = new BSTNode(10);

        BSTNode child1 = new BSTNode(5);
        BSTNode child2 = new BSTNode(3);
        BSTNode child3 = new BSTNode(7);
        BSTNode child4 = new BSTNode(9);
        BSTNode child5 = new BSTNode(15);
        BSTNode child6 = new BSTNode(19);
        BSTNode child7 = new BSTNode(22);

        root.addNode(child1);
        root.addNode(child2);
        root.addNode(child3);
        root.addNode(child4);
        root.addNode(child5);
        root.addNode(child6);
        root.addNode(child7);

        assertTrue(root.contains(15));
        assertFalse(root.contains(16));
    }
}
