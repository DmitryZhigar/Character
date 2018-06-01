package com.zhigar.game.bag;

import com.zhigar.game.equipment.Item;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Backpack implements Serializable {

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
