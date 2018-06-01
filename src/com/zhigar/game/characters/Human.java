package com.zhigar.game.characters;

import com.zhigar.game.enums.EnumMaleFemale;
import com.zhigar.game.enums.TypeOfSentense;
import com.zhigar.game.equipment.Usable;
import com.zhigar.game.role.Role;
import com.zhigar.game.equipment.Armor;
import com.zhigar.game.equipment.Weapon;
import com.zhigar.text.Sentence;
import com.zhigar.text.Text;
import com.zhigar.text.Word;

public class Human extends Character implements SpeakWithCharacter{

    Human(String name, EnumMaleFemale sex, Role role, Integer level, Integer hp, Armor armor, Weapon weapon) {
        super(name, sex, role, level, hp,armor,weapon);
    }

    Human(String name, EnumMaleFemale sex, Role role) {
        super(name, sex, role);
    }


    public void useItem(Usable item)
    {
        item.use(this);
    }


    @Override
    public long calculateAttack() {
        return super.calculateAttack();
    }

    @Override
    public long calculateDefense() {
        return super.calculateDefense();
    }

    @Override
    public  String toString() {
        return super.toString();
    }

    @Override
    public String say() {
        return "Greetings my friend!";
    }

    @Override
    public String say(String string) {
        Text text = new Text(string);
        char firstChar, lastChar;
        for (Sentence sentence: text.getSentences()) {
            if (sentence.getType().equals(Sentence.SentenceType.DOT)) {
                if(sentence.sizeSentense()>1)
                {
                    firstChar=sentence.getWords().get(0).getWord().charAt(0);
                    lastChar=sentence.getWords().get(sentence.sizeSentense()-1).getWord().charAt(sentence.getWords().get(sentence.getWords().size()-2).getWord().length()-1);
                    for(int i=0; i<sentence.getWords().size(); i++)
                    {
                       if(sentence.getWords().get(i).getWord().charAt(0) == firstChar &&
                               sentence.getWords().get(i).getWord().charAt(sentence.getWords().get(i).getWord().length()-1) == lastChar)
                           sentence.getWords().remove(i);
                    }


                }
            }
        }
        return  text.toString();

    }

}
