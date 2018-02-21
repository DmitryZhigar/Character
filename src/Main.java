import Enums.EnumMaleFemale;
import Enums.EnumRole;
import Enums.EnumRace;
import Equipment.Weapon;
import Equipment.Armor;

public class Main {

    public static void main(String[] args) {

       // System.out.println("Hello World!");


        Character DimaS = new Character("DimaS", EnumRace.Gnom, EnumMaleFemale.Man, EnumRole.Tank,80,150, new Armor(11,55),new Weapon(44,7));

        Character DimaZ = new Character("Dima", EnumRace.Orc, EnumMaleFemale.Man, EnumRole.Healler,10,100, new Armor(5,25),new Weapon(3,5));
        Character Sasha = new Character("Sasha", EnumRace.Elf, EnumMaleFemale.Man, EnumRole.DamageDealer,80,100, new Armor(10,16),new Weapon(9,23));
        Character Hum = new Character("Dima", EnumRace.Human, EnumMaleFemale.Man, EnumRole.Healler,10,100, new Armor(5,25),new Weapon(3,5));

    /* Task 1
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
        DimaS.showBag();*/
        DimaS.sayToCharacter("Efefefeff уаусу? Wqewrehtrbc   Цацаца? уаауау. Rаацсццусцсц ЦЦауау? Rмкцв уауа?");
        Sasha.sayToCharacter("Ты кто такой? Давай ка ты досвидания! Или приседания? ");
        DimaZ.sayToCharacter("Привет как твои дела? что как 111. твои товарищи?");
        Hum.sayToCharacter("ты кто такой ой.");
    }
}
