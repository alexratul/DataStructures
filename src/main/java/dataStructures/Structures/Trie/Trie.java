package dataStructures.Structures.Trie;

import dataStructures.Nodes.TrieNode.TrieNode;

public class Trie {

    TrieNode trie;

    public Trie(){
        this.trie = new TrieNode("",true);
    }

    public boolean IsAWord() {
        return this.trie.isAWord();
    }

    public void insertWord(String word){
        TrieNode current = trie;
        for(int index = 0; index < word.length(); index++){

            String letter = word.substring(index,index+1);

            if (trie.containsLetter(word)){
                current = trie.getTable(letter);
            }
            else{
                TrieNode newNode = new TrieNode(letter);
                current.addLetter(letter,newNode);
                current = newNode;

            }
        }
    }

    public boolean checkIfTrieHasWord(String word){

        TrieNode current = trie;
        for(int index = 0; index < word.length(); index++){

            boolean isTrieEmpty = current.checkIfIsEmpty();
            if(isTrieEmpty){
                return false;
            }

            String letter = word.substring(index,index+1);
            boolean checkIfTrieHasTheLetter = current.containsLetter(letter);
            boolean checkIFIsTheLastLetterOnWord = (index + 1) == word.length();

            if (checkIfTrieHasTheLetter){

                if(checkIFIsTheLastLetterOnWord){
                    return  true;
                }
            }
            current = current.getTable(letter);
        }
        return false;
    }




}
