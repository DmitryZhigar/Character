package Characters;

import Enums.EnumMaleFemale;
import Equipment.Usable;
import Role.Role;
import Equipment.Armor;
import Equipment.Weapon;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Gnom extends Character implements SpeakWithCharacter{


    Gnom(String name, EnumMaleFemale sex, Role role, Integer level, Integer hp, Armor armor, Weapon weapon) {
        super(name, sex, role, level, hp,armor,weapon);
    }

    Gnom(String name, EnumMaleFemale sex, Role role) {
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
    public void say() {
        System.out.println("Greetings my friend!");
    }

    @Override
    public void speakWithCharacter(String question) {
        String answer = "", tmp = "", s = "\\b[a-zA-Zа-яА-Я]";
        Matcher m = Pattern.compile("([^.!?]+[.!?])").matcher(question);
        while (m.find()) {
            tmp = m.group();
            if (tmp.charAt(tmp.length() - 1) == '?') {
                tmp = tmp.replaceAll(s, "");
                answer += tmp;
            } else answer += tmp;
        }
        System.out.println(answer);
    }
}
