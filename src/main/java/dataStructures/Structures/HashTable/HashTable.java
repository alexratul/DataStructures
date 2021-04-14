package dataStructures.Structures.HashTable;

public class HashTable {

    int[] keys;
    Object[] values;
    int size;
    int space;
    int squareIndex = 1;

    public HashTable(int size){
        this.size = size;
        this.space = size;

        keys = new int[size * size];
        values = new Object[size * size];
    }

    public boolean hasSpace() {
     return space != 0;
    }

    public boolean isEmpty(){
        return space == size;
    }

    public boolean containsKey(){
        return true;
    }

    public Object get(int key){
        return null;
    }

    public void put(int key, Object value){
        int keyIndex = hashFunction();
        keys[keyIndex] = key;
        values[keyIndex] = value;
        space--;
    }

    public void removeKey(Object key){

        space++;
    }

    private int hashFunction(){
        int hashedIndex = 0;
        while(this.keys[hashedIndex] != 0){
            hashedIndex += Math.pow(squareIndex,2);
            squareIndex++;
        }
        return hashedIndex;
    }

    private boolean isFull(){
        return space == 0;
    }


}
