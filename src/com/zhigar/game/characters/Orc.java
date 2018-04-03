package com.zhigar.game.characters;

import com.zhigar.game.enums.EnumMaleFemale;
import com.zhigar.game.equipment.Armor;
import com.zhigar.game.equipment.Usable;
import com.zhigar.game.equipment.Weapon;
import com.zhigar.game.role.Role;
import com.zhigar.text.Text;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static jdk.nashorn.internal.objects.NativeString.toLowerCase;

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
        Boolean counter = false;
        ArrayList<String> firstSentense = new ArrayList<String>();
        ;
        ArrayList<String> words = new ArrayList<String>();

        Matcher m = Pattern.compile("([^.!?]+[.!?])").matcher(toLowerCase(question));
        while (m.find()) {
            tmp = m.group();
            if (counter) {
                words.addAll(Arrays.asList(tmp.split("\\p{P}?[ \\t\\n\\r]+")));
            } else {
                firstSentense.addAll(Arrays.asList(tmp.split("\\p{P}?[ \\t\\n\\r]+")));
                counter = true;
            }

        }

        for (int i = 0; i < firstSentense.size(); i++)
            if (!words.contains(firstSentense.get(i))) {
                answer += firstSentense.get(i) + " ";
            }

        System.out.println(answer);
    }*/

}
