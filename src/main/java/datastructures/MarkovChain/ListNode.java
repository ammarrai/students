package datastructures.MarkovChain;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ListNode {

    String word;
    List<String> nextWords;


    ListNode(String word) {

        this.word = word;
        nextWords = new LinkedList<String>();
    }

    public void addNextWord(String nextWord) {

        nextWords.add(nextWord);
    }

    public String getRandomNextWord(Random generator) {
        return null;
    }


    public String toString() {
        String toReturn = word + ": ";
        for (String s : nextWords) {
            toReturn += s + "->";
        }
        toReturn += "\n";
        return toReturn;
    }


    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public List<String> getNextWords() {
        return nextWords;
    }

    public void setNextWords(List<String> nextWords) {
        this.nextWords = nextWords;
    }

}
