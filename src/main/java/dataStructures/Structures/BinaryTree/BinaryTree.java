package dataStructures.Structures.BinaryTree;

import dataStructures.Nodes.BinaryTreeNode.BinaryTreeNode;

public class BinaryTree {

    BinaryTreeNode Head;

    public BinaryTreeNode getHead() {
        return Head;
    }

    public void setHead(BinaryTreeNode head) {
        Head = head;
    }

    /***
     * THe insertion method for this binary tree
     * @param data the data or number that is going to be store on the tree
     */
    public void insertNode_Iterative(Object data)
    {

        /*if the tree is empty create the head node*/
        if (getHead() == null)
        {
            setHead(new BinaryTreeNode(data));
        }
        else
        {
            BinaryTreeNode newnode = new BinaryTreeNode(data);


            while(true)
            {
                BinaryTreeNode current = getHead();
                /*Transform the object type into the int type*/
                int headNumber = (int) current.getData();
                int dataNumber = (int) newnode.getData();

                /*go to the left*/
                if (dataNumber < headNumber)
                {
                    current = current.getLeftSide();

                    /*Add the node to the left side of the tree*/
                    if(current == null)
                    {
                        current.setLeftSide(newnode);
                        return;
                    }

                }

                else
                {
                    current = current.getRightSide();

                    /*Add the node to the right side of the tree*/
                    if(current == null)
                    {
                        current.setRightSide(newnode);
                        return;
                    }
                }




            }


        }


    }

    /***
     * The constuctor of the Binary tree class
     */

    public BinaryTree()
    {
        setHead(null);

    }






}
