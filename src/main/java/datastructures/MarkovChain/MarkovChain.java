package datastructures.MarkovChain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MarkovChain {


    private List<ListNode> wordList = new ArrayList<>();

    public void train(String sourceText) {

        Objects.requireNonNull(sourceText, "sourceText cannot be null");
        String[] source = sourceText.split("\\W+");
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
}
