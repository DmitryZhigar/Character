package com.zhigar.game.characters;

import com.zhigar.game.enums.EnumMaleFemale;
import com.zhigar.game.equipment.Usable;
import com.zhigar.game.role.Role;
import com.zhigar.game.equipment.Armor;
import com.zhigar.game.equipment.Weapon;
import com.zhigar.text.Text;

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
    public Text speakWithCharacter(String string) {
            Text text = new Text(string);
            text.setSentences(Text.replace(text.findSentense('?'),"\\b[a-zA-Zа-яА-Я]",""));
            return  text;
    }


}
