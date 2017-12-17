package main;

/**
 * Binary Search Tree Node
 */
public class BSTNode {

    //value on node
    int value;
    //right node greater than
    BSTNode rightNode;
    //left node less than
    BSTNode leftNode;

    public BSTNode(int val) {
        value = val;
    }

    /**
     * adds node to binary tree
     * @param node to be added
     */
    public void addNode(BSTNode node){
        if(node.value == value) return;
        else if(node.value > value){
            if(rightNode == null) rightNode = node;
            else rightNode.addNode(node);
        } else {
            if(leftNode == null) leftNode = node;
            else leftNode.addNode(node);
        }
    }

    /**
     * searches for if a node is in the tree
     * @param val int value
     * @return true if exists in tree
     */
    public boolean contains(int val){
        if(val > value){
            if(rightNode == null) return false;
            else return rightNode.contains(val);
        } else if (val < value) {
            if(leftNode == null) return false;
            else return leftNode.contains(val);
        }
        return true;
    }

    /**
     * gets value of node
     * @return value
     */
    public int getValue(){
        return value;
    }

    /**
     * gets rightnode
     * @return rightnode
     */
    public BSTNode getRightNode(){
        return rightNode;
    }

    /**
     * gets leftNode
     * @return leftnode
     */
    public BSTNode getLeftNode() {
        return leftNode;
    }
}
