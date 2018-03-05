package tests;

import dataStructures.Structures.lists.SimpleLinkedList;

public class testStructures {

    public static void main(String[] args) {

        SimpleLinkedList list = new SimpleLinkedList();

        /*Add elements to the list*/
        list.insertLastlist(1);
        list.insertLastlist(2);
        list.insertLastlist(3);

        /*
        list.insertLastlist(4);
        list.insertLastlist(5);
        list.insertLastlist(6);
        */

        /**/
        //list.printList();

        //list.deleteAtPosition(1);
        list.insertAtPosition(1,666);

        list.printList();



    }
}
