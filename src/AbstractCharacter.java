import Enums.EnumMaleFemale;
import Enums.EnumRace;
import Enums.EnumRole;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

abstract public class AbstractCharacter {

    private String name;
    private EnumRace race;
    private EnumMaleFemale sex;
    private EnumRole role;

    private Integer level;
    private Integer hp;

    AbstractCharacter(String name, EnumRace race, EnumMaleFemale sex, EnumRole role, Integer level, Integer hp) {
        this.name = name;
        this.race = race;
        this.sex = sex;
        this.role = role;
        this.level = level;
        this.hp = hp;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }

    public void say() {
        switch (race) {
            case Elf:
                System.out.println("ELf is say.");
                break;

            case Gnom:
                System.out.println("Gnom is say.");
                break;

            case Orc:
                System.out.println("Orc is say.");
                break;

            case Human:
                System.out.println("Human is say.");
                break;
        }
    }

    public void sayToCharacter(String question) {
        switch (race) {
            case Elf:
                ElfAnwser(question);
                break;

            case Gnom:
                gnomAnwser(question);
                break;

            case Orc:

                break;

            case Human:

                break;
        }
    }


    private static void gnomAnwser(String questionForGnom) {
        String answer = "", tmp = "", s = "\\b[a-zA-Zа-яА-Я]";
        Matcher m = Pattern.compile("([^.!?]+[.!?])").matcher(questionForGnom);
        while (m.find()) {
            tmp = m.group();
            if (tmp.charAt(tmp.length() - 1) == '?') {
                tmp = tmp.replaceAll(s, "");
                answer += tmp;
            } else answer += tmp;
        }
        System.out.println(answer);
    }

    private static void ElfAnwser(String questionForGnom) {
        String answer = "", tmp = "", s = "\\b[a-zA-Zа-яА-Я]";
        Matcher m = Pattern.compile("([^.!?]+[.!?])").matcher(questionForGnom);
        while (m.find()) {
            tmp = m.group();
            if (tmp.charAt(tmp.length() - 1) == '!') {
                String[] words = tmp.split("\\p{P}?[ \\t\\n\\r]+");
                 if(words.length>3)
                 {
                     answer += words[words.length-1] + " ";
                     for (int i = 2; i <= words.length - 2; i++) {
                         answer += words[i] + " ";
                     }

                     answer += words[1] + "!";
                 }else answer += words[2] + " " + words[1];

            } else answer += tmp;
        }
        System.out.println(answer);
    }


    @Override
    public String toString() {
        return "Name: " + name + "; Race: " + race + "; Sex: " + sex + "; Role: " + role + "; Level: " + level + "; HP: " + hp;
    }
}
