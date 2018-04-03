package com.zhigar.game.characters;

import com.zhigar.game.enums.EnumMaleFemale;
import com.zhigar.game.equipment.Usable;
import com.zhigar.game.role.Role;
import com.zhigar.game.equipment.Armor;
import com.zhigar.game.equipment.Weapon;
import com.zhigar.text.Sentence;
import com.zhigar.text.Text;
import com.zhigar.text.Word;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Gnom extends Character implements SpeakWithCharacter{


    public Gnom(String name, EnumMaleFemale sex, Role role, Integer level, Integer hp, Armor armor, Weapon weapon) {
        super(name, sex, role, level, hp,armor,weapon);
    }

    Gnom(String name, EnumMaleFemale sex, Role role) {
        super(name, sex, role);
    }

    @Override
    public long calculateAttack() {
        return super.calculateAttack();
    }

    @Override
    public long calculateDefense() {
        return super.calculateDefense();
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
    public void say() {
        System.out.println("Greetings my friend!");
    }

    @Override
    public String speakWithCharacter(Text text) {
        return text.findSentense('?').toString().replaceAll("\\b[a-zA-Zа-яА-Я]","");
    }


}
