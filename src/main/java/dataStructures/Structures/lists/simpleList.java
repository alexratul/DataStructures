package dataStructures.Structures.lists;
import dataStructures.Nodes.listNodes.node;


public class simpleList {


    private node head;
    private node tail;
    private int lenght;

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
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
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

    public void deleteLastList()
    {
        if (head.getNext() == null)
        {
            head =tail = null;
            setLenght(0);
        }
        else {
            node current = head;

            for (int index = 0; index < lenght; index++) {
                if (index + 1 == lenght) {
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
        if (position == 0)
        {
            head = current.getNext();   // Change head
            return;
        }
        for (int index = 0; current != null && index < currentlength - 1;index++)
        {
            if (current == null || current.getNext() == null)
            {
                return;
            }
            node next = current.getNext().getNext();
            current.setNext(next);
        }
      setLenght(currentlength - 1);
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
