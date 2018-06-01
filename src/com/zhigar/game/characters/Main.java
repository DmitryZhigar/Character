package com.zhigar.game.characters;

import com.zhigar.decorator.Decorator;
import com.zhigar.game.enums.EnumMaleFemale;
import com.zhigar.game.role.Tank;
import com.zhigar.streams.Connector;

import java.io.*;
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) throws Exception {

       System.out.println("------stroki-----");
        Gnom gnom = new Gnom("Gnom",EnumMaleFemale.Female, new Tank());
        System.out.println(gnom.say("ПРивет, как дела? что нового? Крутяк!"));
        Elf elf = new Elf("Elf",EnumMaleFemale.Female,new Tank());
        System.out.println(elf.say("Лена Головач! Ахахахахах! Лол кек чебурек! ыыы?"));
        Orc orc = new Orc("Orc",EnumMaleFemale.Female,new Tank());
        System.out.println(orc.say("Лена Головач как твои дела? Как твои покемоны? Головач такая головач!"));
        Human human = new Human("Human",EnumMaleFemale.Female,new Tank());
        System.out.println(human.say("Пле Пвцви приветульки. Пле Пвцви приветульки! Пле Пвцви приветульки"));

        System.out.println("-----3.1------");

        ArrayList<Character> characters = new ArrayList<>();
        characters.add(gnom);
        characters.add(human);
        Connector.writeToFile(characters);

        ArrayList<Character> charactersFromFile;

        charactersFromFile=Connector.readFromFile();

        for (Character character: charactersFromFile)
        {
            System.out.println(character.toString());
        }

        System.out.println("-----3.2------");


        try (Decorator dr = new Decorator(new FileReader("111.txt"))) {
            String s;
            while ((s = dr.readLine()) != null) {
                System.out.println(s);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }


       // Decorator.writeFromFileToFile("111.txt","trrr.txt");

    }
}
