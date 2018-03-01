import Enums.EnumMaleFemale;
import Enums.EnumRole;
import Equipment.Armor;
import Equipment.Weapon;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Gnom extends Character implements SpeakWithCharacter{

    public Armor armor;
    public Weapon weapon;
    ArrayList bag = new ArrayList();

    Gnom(String name, EnumMaleFemale sex, EnumRole role, Integer level, Integer hp, Armor armor, Weapon weapon) {
        super(name, sex, role, level, hp);
        this.armor=armor;
        this.weapon=weapon;
    }

    @Override
    public  String toString() {
        return super.toString() + "; Armor Defense: " + armor.Defense().toString() +"; Weapon AttackPower: "  + weapon.AttackPower().toString();
    }
    
    public void showBag()
    {
        System.out.println("В сумке " + bag.size() + " элементов: ");
            for (Object item : bag) {
            System.out.println(item.toString());
        }
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
