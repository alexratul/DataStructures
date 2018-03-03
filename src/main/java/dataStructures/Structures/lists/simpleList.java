package dataStructures.Structures.lists;
import dataStructures.Nodes.listNodes.node;


public class simpleList {


    private node head;
    private node tail;
    private int listSize;

    /*Getters and setter for the attributes*/
    public node getHead() {
        return head;
    }

    public void setHead(node head) {
        this.head = head;
    }

    public node getTail() {
        return tail;
    }

    public void setTail(node tail) {
        this.tail = tail;
    }

    public int getLenght() {
        return listSize;
    }

    public void setLenght(int lenght) {
        this.listSize = lenght;
    }



    public simpleList()
    {
        head = tail = null;
        setLenght(0);
    }

    public void insertFirstList(Object data)
    {
        node newNode = new node (data);
        newNode.setNext(head);
        head = newNode;
        setLenght(getLenght() + 1);

    }

    public void insertLastlist(Object data)
    {
        if(head == null)
        {
            node temp = new node(data);
            setLenght(getLenght() + 1);
            head = temp;
            tail = temp;
        }

        else
        {
            node temp = new node(data);
            tail.setNext(temp);
            setLenght(getLenght() + 1);
            tail = temp;
        }
    }

    public void insertAtPosition(int position,Object data) {
        node current = head;
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

                    /*create the new node that is going to be linked*/
                    node newNextNode = new node(data);

                    /*point to the previous node in order to finish the linking between them*/
                    node newNextNextNode = current.getNext();

                    /*connect the new node to the old previous next one*/
                     newNextNode.setNext(newNextNextNode);

                     /*connect to the first node */
                    current.setNext(newNextNode);

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
            node current = head;
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
        node current = head;
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
                    node newNextNode = current.getNext().getNext();
                    current.setNext(newNextNode);
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
        node current = head;
        for (int index = 0; index < getLenght();index++)
        {   System.out.println(current.getData());
            current = current.getNext();
        }

    }


}
