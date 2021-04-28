package tests.trie;

import dataStructures.Structures.Trie.Trie;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TrieTests {

    private Trie trie;
    String word;
    String expectedWord;
    String anotherExpectedWord;

    @BeforeEach
    public void setup(){
        word = "ale";
        expectedWord = "alex";
        anotherExpectedWord = "Terran";
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
        trie.insertWord(word);
        assertTrue(trie.checkIfTrieHasWord(word));
    }

    @Test
    @DisplayName("Simple check of negative result on trie")
    public void testNegativeResultOnTrie(){
        assertFalse(trie.checkIfTrieHasWord(expectedWord));
    }

    @Test
    @DisplayName("Simple check of negative result on a empty trie")
    public void testNegativeResultOnTrieWithEmptyTrie(){
        Trie emptyTrie = new Trie();
        assertFalse(emptyTrie .checkIfTrieHasWord(expectedWord));
    }

    @Test
    @DisplayName("Simple check of positive result on a trie with 2 words")
    public void testTwoWordsOnTrie(){
        trie.insertWord(word);
        trie.insertWord(expectedWord);

        assertTrue(trie.checkIfTrieHasWord(word));
        assertTrue(trie.checkIfTrieHasWord(expectedWord));
    }

    @Test
    @DisplayName("Simple check of positive result on a trie with 3 words")
    public void testThreeWordsOnTrie(){
        trie.insertWord(word);
        trie.insertWord(anotherExpectedWord);
        trie.insertWord(expectedWord);

        assertTrue(trie.checkIfTrieHasWord(word));
        assertTrue(trie.checkIfTrieHasWord(expectedWord));
        assertTrue(trie.checkIfTrieHasWord(anotherExpectedWord));
    }
}
