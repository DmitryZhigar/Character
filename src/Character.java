import Enums.EnumMaleFemale;
import Enums.EnumRace;
import Enums.EnumRole;
import Equipment.Armor;
import Equipment.Weapon;

import java.util.ArrayList;

public class Character  extends  AbstractCharacter{

    public Armor armor;
    public Weapon weapon;
    ArrayList bag = new ArrayList();

    Character(String name, EnumRace race, EnumMaleFemale sex, EnumRole role, Integer level, Integer hp, Armor armor, Weapon weapon) {
        super(name, race, sex, role, level, hp);
        this.armor=armor;
        this.weapon=weapon;
    }

    @Override
    public void say() {
        super.say();
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

    public void characterParametrs()
    {
        Integer defense = 0, attackPower = 0;

    }
}
