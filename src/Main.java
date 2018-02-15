import Enums.EnumMaleFemale;
import Enums.EnumRole;
import Enums.EnumRace;
import Equipment.Weapon;
import Equipment.Armor;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello World!");


        Character DimaZ = new Character("Dima", EnumRace.Demon, EnumMaleFemale.Man, EnumRole.Healler,10,100, new Armor(5,25),new Weapon(3,5));
        Character DimaS = new Character("DimaS", EnumRace.Human, EnumMaleFemale.Man, EnumRole.Tank,80,150, new Armor(11,55),new Weapon(44,7));
        Character Sasha = new Character("Sasha", EnumRace.Demon, EnumMaleFemale.Man, EnumRole.DamageDealer,80,100, new Armor(10,16),new Weapon(9,23));

        System.out.println(DimaS.toString());
        DimaS.say();

        System.out.println(DimaZ.toString());
        DimaZ.say();

        System.out.println(Sasha.toString());
        Sasha.say();

        DimaS.bag.add(new Weapon(14,2));
        DimaS.bag.add("questItem");

        DimaS.setHp(400);
        DimaS.setLevel(55);
        System.out.println(DimaS.toString());

        DimaS.showBag();
    }
}
