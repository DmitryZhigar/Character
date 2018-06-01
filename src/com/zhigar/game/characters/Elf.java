package com.zhigar.game.characters;

import com.zhigar.game.enums.EnumMaleFemale;
import com.zhigar.game.enums.TypeOfSentense;
import com.zhigar.game.equipment.Usable;
import com.zhigar.game.role.Role;
import com.zhigar.game.equipment.Armor;
import com.zhigar.game.equipment.Weapon;
import com.zhigar.text.Punct;
import com.zhigar.text.Sentence;
import com.zhigar.text.Text;
import com.zhigar.text.Word;

public class Elf extends Character implements SpeakWithCharacter{



    Elf(String name, EnumMaleFemale sex, Role role, Integer level, Integer hp, Armor armor, Weapon weapon) {
        super(name, sex, role, level, hp,armor,weapon);
    }

    Elf(String name, EnumMaleFemale sex, Role role) {
        super(name, sex, role);
    }

    public void useItem(Usable item)
    {
        item.use(this);
    }

    @Override
    public  String toString() {
        return super.toString();
    }

    @Override
    public void showCombatStats() {
        super.showCombatStats();
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
    public String say() {
        return "Greetings my friend!";
    }

    @Override
    public String say(String string) {
        Text text = new Text(string);
        String firstWord, secondWord;
        for (Sentence sentence: text.getSentences()) {
            if (sentence.getType().equals(Sentence.SentenceType.EXCLAMATION)) {
                if(sentence.sizeSentense()>1)
                {
                    firstWord=sentence.getWords().get(0).toString();
                    secondWord=sentence.getWords().get(sentence.sizeSentense()-1).toString();
                    sentence.setWord(0, new Word(secondWord));
                    sentence.setWord(sentence.sizeSentense()-1, new Word(firstWord));

                }
            }
        }
        return  text.toString();
    }
}
