package com.zhigar.text;

import com.zhigar.game.enums.TypeOfSentense;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Text {

    private List<Sentence> sentences = new ArrayList<>();

    public Text(String text) {
        String[] sentences = (text.split("(?<!\\w\\.\\w.)(?<![A-Z][a-z]\\.)(?<=\\.|\\?|\\!)\\s"));
        for (String sent : sentences) {
            this.sentences.add(new Sentence(sent));
        }
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (Sentence sent : sentences) {
            str.append(sent);
            //todo if not last
            if (true) {
                str.append(" ");
            }
        }
        return str.toString();
    }


    public List<Sentence> getSentences() {
        return sentences;
    }
}
