package com.zhigar.text;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Sentence {

    private List<Word> listWords = new ArrayList<>();
    private String sentense;

    public Sentence (String sentence)
    {
        this.sentense=sentence;
        Matcher m = Pattern.compile("((\\b[^\\s]+\\b)((?<=\\.\\w).\\.|\\?|\\!)?)").matcher(sentence);   //((\b[^\s]+\b)((?<=\.\w).)?)    (?<!\w\.\w.)(?<![A-Z][a-z]\.)(?<=\.|\?|\!)\s........((\b[^\s]+\b)((?<=\.\w).\.|\?|\!)?)
        while (m.find()) {
            listWords.add(new Word(m.group()));
        }
    }

    public String getSentense() {
        return sentense;
    }

    public void setSentense(String sentense) {
        this.sentense = sentense;
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
