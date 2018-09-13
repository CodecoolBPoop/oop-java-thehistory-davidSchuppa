package com.codecool.thehistory;

import java.util.*;

public class TheHistoryArrayList implements TheHistory {
    /**
     * This implementation should use a String ArrayList so don't change that!
     */
    private List<String> wordsArrayList = new ArrayList<>();

    @Override
    public void add(String text) {
        //TODO: check the TheHistory interface for more information
        wordsArrayList = new ArrayList<>(Arrays.asList(text.split("\\s+|,\\s*|\\.\\s*")));
    }

    @Override
    public void removeWord(String wordToBeRemoved) {
        //TODO: check the TheHistory interface for more information
        List<String> remove = new ArrayList<>(Arrays.asList(wordToBeRemoved));
        wordsArrayList.removeAll(remove);
//        for(Iterator<String> i = wordsArrayList.iterator(); i.hasNext();) {
//            String word = i.next();
//            if (word.equals(wordToBeRemoved)) {
//                i.remove();
//            }
//        }
    }


    @Override
    public int size() {
        //TODO: check the TheHistory interface for more information
        return wordsArrayList.size();
    }

    @Override
    public void clear() {
        //TODO: check the TheHistory interface for more information
        wordsArrayList = new ArrayList<>();
    }

    @Override
    public void replaceOneWord(String from, String to) {
        //TODO: check the TheHistory interface for more information
        for(int i = 0; i < wordsArrayList.size(); i++){
            if(wordsArrayList.get(i).equals(from)){
                wordsArrayList.set(i, to);
            }
        }
    }

    @Override
    public void replaceMoreWords(String[] fromWords, String[] toWords) {
        //TODO: check the TheHistory interface for more information
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (String word : wordsArrayList) {
            sb.append(word).append(" ");
        }
        if (sb.length() > 0) sb.deleteCharAt(sb.length() - 1); // last space char
        return sb.toString();
    }

}
