package Characters;

import Enums.EnumMaleFemale;
import Equipment.Item;
import Equipment.Potion;
import Equipment.Weapon;
import Equipment.Armor;
import Role.Tank;

public class Main {

    public static void main(String[] args) {

        //Task1
        Elf Pers = new Elf("Pers",EnumMaleFemale.Female,new Tank(),45,20, new Armor("Чешуя дракона",55,11,77), new Weapon("Valyna",33,99,22));

        System.out.println(Pers);

        Pers.backpack.putItem(new Weapon("Sword",15,33,25));
        Pers.backpack.putItem(new Armor("Shield",25,18,99));
        Pers.backpack.putItem(new Potion("Зелье",25,25));

        Pers.backpack.showBackpack();
        Pers.say();

        //Sasha.usePotion(new Potion("ЗельеОверПовер",1,20));
        //Item item = Sasha.backpack.getItem(2);
        //if(item instanceof Potion)

        Pers.setLevel(46);
        Pers.usePotion((Potion) Pers.backpack.getItem(2));
        System.out.println(Pers);







       // DimaS.sayToCharacter("Efefefeff уаусу? Wqewrehtrbc   Цацаца? уаауау. Rаацсццусцсц ЦЦауау? Rмкцв уауа?");
      //  Sasha.sayToCharacter("Ты кто такой? Давай ка ты досвидания! Или приседания? ");
      //  DimaZ.sayToCharacter("Привет как твои дела? Как 111. твои товарищи?");
      //  Hum.sayToCharacter("Ты кто такой ой.");
    }
}
