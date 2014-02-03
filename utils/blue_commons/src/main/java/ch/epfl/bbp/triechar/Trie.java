package ch.epfl.bbp.triechar;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * Trie implementation to store strings (multiple occurences allowed) and retrieve the
 * frequency (count) of a word.
 * 
 * @author renaud.richardet@epfl.ch
 */
public class Trie {

    private TrieNode root;
    private boolean caseSensitive;

    public Trie() {
        this(false);
    }

    public Trie(boolean caseSensitive) {
        this.caseSensitive = caseSensitive;
        root = new TrieNode();
    }

    public void addWord(String word) {
        if (!caseSensitive)
            word = word.toLowerCase();
        root.addWord(word.toCharArray());
    }

    /** @return the frequency of that word in the trie */
    public int getWord(String word) {
        if (!caseSensitive)
            word = word.toLowerCase();
        return root.getWord(word.toCharArray());
    }

    /** one entry per line. word first, then tab, then frequency */
    public void toFrequencyFile(String filePath) throws IOException {
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream(filePath), "UTF-8"));
        for (TrieNode child : root.children.values()) {
            child.writeFrequencies(writer, new char[0]);// recursive
        }
        writer.close();
    }
}