package Equipment;


public class Potion extends Item{
    
    Integer HPburst;

    Potion(String nameItem, Integer quality, Integer hpburst) {
        super(nameItem, quality);
        this.HPburst=hpburst;
    }
    
    public void usePotion()
    {
        Character.setHp();
    }
}
