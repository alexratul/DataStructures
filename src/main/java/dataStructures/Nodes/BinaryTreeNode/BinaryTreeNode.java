package dataStructures.Nodes.BinaryTreeNode;

public class BinaryTreeNode {

    Object data;
    BinaryTreeNode leftSide;
    BinaryTreeNode rightSide;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public BinaryTreeNode getLeftSide() {
        return leftSide;
    }

    public void setLeftSide(BinaryTreeNode leftSide) {
        this.leftSide = leftSide;
    }

    public BinaryTreeNode getRightSide() {
        return rightSide;
    }

    public void setRightSide(BinaryTreeNode rightSide) {
        this.rightSide = rightSide;
    }



    public BinaryTreeNode(Object data, BinaryTreeNode leftSide, BinaryTreeNode rightSide) {
        this.data = data;
        this.leftSide = leftSide;
        this.rightSide = rightSide;
    }

    public BinaryTreeNode(Object data) {
        this.data = data;
        this.leftSide = null;
        this.rightSide = null;
    }

    public BinaryTreeNode() {
        this.data = null;
        this.leftSide = null;
        this.rightSide = null;
    }
}
