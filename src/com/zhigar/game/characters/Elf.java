package com.zhigar.game.characters;

import com.zhigar.game.enums.EnumMaleFemale;
import com.zhigar.game.equipment.Usable;
import com.zhigar.game.role.Role;
import com.zhigar.game.equipment.Armor;
import com.zhigar.game.equipment.Weapon;
import com.zhigar.text.Text;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
    public void say() {
        System.out.println("Greetings my friend!");
    }

    @Override
    public String speakWithCharacter(Text text) {
        return "";
    }

   /* @Override
    public void speakWithCharacter(String question) {
        String answer = "", tmp = "";
        Matcher m = Pattern.compile("([^.!?]+[.!?])").matcher(question);
        while (m.find()) {
            tmp = m.group();
            if (tmp.charAt(tmp.length() - 1) == '!') {
                String[] words = tmp.split("\\p{P}?[ \\t\\n\\r]+");
                words[words.length-1]=words[words.length-1].substring(0,words[words.length-1].length()-1);
                if (words.length > 3) {
                    answer += words[words.length - 1] + " ";
                    for (int i = 2; i <= words.length - 2; i++) {
                        answer += words[i] + " ";
                    }
                    answer += words[1] + "!";
                } else answer += words[2] + " " + words[1];

            } else answer += tmp;
        }
        System.out.println(answer);
    }*/

   /* public void ttttttttt(Text text)
    {
        for (int i = 0; i < text.getSentences().size(); i++)
        {
            if(Text.findSentense(text.getSentences().get(i), '?'))
            {
                (text.getSentences().get(i)).
            }
        }
    }*/



}
