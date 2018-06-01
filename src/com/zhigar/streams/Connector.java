package com.zhigar.streams;

import com.zhigar.game.characters.Character;

import java.io.*;
import java.util.ArrayList;

public class Connector {

    public static void writeToFile(ArrayList<Character> arrayList)
    {
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("demo.dat")))
        {
            oos.writeObject(arrayList);
        }
        catch(Exception ex){

            System.out.println(ex.getMessage());
        }

    }
    public static ArrayList<Character> readFromFile() {
        ArrayList<Character> characters = new ArrayList<Character>();
        File fr = new File("demo.dat");
        try {
            ObjectInputStream istream =
                    new ObjectInputStream(
                            new FileInputStream(fr));
            characters = (ArrayList<Character>) istream.readObject();
            istream.close();
        }
        catch (ClassNotFoundException ce)
        {
            System.err.println(ce);
            System.err.println("Класс не существует");
        }
        catch (FileNotFoundException fe)
        {
            System.err.println(fe);
            System.err.println("Файл не найден");
        }
        catch (IOException ioe)
        {
            System.err.println(ioe);
            System.err.println("Ошибка доступа");
        }
        return characters;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
