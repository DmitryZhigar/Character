package Equipment;

public class Armor implements EquipmentParametrs {

    public Integer attackPower;
    public Integer defense;

    public Armor(Integer attackPower, Integer defense)
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
        return "Armor: AttackPower - " + AttackPower().toString() + "; Defense: " + Defense().toString();
    }
}
