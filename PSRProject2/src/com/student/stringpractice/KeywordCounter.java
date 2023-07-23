package com.student.stringpractice;

import java.io.*;

class KeywordCounter {

    static int countOccurrences(String sentence, String targetWord) {
        // split the sentence by spaces
        String words[] = sentence.split(" ");

        // search for the targetWord in the array of words
        int count = 0;
        for (String word : words) {
            // if match found, increase count
            if (targetWord.equals(word))
                count++;
        }

        return count;
    }

    public static void main(String args[]) {
        String sentence = "the Environmental pollution is the worst thing globally.";
        String targetWord = "the";
        System.out.println(countOccurrences(sentence, targetWord));
    }
}
