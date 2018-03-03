package tests;

import dataStructures.Structures.lists.simpleList;

public class testStructures {

    public static void main(String[] args) {
        simpleList list = new simpleList();

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

        list.deleteAtPosition(1);

        list.printList();

    }
}
