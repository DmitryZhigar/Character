package Bag;

import Equipment.Item;

import java.util.List;

public class Backpack {

    List<Item> bacpack;

    public void putItem(Item item)
    {
        bacpack.add(item);
    }

    public void getItem(Integer number)
    {
        bacpack.get(number);
    }

    public void showBackpack()
    {
        for (Item item: bacpack
             ) {
            System.out.println(item);
        }
    }

}
