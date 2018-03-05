package Equipment;


public class Potion extends Item{
    
    Integer HPburst;

    public Potion(String nameItem, Integer quality, Integer hpburst) {
        super(nameItem, quality);
        this.HPburst=hpburst;
    }

    @Override
    public String toString() {
        return "Зелье здоровья +" + HPburst;
    }

    public void usePotion()
    {

    }
}
