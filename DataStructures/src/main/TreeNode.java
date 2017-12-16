package main;

import java.util.ArrayList;

public class TreeNode {

    //data object
    Object data;

    //children of node
    ArrayList<TreeNode> children;

    //parent of node
    TreeNode parent;

    /**
     * contructor with no parameters
     */
    public TreeNode(){
        children = new ArrayList<TreeNode>();
    }

    /**
     * constructor with data passed through
     * @param val data for tree
     */
    public TreeNode(Object val){
        data = val;
        children = new ArrayList<TreeNode>();
        parent = null;
    }

    /**
     * adds child treenode
     * @param child Treenode
     */
    public void addChild(TreeNode child){
        children.add(child);
    }

    /**
     * searches for child with parameter data
     * @param val data in treenode
     * @return Treenode with that data or null if it doesn't exist
     */
    public TreeNode findChild(Object val){
        for(TreeNode i : children){
            if(i.data == val) return i;
        }
        return null;
    }

    /**
     * return children of node
     * @return ArrayList of Treenodes
     */
    public ArrayList<TreeNode> getChildren(){
        return children;
    }

    /**
     * sets parent node
     * @param par TreeNode parent
     */
    public void setParent(TreeNode par){
        parent = par;
    }

    /**
     * returns node's parent
     * @return TreeNode parent
     */
    public TreeNode getParent(){
        return parent;
    }

    /**
     * prints out treenodes and parents
     * @return String of all nodes
     */
    public String toString(){
        String temp = data.toString();
        if(children.size() != 0) {
            temp += "{";
            for (TreeNode i : children) {
                temp += i.toString();
            }
            temp += "}";
        }
        return temp;
    }
}
