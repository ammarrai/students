package datastructures.MarkovChain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

public class MarkovChain {


    public List<ListNode> wordList = new ArrayList<>();


    public void train(String sourceText) {

        Objects.requireNonNull(sourceText, "sourceText cannot be null");
        String[] source = sourceText.split("\\W+");
        // [\w']*\p{L}*\w[\w.]*(?:-\w+.)?    To be used in a Matcher expression later.


        int length = source.length - 1;
        boolean flag = false;
        int position = 0;

        ListNode firstNode = new ListNode(source[0]);
        firstNode.addNextWord(source[1]);
        wordList.add(firstNode);

        // iterate over all source words
        for (String sourceWord : source) {

            if (position == 0) {
                position++;
                continue;
            } else {

                // If source word exists in wordList, add to it's next word list.
                for (ListNode wordListNode : wordList) {


                    if (sourceWord.equals(wordListNode.getWord())) {
                        if (position < length) {
                            wordListNode.nextWords.add(source[position + 1]);
                            flag = true;
                        }
                        break;
                    }
                    continue;
                }

                // if source word doesn't exist in wordList, create a new node for it.
                if (flag == false) {
                    ListNode newNode = new ListNode(sourceWord);
                    if (position < length) {
                        newNode.nextWords.add(source[position + 1]);

                        wordList.add(newNode);
                    } else {
                        wordList.add(newNode);
                    }
                }

            }

            if (position < length) {
                position++;
            } else {
                break;
            }
        }

        System.out.println("Training Complete.");
    }

    public String generateText(int numWords) {

        int runThisManyIterations;
        boolean plusOne = false;

        // determine if numWords is odd or even
        if ((numWords & 1) == 0) { //even case
            runThisManyIterations = numWords / 2;

        } else {                  //odd case

            int x = numWords - 1;
            runThisManyIterations = x / 2;
            plusOne = true;
        }

        List<String> generated = new ArrayList<>();


        //determine wordList size
        int wordListLength = wordList.size();

        //create random number generator
        Random r = new Random();

        //for loop - completes iterations
        for (int i = 0; i < runThisManyIterations; i++) {

            //obtain random # based on word list size
            int randomWordListIndex = r.nextInt(wordListLength);

            //pass random # to getWord from wordList
            generated.add(wordList.get(randomWordListIndex).getWord());

            //determine size of next words in that word
            int nextWordsLength = wordList.get(randomWordListIndex).nextWords.size();

            //obtain random # based on next words size
            int randomNextWordIndex = r.nextInt(nextWordsLength);

            //pass random # to getWord from nextWords
            generated.add(wordList.get(randomWordListIndex).nextWords.get(randomNextWordIndex));

        }

        //if an odd # of words were requested, add an extra one
        if (plusOne == true) {
            int randomWordListIndex = r.nextInt(wordListLength);
            generated.add(wordList.get(randomWordListIndex).getWord());

        }
        System.out.println(generated.toString());

        return generated.toString();
    }

}


