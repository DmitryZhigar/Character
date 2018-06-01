package com.zhigar.text;

import com.zhigar.game.enums.TypeOfSentense;

import java.awt.font.ShapeGraphicAttribute;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Sentence {

    private List<Word> words;

    public Sentence (String sentence) {
        this.words = generateWords(sentence);
    }

    private List<Word> generateWords(String sentense) {
        List<Word> words = new LinkedList<>();
        String massiveOfWords[] = sentense.split("\\s|((?<=\\.|\\?|\\!|\\,|\\;)|(?=\\.|\\?|\\!|\\,|\\;))");
        for (String oneWord : massiveOfWords) {
            if(oneWord.equals("?")||oneWord.equals(".")||oneWord.equals("!")||oneWord.equals(","))
            {
                words.add(new Punct(oneWord));
            }
            else if(!(oneWord.equals(" ")))
            {
                words.add(new Word(oneWord));

            } }
        return words;
    }

    public int sizeSentense()
    {
        return words.size()-1;
    }

    public List<Word> getWords() {
        return words;
    }

    public void setWords(List<Word> words) {
        this.words = words;
    }
    public void setWord( int position,Word word)
    {
        words.set(position,word);
    }

    public SentenceType getType() {
        SentenceType type;
        Word lastWord = words.get(words.size()-1);
            switch (lastWord.getWord()){
                case "?": type = SentenceType.QUESTION;
                break;
                case ".": type = SentenceType.DOT;
                break;
                case "!": type = SentenceType.EXCLAMATION;
                break;
                default: type = SentenceType.UNDEFINED;
            }
            return  type;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (Word word : words) {
            if (word instanceof Punct) {
                str.append(word);
            }else
            str.append(" "+ word);
        }
        return str.toString();
    }

   public enum SentenceType {
       UNDEFINED,
       QUESTION,
       DOT,
       EXCLAMATION
   }
}

//((\b[^\s]+\b)((?<=\.\w).)?)    (?<!\w\.\w.)(?<![A-Z][a-z]\.)(?<=\.|\?|\!)\s........((\b[^\s]+\b)((?<=\.\w).\.|\?|\!)?)
//[\w']+|[.,!?;]     0000 "(\\S+\\w)|([^\\s]+)"