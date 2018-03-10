package Characters;

import Enums.EnumMaleFemale;
import Equipment.Item;
import Equipment.Potion;
import Equipment.Weapon;
import Equipment.Armor;
import Role.DamageDealler;
import Role.Heal;
import Role.Tank;

public class Main {

    public static void main(String[] args) {

        Tank tank = new Tank();
        DamageDealler damageDealler = new DamageDealler();
        Heal heal = new Heal();
        //Task1
        Elf pers = new Elf("pers",EnumMaleFemale.Female,tank,45,10000, new Armor("Броня",55,11,5), new Weapon("Valyna",33,99,22));
        //System.out.println(pers);
        pers.getBackpack().putItem(new Weapon("Blade",15,33,25));
        pers.getBackpack().putItem(new Armor("Great Shield",25,18,99));
        pers.getBackpack().putItem(new Potion("Зелье здоровья",25,25));
        pers.getBackpack().showBackpack();
        pers.say();
        pers.setLevel(111);


        //pers.useItem(new Potion("ff",1,333));


        Orc pers2 = new Orc("pers2",EnumMaleFemale.Female,damageDealler);
        pers2.setArmor(new Armor("Valuna",2,10,2));
        pers2.setWeapon(new Weapon("Weap",1,25,1));


        System.out.println(pers);
        pers2.getRole().fight(pers2,pers);
        System.out.println(pers);




        //pers2.getBackpack().putItem(new Potion());
















        // DimaS.sayToCharacter("Efefefeff уаусу? Wqewrehtrbc   Цацаца? уаауау. Rаацсццусцсц ЦЦауау? Rмкцв уауа?");
      //  Sasha.sayToCharacter("Ты кто такой? Давай ка ты досвидания! Или приседания? ");
      //  DimaZ.sayToCharacter("Привет как твои дела? Как 111. твои товарищи?");
      //  Hum.sayToCharacter("Ты кто такой ой.");
    }
}
