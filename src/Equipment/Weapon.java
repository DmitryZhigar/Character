package Equipment;

public class Weapon implements EquipmentParametrs {

    protected Integer attackPower;
    protected Integer defense;

    public Weapon(Integer attackPower, Integer defense)
    {
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
