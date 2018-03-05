package Equipment;


import Characters.Gnom;
import Characters.Orc;

public class Potion extends Item{
    
    private Integer hPburst;

    public Potion(String nameItem, Integer quality, Integer hpburst) {
        super(nameItem, quality);
        this.hPburst =hpburst;
    }

    public Integer gethPburst() {
        return hPburst;
    }

    @Override
    public String toString() {
        return "Зелье здоровья +" + hPburst;
    }

}
