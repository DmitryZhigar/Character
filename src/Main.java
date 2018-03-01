import Enums.EnumMaleFemale;
import Enums.EnumRole;
import Equipment.Weapon;
import Equipment.Armor;

public class Main {

    public static void main(String[] args) {

        //Task1
        Gnom DimaS = new Gnom("DimaS", EnumMaleFemale.Man, EnumRole.Tank,80,150, new Armor(11,55), new Weapon(44,13));
        Orc DimaZ = new Orc("DimaZ", EnumMaleFemale.Female, EnumRole.DamageDealer,80,100,new Armor(43,15),new Weapon(21,88));
        Elf Sasha = new Elf("Sasha",EnumMaleFemale.Female,EnumRole.Healler,45,100500, new Armor(66,77), new Weapon(99,22));
        Human Vasya = new Human("Vasya",EnumMaleFemale.Man, EnumRole.DamageDealer,66,400,new Armor(10,90), new Weapon(100,15));


    System.out.println(DimaS.toString());


        System.out.println(DimaZ.toString());
        DimaZ.say();


       // DimaS.sayToCharacter("Efefefeff уаусу? Wqewrehtrbc   Цацаца? уаауау. Rаацсццусцсц ЦЦауау? Rмкцв уауа?");
      //  Sasha.sayToCharacter("Ты кто такой? Давай ка ты досвидания! Или приседания? ");
      //  DimaZ.sayToCharacter("Привет как твои дела? Как 111. твои товарищи?");
      //  Hum.sayToCharacter("Ты кто такой ой.");
    }
}
