package tests.trie;

import dataStructures.Structures.Trie.Trie;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TrieTests {

    private Trie trie;

    @BeforeEach
    public void setup(){
        trie = new Trie();
    }

    @Test
    @DisplayName("Simple check that if the empty word is a valid word")
    public void testIsAWord(){
        assertTrue(this.trie.IsAWord());
    }

    @Test
    @DisplayName("Simple check that trie inserts a word on it")
    public void testInsertWordOnTrie(){
        String word = "ale";
        trie.insertWord(word);
        assertTrue(trie.checkIfTrieHasWord(word));
    }

    @Test
    @DisplayName("Simple check of negative result on trie")
    public void testNegativeResultOnTrie(){
        String expetedWord = "alex";
        String word = "ale";

        trie = new Trie();
        trie.insertWord(word);
        assertFalse(trie.checkIfTrieHasWord(expetedWord));
    }

    @Test
    @DisplayName("Simple check of negative result on a empty trie")
    public void testNegativeResultOnTrieWithEmptyTrie(){
        String expetedWord = "alex";

        trie = new Trie();
        assertFalse(trie.checkIfTrieHasWord(expetedWord));
    }

}
