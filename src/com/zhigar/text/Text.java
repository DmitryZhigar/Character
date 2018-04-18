package com.zhigar.text;

import com.zhigar.game.enums.TypeOfSentense;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Text {

    private List<Sentence> sentences = new ArrayList();
    private String text;

    public Text(String text) {
        String[] sentens = (text.split("(?<!\\w\\.\\w.)(?<![A-Z][a-z]\\.)(?<=\\.|\\?|\\!)\\s"));  //(?<!\w\.\w.)(?<![A-Z][a-z]\.)(?<=\.|\?|\!)\s "([^.!?]+[.!?])"
        for (String sent :
                sentens) {
            sentences.add(new Sentence(sent));
        }
        this.text = text;
    }

    public void replace(String regexFind, String regexChange, String str) {
        for (Sentence sentence : sentences) {
            if (Pattern.matches(regexFind, sentence.getSentenseOriginal())) {
                sentence.setSentenseOriginal(sentence.getSentenseOriginal().replaceAll(regexChange, str));
            }
        }

    }

    public void replaceH(String regexFind) {
        List<Word> words = new ArrayList<>();
        boolean flag = true;
        int wordSize, wordNumber, wordsCounter;
        String regex;

        for (Sentence sentence : sentences)
        {
            if (Pattern.matches(regexFind, sentence.getSentenseOriginal()))
            {
                wordNumber=0;
                wordsCounter=-1;
                wordSize=0;
                regex = "(?<!\\w)" + sentence.getSentenseOriginal().toLowerCase().charAt(0) + "\\w+" +
                        sentence.getSentenseOriginal().toLowerCase().charAt(sentence.getSentenseOriginal().length()-2) + "\\b";
                Matcher m = Pattern.compile(regex).matcher(sentence.toString());

                while (m.find())
                {
                    wordsCounter++;
                    words.add(new Word(m.group()));
                    if(m.group().length() > wordSize)
                    {
                        wordSize = m.group().length();
                        wordNumber = wordsCounter;
                    }
                }

                if(words.size() > -1)
                {
                    for (Word item : sentence.getListWords())
                    {
                        if (words.get(wordNumber).getWord().length() < item.getWord().length())
                            flag = false;
                    }
                    if (flag) {
                        sentence.setSentense(sentence.getSentenseOriginal().
                                replaceAll(words.get(wordNumber).toString(), ""));
                    }
                }
                words.clear();

            }
        }
    }


    public void removeWords()
    {
        String regex="";
        for (int i = 1; i <sentences.size(); i++) {
            for (int j = 0; j <sentences.get(i).sizelistWords(); j++) {
                regex+="\\b" + sentences.get(i).getListWords().get(j)+"|";
            }
        }
        sentences.get(0).setSentense(sentences.get(0).getSentenseOriginal().replaceAll(regex.substring(0,regex.length()-2),""));
    }


    public void replaceForElf(String regexFind) {
        for (Sentence sentence : sentences)
            if (Pattern.matches(regexFind, sentence.getSentenseOriginal())) {
                revertWords(sentence);
            }
    }

    @Override
    public String toString() {
        StringBuffer str = new StringBuffer();
        for (Sentence sent :
                sentences) {
            str.append(sent + " ");
        }
        return str.toString();
    }

    public static String typeOfSentense(TypeOfSentense symbol) {
        String regex = "";
        switch (symbol) {
            case exclamation:
                regex = "\\s*([^!.?]*[!])";
                break;

            case question:
                regex = "\\s*([^!.?]*[?])";
                break;

            case dot:
                regex = "\\s*([^!.?]*[\\.])";
                break;
            case firstSentense:
                regex ="^(.*?)[.?!]\\s";
        }
        return regex;
    }

    public void revertWords(Sentence sentence) {
        String firstWord, secondWord;
        if (sentence.sizelistWords() > 1) {
            firstWord = sentence.getListWords().get(0).getWord();
            secondWord = sentence.getListWords().get(sentence.sizelistWords() - 1).getWord();
            sentence.setSentenceWord(0, secondWord.toUpperCase().charAt(0) + secondWord.substring(1,secondWord.length()-1));
            sentence.setSentenceWord(sentence.sizelistWords() - 1, firstWord.toLowerCase()+ "!");
        }

    }
}
