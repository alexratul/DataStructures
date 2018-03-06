package dataStructures.Structures.doubleLinkedlists;
import dataStructures.Nodes.doubleNode.DoubleLinkedNode;

public class DoubleLinkedList {

    DoubleLinkedNode head;
    DoubleLinkedNode tail;
    int listSize;


    public DoubleLinkedNode getHead() {
        return head;
    }

    public void setHead(DoubleLinkedNode head) {
        this.head = head;
    }

    public DoubleLinkedNode getTail() {
        return tail;
    }

    public void setTail(DoubleLinkedNode tail) {
        this.tail = tail;
    }

    public int getListSize() {
        return listSize;
    }

    public void setListSize(int listSize) {
        this.listSize = listSize;
    }


    public void insertFirstList(Object data)
    {
        if(head == null)
        {
            DoubleLinkedNode temp = new DoubleLinkedNode(data);
            setListSize(getListSize() + 1);
            head = temp;
            tail = temp;
        }
        else
        {
            DoubleLinkedNode newDoubleLinkedNode = new DoubleLinkedNode(data);
            newDoubleLinkedNode.setNext(head);
            newDoubleLinkedNode.setPrevious(null);
            head = newDoubleLinkedNode;
            setListSize(getListSize() + 1);
        }

    }

    public void insertLastlist(Object data)
    {
        if(head == null)
        {
            DoubleLinkedNode temp = new DoubleLinkedNode(data);
            setListSize(getListSize() + 1);
            head = temp;
            tail = temp;
        }

        else
        {
            DoubleLinkedNode temp = new DoubleLinkedNode(data);
            tail.setNext(temp);
            temp.setPrevious(tail);
            setListSize(getListSize() + 1);
            tail = temp;
        }
    }

    public void insertAtPosition(int position,Object data) {
        DoubleLinkedNode current = head;
        int currentLength = getListSize();

        // If linked list is empty
        if (head == null)
            return;

            // If head needs to be added
        else if (position == 0)
        {
            insertFirstList(data);
        }

        // If tails needs to be added
        else if (position + 1 ==  currentLength)
        {
            insertLastlist(data);
        }

        else {

            for (int index = 0; current != null && index < currentLength - 1; index++) {

                if (index + 1 == position) {

                    /*create the new DoubleLinkedNode that is going to be linked*/
                    DoubleLinkedNode newNextDoubleLinkedNode = new DoubleLinkedNode(data);

                    /*Grab the previous next node in order to link the new node with the previous next node*/
                    DoubleLinkedNode oldNextDoubleLinkedNode = current.getNext();


                    /*Linking the new node with the rest of the list*/

                    /*link the new next node with the old node*/
                    newNextDoubleLinkedNode.setNext(oldNextDoubleLinkedNode);

                    /*link the older node with the the new node as a previous one for him */
                    oldNextDoubleLinkedNode.setPrevious(newNextDoubleLinkedNode);


                    /*Link the first part of the list with the new node*/

                    /*Link the new node with the current node of the list*/
                    current.setNext(newNextDoubleLinkedNode);

                    /*create the link for the previous link for the new node*/
                    newNextDoubleLinkedNode.setPrevious(current);


                    /*update the length of the list*/
                    setListSize(currentLength + 1);
                    return;
                }
                else {
                    current=current.getNext();
                }
            }
        }

    }


    public void deleteLastList()
    {
        if (head.getNext() == null)
        {
            head =tail = null;
            setListSize(0);
        }
        else {
            DoubleLinkedNode current = head;
            int currentLength = getListSize();
            for (int index = 0; index < currentLength; index++) {
                if (index + 1 == currentLength) {
                    /*set the previous to null*/
                    current.getNext().setPrevious(null);
                    /*set null to the new next*/
                    current.setNext(null);
                    tail = current;

                }
                else{
                    current = current.getNext();
                }
            }
        }
    }

    public void deleteFistList()
    {

        if (head.getNext() == null)
        {
            head =tail = null;
            setListSize(0);
        }
        else {
            head = head.getNext();
            head.setPrevious(null);
            setListSize(getListSize() - 1);
        }
    }

    public void deleteAtPosition(int position) {
        DoubleLinkedNode current = head;
        int currentlength = getListSize();

        // If linked list is empty
        if (head == null)
            return;

            // If head needs to be removed
        else if (position == 0)
        {
            deleteFistList();
        }

        // If head needs to be removed
        else if (position + 1 ==  currentlength)
        {
            deleteLastList();
        }

        else {

            for (int index = 0; current != null && index < currentlength - 1; index++) {

                if (index + 1 == position) {
                    /*Grab that the node that is going to be next node*/
                    DoubleLinkedNode newNextDoubleLinkedNode = current.getNext().getNext();
                    /*Set the new link for the new next node*/
                    current.setNext(newNextDoubleLinkedNode);
                    /*Create the link for the new previous node*/
                    newNextDoubleLinkedNode.setPrevious(current);
                    setListSize(currentlength - 1);
                    return;
                }
                else {
                    current=current.getNext();
                }
            }
        }

    }

    public void printList()
    {
        DoubleLinkedNode current = head;
        for (int index = 0; index < getListSize();index++)
        {   System.out.println(current.getData());
            current = current.getNext();
        }

    }    
    
    

    /**  
     *  Constructor of the Double linked list
     */

    public DoubleLinkedList()
    {
        setHead(null);
        setTail(null);
        setListSize(0);
    }




}
