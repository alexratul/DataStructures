package dataStructures.Nodes.TrieNode;

import java.util.Hashtable;

public class TrieNode {

    String letter;
    boolean isAWord;
    Hashtable<String,TrieNode> table;

    public TrieNode(String letter){
        this.letter = letter;
        this.table = new Hashtable<>();
        this.isAWord = false;
    }

    public TrieNode(String letter, boolean isAWord){
        this.letter = letter;
        table = new Hashtable<>();
        this.isAWord = isAWord;
    }

    public boolean isAWord(){
        return isAWord;
    }

    public boolean containsLetter(String letter){
        return table.containsKey(letter);
    }

    public TrieNode getTable(String letter){
        if(table.containsKey(letter)){
            return table.get(letter);
        }
        return null;
    }

    public void changeWordStatus(boolean b) {
        this.isAWord = b;
    }

    public void addLetter(String letter, TrieNode newNode) {
        table.put(letter,newNode);
    }

    public boolean checkIfIsEmpty() {
        return table.size() == 0;
    }
}
