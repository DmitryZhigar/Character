package com.zhigar.text;

public class Word {

    private String word;

    public Word(String word) {
        this.word = word;
    }

    public Word()
    {

    }

    public String getWord() {
        return word;
    }

    public char getLastChar()
    {
       return word.charAt(word.length()-1);
    }

    public void setWord(String word) {
        this.word = word;
    }

    @Override
    public String toString() {
        return word;
    }
}
