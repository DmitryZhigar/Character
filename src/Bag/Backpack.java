package Bag;

import Equipment.Item;

import java.util.ArrayList;
import java.util.List;

public class Backpack {

    List<Item> bacpack = new ArrayList<Item>();

    public void putItem(Item item)
    {
        bacpack.add(item);
    }

    public Item getItem(Integer number)
    {
       return bacpack.get(number);
    }

    public void showBackpack()
    {
        for (Item item: bacpack
             ) {
            System.out.println(item);
        }
    }

}
