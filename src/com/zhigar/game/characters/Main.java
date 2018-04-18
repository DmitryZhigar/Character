package com.zhigar.game.characters;

import com.zhigar.game.enums.EnumMaleFemale;
import com.zhigar.game.role.Tank;


public class Main {

    public static void main(String[] args) throws Exception {

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
        System.out.println(gnom.speakWithCharacter("Коля ты хороший человек! Правда ыыы? Нет. Врешь наверное?"));

        Elf elf = new Elf("111",EnumMaleFemale.Female,new Tank());
         System.out.println(elf.speakWithCharacter("Коля человек! Лена Головач! Скажи плыз? зачем тебе это!"));

        Human human = new Human("111",EnumMaleFemale.Female,new Tank());
        System.out.println(human.speakWithCharacter("Sefe sssd sswswswssssdd, effesrd. Ttt trrrrwww  w! Q qwe e."));

        Orc orc = new Orc("111",EnumMaleFemale.Female,new Tank());
        System.out.println(orc.speakWithCharacter("Kolia you are a good man! Kolia is not here. You are freak all the same!"));



    }
}
