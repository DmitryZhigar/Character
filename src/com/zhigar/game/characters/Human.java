package com.zhigar.game.characters;

import com.zhigar.game.enums.EnumMaleFemale;
import com.zhigar.game.enums.TypeOfSentense;
import com.zhigar.game.equipment.Usable;
import com.zhigar.game.role.Role;
import com.zhigar.game.equipment.Armor;
import com.zhigar.game.equipment.Weapon;
import com.zhigar.text.Text;

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
    public void say() {
        System.out.println("Greetings my friend!");
    }

    @Override
    public Text speakWithCharacter(String string) {
        Text text = new Text(string);
        text.replaceH(Text.typeOfSentense(TypeOfSentense.dot));
        return  text;

    }

}
