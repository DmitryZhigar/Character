package com.zhigar.text;

public class Word {

    private String word;

    public Word(String word)
    {
        this.word=word;
    }

    public String getWord() {
        return word;
    }

    public char getLastChar()
    {
       return word.charAt(word.length()+1);
    }

    @Override
    public String toString() {
        return word;
    }

    public String wordToLower()
    {
        return "";
    }
}
