package tests.trie;

import dataStructures.Structures.Trie.Trie;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TrieTests {

    private Trie trie;

    @BeforeEach
    public void setup(){
        trie = new Trie();
    }

    @Test
    @DisplayName("Simple check that hash is empty")
    public void testIsAWord(){
        assertTrue(this.trie.IsAWord());
    }

    @Test
    @DisplayName("Simple check that hash is empty")
    public void testInsertWordOnTrie(){
        String word = "ale";

        trie.insertWord(word);
        assertTrue(trie.checkIfTrieHasWord(word));
    }

}
