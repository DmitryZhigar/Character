package Equipment;

public class Weapon extends Item implements Equipment {

    protected Integer attackPower;
    protected Integer defense;

    public Weapon(String nameItem, Integer quality,Integer attackPower, Integer defense)
    {
        super(nameItem,quality);
        this.attackPower=attackPower;
        this.defense=defense;
    }
    @Override
    public Integer AttackPower() {
        return this.attackPower;
    }

    @Override
    public Integer Defense() {
        return this.defense;
    }

    @Override
    public String toString() {
        return "Weapon: AttackPower - " + AttackPower().toString() + "; Defense: " + Defense().toString();
    }
}
