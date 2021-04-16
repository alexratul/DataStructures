package tests.hashtable;

import dataStructures.Structures.HashTable.HashTable;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class hashTests {

    HashTable hashTable;

    @BeforeEach
    public void setup(){
        hashTable = new HashTable(4);
    }

    @Test
    @DisplayName("Simple check that hash is empty")
    public void testIsEmptyTheHashTable(){
        assertTrue(hashTable.isEmpty());
    }

    @Test
    @DisplayName("Simple check that hash is not empty")
    public void testIsNotEmptyTheHashTable(){
        HashTable hashTable2 = new HashTable(1);
        hashTable2.put(0,null);
        assertFalse(hashTable2.hasSpace());
    }

    @Test
    @DisplayName("Simple check that hash some elements on it without collision")
    public void testInsertOnTheHashTable(){
        hashTable.put(1,"abc");
        hashTable.put(2,"abce");
        hashTable.put(3,"abcd");
        assertTrue(hashTable.hasSpace());
    }

    @Test
    @DisplayName("Test the isFull function")
    public void  testIsFullFuntionOnHashTable(){
        hashTable = new HashTable(4);
        hashTable.put(1,"abc");
        hashTable.put(2,"abce");
        hashTable.put(3,"abcd");
        hashTable.put(4,"Terran op");
        assertTrue(hashTable.isFull());
    }

    @Test
    @DisplayName("test the get on the hashtable")
    public void testGetOnHashTable() {
        hashTable = new HashTable(4);
        hashTable.put(4,"Terran op");
        assertEquals(hashTable.get(4) , "Terran op");
    }


}
