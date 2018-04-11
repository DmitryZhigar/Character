package com.zhigar.text;

import com.oracle.tools.packager.Log;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Text {

    private List<Sentence> sentences = new ArrayList();

    public Text(String text) {
        String[] sentens = (text.split("(?<!\\w\\.\\w.)(?<![A-Z][a-z]\\.)(?<=\\.|\\?|\\!)\\s"));  //(?<!\w\.\w.)(?<![A-Z][a-z]\.)(?<=\.|\?|\!)\s "([^.!?]+[.!?])"
        for (String sent:
             sentens) {
            sentences.add(new Sentence(sent));

        }
    }

    public static List<Sentence> replace(List<Sentence> list,String regex, String str)
    {
        for (Sentence sent:
             list) {
            sent.setSentense(sent.getSentense().replaceAll(regex,str));
        }
        return list;
    }

    public void setSentences(List<Sentence> sentences) {
        this.sentences = sentences;
    }

    public List<Sentence> getSentences() {
        return sentences;
    }

    @Override
    public String toString() {
        StringBuffer str = new StringBuffer();
        for (Sentence sent:
             sentences) {
            str.append(sent + " ");
        }
        return str.toString();
    }

    public List<Sentence> findSentense(char symbol)
    {
        List items = new ArrayList();
        for ( Sentence  sent: this.sentences) {
            if (sent.getSentense().charAt(sent.getSentense().length()-1) == symbol)
          //  if (sent.getlistWords().get(sent.getlistWords().size()).getLastChar() == symbol)
                items.add(sent);
        }
        return  items;
    }

}
