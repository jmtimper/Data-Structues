package test;

import main.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TreeTest {

    @Test
    public void testTree(){
        TreeNode root = new TreeNode("root");

        TreeNode child1 = new TreeNode("word1");
        TreeNode child2 = new TreeNode("word2");
        TreeNode child3 = new TreeNode("word3");
        TreeNode child4 = new TreeNode("word4");

        root.addChild(child1);
        child1.addChild(child2);
        child1.addChild(child3);
        child2.addChild(child4);

        assertEquals("root{word1{word2{word4}word3}}", root.toString());
    }
}
