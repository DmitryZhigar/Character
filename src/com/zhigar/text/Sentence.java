package com.zhigar.text;

import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Sentence {

    private List<Word> listWords;
    private String sentenseOriginal;

    public Sentence (String sentence)
    {
        this.sentenseOriginal = sentence;
        this.listWords = generateWords(sentenseOriginal);
    }

    private List<Word> generateWords(String sentense) {
        List<Word> words = new LinkedList<>();
        Matcher m = Pattern.compile("((\\b[^\\s]+\\b)((?<=\\.\\w).\\.|\\?|\\!)?)").matcher(sentense);
        while (m.find()) {
            words.add(new Word(m.group()));
        }
        return words;
    }

    public String getSentenseOriginal() {
        return sentenseOriginal;
    }

    public void setSentenceWord(Integer position , String string)
    {
        this.sentenseOriginal="";
        this.listWords.set(position, new Word(string));
        for (Word word:
             this.listWords) {
            this.sentenseOriginal+= word + " ";
        }
    }

    public void setSentenseOriginal(String sentenseOriginal) {
        this.sentenseOriginal = sentenseOriginal;
    }

    public void setSentense(String sentenseOriginal) {
        this.listWords = generateWords(sentenseOriginal);
        this.sentenseOriginal = sentenseOriginal;
    }

    public List<Word> getListWords() {
        return listWords;
    }

    public char getLastCharOfSentense()
    {
       return sentenseOriginal.charAt(sentenseOriginal.length()-1);
    }

    public int sizelistWords()
    {
        return listWords.size();
    }

    @Override
    public String toString() {
        return sentenseOriginal;
    }



}

//((\b[^\s]+\b)((?<=\.\w).)?)    (?<!\w\.\w.)(?<![A-Z][a-z]\.)(?<=\.|\?|\!)\s........((\b[^\s]+\b)((?<=\.\w).\.|\?|\!)?)
//[\w']+|[.,!?;]     0000 "(\\S+\\w)|([^\\s]+)"