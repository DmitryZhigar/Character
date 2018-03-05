package Equipment;


public class Potion extends Item{
    
    private Integer points;

    public Potion(String nameItem, Integer quality, Integer hpburst) {
        super(nameItem, quality);
        this.points =hpburst;
    }

    public Integer getPoints() {
        return points;
    }

    @Override
    public String toString() {
        return nameItem +" +" + points;
    }

}
