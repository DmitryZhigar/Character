package com.zhigar.game.characters;

import com.zhigar.game.enums.EnumMaleFemale;
import com.zhigar.game.enums.TypeOfSentense;
import com.zhigar.game.equipment.Armor;
import com.zhigar.game.equipment.Usable;
import com.zhigar.game.equipment.Weapon;
import com.zhigar.game.role.Role;
import com.zhigar.text.Punct;
import com.zhigar.text.Sentence;
import com.zhigar.text.Text;
import com.zhigar.text.Word;

import java.util.*;

public class Orc extends com.zhigar.game.characters.Character implements SpeakWithCharacter{

    Orc(String name, EnumMaleFemale sex, Role role, Integer level, Integer hp, Armor armor, Weapon weapon) {
        super(name, sex, role, level, hp,armor,weapon);
    }

    Orc(String name, EnumMaleFemale sex, Role role) {
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
    public String say(String text) {
        Text newText = new Text(text);
        List<String> firstSentence = new ArrayList<>();
        List<String> listOfSentences = new ArrayList<>();
        int i = 0;
        for (Sentence sentence : newText.getSentences()) {
            i++;
            for (Word word : sentence.getWords()) {
                if (!(word instanceof Punct) && i != 1)
                    listOfSentences.add(word.getWord());
                else if (i == 1)
                    firstSentence.add(word.getWord());
            }
        }

        Set<String> set = new LinkedHashSet<>(listOfSentences);

        int sizeFirstSentence = firstSentence.size() - 1;
        for (int j = 0; j < sizeFirstSentence; j++) {
            if (Arrays.asList(set.toArray()).contains(firstSentence.get(j))) {
                newText.getSentences().get(0).getWords().remove(j);
                firstSentence.remove(j);
                j--;
                sizeFirstSentence -= 1;
            }
        }
        return newText.getSentences().get(0).toString();
    }


}
