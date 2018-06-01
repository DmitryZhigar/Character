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

import java.io.Serializable;

public class Gnom extends Character implements SpeakWithCharacter, Serializable {

    private static final long serialVersionUID = 2;

    public Gnom(String name, EnumMaleFemale sex, Role role, Integer level, Integer hp, Armor armor,
                Weapon weapon) {
        super(name, sex, role, level, hp, armor, weapon);
    }

    Gnom(String name, EnumMaleFemale sex, Role role) {
        super(name, sex, role);
    }

    public void useItem(Usable item) {
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
    public String toString() {
        return super.toString();
    }

    @Override
    public String say() {
        return say("Greetings my friend!");
    }

    @Override
    public String say(String string) {
        Text text = new Text(string);
        for (Sentence sentence: text.getSentences()) {
            if (sentence.getType().equals(Sentence.SentenceType.QUESTION)) {
                for (Word word: sentence.getWords()) {
                    if (!(word instanceof Punct)) {
                        word.setWord(word.getWord().substring(1));
                    }
                }
            }
        }
        return text.toString();
    }


}
