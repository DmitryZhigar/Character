package com.zhigar.text;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Text {

    private List<Sentence> sentences = new ArrayList();
        //(?<!\w\.\w.)(?<![A-Z][a-z]\.)(?<=\.|\?|\!)\s "([^.!?]+[.!?])"
    public Text(String text) {
         //sentences.add(Arrays.asList((text.split("(?<!\\w\\.\\w.)(?<![A-Z][a-z]\\.)(?<=\\.|\\?|\\!)\\s")));
        String[] sentens = (text.split("(?<!\\w\\.\\w.)(?<![A-Z][a-z]\\.)(?<=\\.|\\?|\\!)\\s"));
        for (String sent:
             sentens) {
            sentences.add(new Sentence(sent));

        }

        /* Matcher m = Pattern.compile("(?<!\\w\\.\\w.)(?<![A-Z][a-z]\\.)(?<=\\.|\\?|\\!)\\s").matcher(text);
        while (m.find()) {
            sentences.add(new Sentence(m.group()));
        }*/
    }

    public List<Sentence> getSentences() {
        return sentences;
    }

    @Override
    public String toString() {
        return sentences.toString();
    }

    public List<Sentence> findSentense(char symbol)
    {
        List items = new ArrayList();
        for ( Sentence  sent: this.sentences) {
            if (sent.getlistWords().get(sent.getlistWords().size()+1).getLastChar() == symbol)
                items.add(sent);
        }
        return  items;
    }

}
