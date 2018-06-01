package com.zhigar.game.equipment;

import java.io.Serializable;

public class Item implements Serializable {


    protected String nameItem;

    protected Integer quality;

    public String getNameItem() {
        return nameItem;
    }

    public Integer getQuality() {
        return quality;
    }

    public void setNameItem(String nameItem) {
        this.nameItem = nameItem;
    }

    public void setQuality(Integer quality) {
        this.quality = quality;
    }

    Item(String nameItem, Integer quality)
    {
        this.nameItem=nameItem;
        this.quality=quality;
    }
}
