package com.codecool.thehistory;

import java.util.Arrays;

public class TheHistoryArray implements TheHistory {

    /**
     * This implementation should use a String array so don't change that!
     */
    private String[] wordsArray = new String[0];

    @Override
    public void add(String text) {
        //TODO: check the TheHistory interface for more information
        wordsArray = text.split("\\s+|,\\s*|\\.\\s*");
    }

    @Override
    public void removeWord(String wordToBeRemoved) {
        //TODO: check the TheHistory interface for more information
        int counter = 0;
        for (String word: wordsArray){
            if(word.equals(wordToBeRemoved)){
                counter++;
            }
        }
        String[] newArray = new String[wordsArray.length - counter];

        int index = 0;
        for (String word: wordsArray){
            if(!word.equals(wordToBeRemoved)){
                newArray[index] = word;
                index++;
            }
        }
    }

    @Override
    public int size() {
        //TODO: check the TheHistory interface for more information
        return wordsArray.length;
    }

    @Override
    public void clear() {
        //TODO: check the TheHistory interface for more information
        wordsArray = new String[0];
    }

    @Override
    public void replaceOneWord(String from, String to) {
        //TODO: check the TheHistory interface for more information
        for(int i = 0; i<wordsArray.length; i++){
            if(wordsArray[i].equals(from)){
                wordsArray[i] = to;
            }
        }
    }

    @Override
    public void replaceMoreWords(String[] fromWords, String[] toWords) {
        //TODO: check the TheHistory interface for more information
//        int index = 0;
//        for(int i = 0; i <fromWords.length; i++) {
//            for(int j = 0; j< wordsArray.length; j++){
//                if(wordsArray[j].equals(fromWords[i])){
//                    wordsArray[j].replace(wordsArray[j], toWords[index]);
//                }
//            }
//            index++;
//        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (String word : wordsArray) {
            sb.append(word).append(" ");
        }
        if (sb.length() > 0) sb.deleteCharAt(sb.length() - 1); // last space char
        return sb.toString();
    }
}
