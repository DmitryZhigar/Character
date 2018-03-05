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
        Elf Sasha = new Elf("Sasha",EnumMaleFemale.Female,new Tank(),45,100500, new Armor("Чешуя дракона",55,11,77), new Weapon("Valyna",33,99,22));

        System.out.println(Sasha);

        Sasha.backpack.putItem(new Weapon("Sword",15,33,25));
        Sasha.backpack.putItem(new Armor("Shield",25,18,99));
        Sasha.backpack.putItem(new Potion("Зелье",25,25));

        Sasha.backpack.showBackpack();
        Sasha.say();

        //Sasha.usePotion(new Potion("ЗельеОверПовер",1,20));
        //Item item = Sasha.backpack.getItem(2);
        //if(item instanceof Potion)
        Sasha.usePotion((Potion) Sasha.backpack.getItem(2));
        System.out.println(Sasha);


       // DimaS.sayToCharacter("Efefefeff уаусу? Wqewrehtrbc   Цацаца? уаауау. Rаацсццусцсц ЦЦауау? Rмкцв уауа?");
      //  Sasha.sayToCharacter("Ты кто такой? Давай ка ты досвидания! Или приседания? ");
      //  DimaZ.sayToCharacter("Привет как твои дела? Как 111. твои товарищи?");
      //  Hum.sayToCharacter("Ты кто такой ой.");
    }
}
