package com.zhigar.text;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Sentence {

    private List<Word> listWords = new ArrayList<>();

    public Sentence (String sentence)
    {
        Matcher m = Pattern.compile("[\\w’]+|[.,!?;]").matcher(sentence);
        while (m.find()) {
            listWords.add(new Word(m.group()));
        }
    }

    public List<Word> getListWords() {
        return listWords;
    }

    public void setListWords(List<Word> listWords) {
        this.listWords = listWords;
    }

    public int sizelistWords()
    {
        return listWords.size();
    }

    public List<Word> getlistWords() {
        return listWords;
    }

    @Override
    public String toString() {
        return listWords.toString();
    }

}
