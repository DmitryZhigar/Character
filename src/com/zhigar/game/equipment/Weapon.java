package com.zhigar.game.equipment;

import java.io.Serializable;

public class Weapon extends Item implements Equipment, Serializable {

    private Integer attackPower;
    private Integer defense;

    public Weapon(String nameItem, Integer quality,Integer attackPower, Integer defense)
    {
        super(nameItem,quality);
        this.attackPower=attackPower;
        this.defense=defense;
    }
    @Override
    public Integer getAttackPower() {
        return this.attackPower;
    }

    @Override
    public Integer getDefense() {
        return this.defense;
    }

    @Override
    public String toString() {
        return "AttackPower - " + getAttackPower().toString() + "; Defense: " + getDefense().toString();
    }
}
