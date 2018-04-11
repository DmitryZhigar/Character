package com.zhigar.game.characters;

import com.zhigar.game.enums.EnumMaleFemale;
import com.zhigar.game.equipment.Potion;
import com.zhigar.game.equipment.Weapon;
import com.zhigar.game.equipment.Armor;
import com.zhigar.game.role.DamageDealler;
import com.zhigar.game.role.Tank;
import com.zhigar.text.Text;

public class Main {

    public static void main(String[] args) {

      /*  DamageDealler damageDealler = new DamageDealler();
        Elf pers = new Elf("pers",EnumMaleFemale.Female,new Tank(),45,10000, new Armor("Броня",55,11,5), new Weapon("Valyna",33,99,22));
        pers.getBackpack().putItem(new Weapon("Blade",15,33,25));
        pers.getBackpack().putItem(new Armor("Great Shield",25,18,99));
        pers.getBackpack().putItem(new Potion("Зелье здоровья",25,25));
        pers.getBackpack().showBackpack();
        pers.setLevel(111);
        pers.useItem(new Potion("ff",1,333));
        Orc pers2 = new Orc("pers2",EnumMaleFemale.Female,damageDealler);
        pers2.setArmor(new Armor("Valuna",2,1111,2));
        pers2.setWeapon(new Weapon("Weap",1,100,1));
        System.out.println();

        pers.showCombatStats();
        pers2.getRole().ability_1(pers2,pers);
        pers.showCombatStats();

        pers2.getRole().ability_2(pers2,pers);

        pers2.getRole().restoreAfterCombat(pers2);
        pers.showCombatStats();*/

        Gnom gnom = new Gnom("11",EnumMaleFemale.Female,new Tank());
        System.out.print(gnom.speakWithCharacter("Коля ты хороший человек! Правда? Нет."));


/*
        ArrayList<String> items;
        items = TextService.splitOnSentences("Коля ты хороший человек! Правда? Нет.");

        for(String item : items){
            System.out.println(item);
        }
        System.out.println("----------------------");

        items = TextService.findSentences(items, '.');

        for(String item : items){
            System.out.println(item);
        }
        System.out.println("----------------------");
*/

        //pers2.getBackpack().putItem(new Potion());
        // DimaS.sayToCharacter("Efefefeff уаусу? Wqewrehtrbc   Цацаца? уаауау. Rаацсццусцсц ЦЦауау? Rмкцв уауа?");
      //  Sasha.sayToCharacter("Ты кто такой? Давай ка ты досвидания! Или приседания? ");
      //  DimaZ.sayToCharacter("Привет как твои дела? Как 111. твои товарищи?");
      //  Hum.sayToCharacter("Ты кто такой ой.");
    }
}
