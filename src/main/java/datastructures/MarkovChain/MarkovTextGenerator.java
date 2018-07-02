package datastructures.MarkovChain;

import java.util.*;

public class MarkovTextGenerator {

    private Random rnGenerator;
    private String starter;
    private List<ListNode> wordList;



    MarkovTextGenerator(Random generator) {

        LinkedList<ListNode> wordList = new LinkedList<>();
        starter = "";
        rnGenerator = generator;
    }

    public MarkovTextGenerator() {

    }


    public String generateText(int numWords) {
        return null;
    }

    public void retrain(String sourceText) {
    }


    public void train(String sourceText) {

        Objects.requireNonNull(sourceText, "sourceText cannot be null");

        String[] stringArray = sourceText.split("\\W+");

        List <String> wordsArray = Arrays.asList(stringArray);

        System.out.println(wordsArray);

/*

        for (ListNode ln : wordList) {

            ln.setWord();
            ln.setNextWords();
*/

        }

    }




