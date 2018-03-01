import Enums.EnumMaleFemale;
import Enums.EnumRole;
import Equipment.Armor;
import Equipment.Weapon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static jdk.nashorn.internal.objects.NativeString.toLowerCase;

public class Orc extends Character implements SpeakWithCharacter{

    public Armor armor;
    public Weapon weapon;
    ArrayList bag = new ArrayList();

    Orc(String name, EnumMaleFemale sex, EnumRole role, Integer level, Integer hp, Armor armor, Weapon weapon) {
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
    }

}
