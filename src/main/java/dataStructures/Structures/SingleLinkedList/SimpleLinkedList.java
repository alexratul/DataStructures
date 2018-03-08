package dataStructures.Structures.SingleLinkedList;

import dataStructures.Nodes.SingleListNode.SingleNode;

public class SimpleLinkedList {


    private SingleNode head;
    private SingleNode tail;
    private int listSize;

    /*Getters and setter for the attributes*/
    public SingleNode getHead() {
        return head;
    }

    public void setHead(SingleNode head) {
        this.head = head;
    }

    public SingleNode getTail() {
        return tail;
    }

    public void setTail(SingleNode tail) {
        this.tail = tail;
    }

    public int getLenght() {
        return listSize;
    }

    public void setLenght(int lenght) {
        this.listSize = lenght;
    }



    public SimpleLinkedList ()
    {
        head = tail = null;
        setLenght(0);
    }

    public void insertFirstList(Object data)
    {
        SingleNode newSingleNode = new SingleNode (data);
        newSingleNode.setNext(head);
        head = newSingleNode;
        setLenght(getLenght() + 1);

    }

    public void insertLastlist(Object data)
    {
        if(head == null)
        {
            SingleNode temp = new SingleNode(data);
            setLenght(getLenght() + 1);
            head = temp;
            tail = temp;
        }

        else
        {
            SingleNode temp = new SingleNode(data);
            tail.setNext(temp);
            setLenght(getLenght() + 1);
            tail = temp;
        }
    }

    public void insertAtPosition(int position,Object data) {
        SingleNode current = head;
        int currentLength = getLenght();

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

                    /*create the new SingleNode that is going to be linked*/
                    SingleNode newNextSingleNode = new SingleNode(data);

                    /*point to the previous SingleNode in order to finish the linking between them*/
                    SingleNode newNextNextSingleNode = current.getNext();

                    /*connect the new SingleNode to the old previous next one*/
                     newNextSingleNode.setNext(newNextNextSingleNode);

                     /*connect to the first SingleNode */
                    current.setNext(newNextSingleNode);

                    /*update the length of the list*/
                    setLenght(currentLength + 1);
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
            setLenght(0);
        }
        else {
            SingleNode current = head;
            int currentlength = getLenght();
            for (int index = 0; index < currentlength; index++) {
                if (index + 1 == currentlength) {
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
            setLenght(0);
        }
        else {
            head = head.getNext();
            setLenght(getLenght() - 1);
        }
    }

    public void deleteAtPosition(int position) {
        SingleNode current = head;
        int currentlength = getLenght();

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
                    SingleNode newNextSingleNode = current.getNext().getNext();
                    current.setNext(newNextSingleNode);
                    setLenght(currentlength - 1);
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
        SingleNode current = head;
        for (int index = 0; index < getLenght();index++)
        {   System.out.println(current.getData());
            current = current.getNext();
        }

    }


}
