package Equipment;

public class Item {


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
