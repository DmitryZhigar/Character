import Enums.EnumMaleFemale;
import Role.Role;
import Equipment.Armor;
import Equipment.Weapon;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Elf extends Character implements SpeakWithCharacter{

    public Armor armor;
    public Weapon weapon;

  //  ArrayList bag = new ArrayList();

    Elf(String name, EnumMaleFemale sex, Role role, Integer level, Integer hp, Armor armor, Weapon weapon) {
        super(name, sex, role, level, hp);
        this.armor=armor;
        this.weapon=weapon;
    }

    @Override
    public  String toString() {
        return super.toString() + "; Armor Defense: " + armor.Defense().toString() +"; Weapon AttackPower: "  + weapon.AttackPower().toString();
    }
    
    /*public void showBag()
    {
        System.out.println("В сумке " + bag.size() + " элементов: ");
            for (Object item : bag) {
            System.out.println(item.toString());
        }
    }*/

    @Override
    public void say() {
        System.out.println("Greetings my friend!");
    }

    @Override
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
    }


}
