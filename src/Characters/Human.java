package Characters;

import Enums.EnumMaleFemale;
import Equipment.Usable;
import Role.Role;
import Equipment.Armor;
import Equipment.Weapon;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static jdk.nashorn.internal.objects.NativeString.toLowerCase;

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
    public  String toString() {
        return super.toString();
    }

    @Override
    public void say() {
        System.out.println("Greetings my friend!");
    }

    @Override
    public void speakWithCharacter(String question) {
        String answer = "", tmp = "";
        Matcher m = Pattern.compile("([^.!?]+[.!?])").matcher(toLowerCase(question));
        while (m.find()) {
            tmp = m.group();
            if (tmp.charAt(tmp.length() - 1) == '.') {
                //   System.out.println("предложение последняя буква " + tmp.charAt(tmp.length() - 2) + " первая буква " + tmp.charAt(0));
                String[] words = tmp.split("\\p{P}?[ \\t\\n\\r]+");
                for (int i = 0; i < words.length; i++) {
                    if (words[i].charAt(0) != tmp.charAt(0) ||
                            words[i].charAt(words[i].length() - 1) != tmp.charAt(tmp.length() - 2)) {
                        answer += words[i] + " ";
                    }
                }

            } else answer += tmp;
        }
        System.out.println(answer);
    }

}
