package com.zhigar.game.characters;

import com.zhigar.game.bag.Backpack;
import com.zhigar.game.enums.EnumMaleFemale;

import com.zhigar.game.role.Role;
import com.zhigar.game.equipment.Armor;
import com.zhigar.game.equipment.Weapon;
import com.zhigar.text.Sentence;

import java.io.Serializable;


abstract public class Character implements Serializable {

    private Weapon weapon;
    private Armor armor;
    private String name;
    private EnumMaleFemale sex;
    private Role role;
    private Integer level;
    private Integer hp;
    private Backpack backpack;

    Character(String name, EnumMaleFemale sex, Role role, Integer level, Integer hp, Armor armor, Weapon weapon) {
        this.name = name;
        this.sex = sex;
        this.role = role;
        this.level = level;
        this.hp = hp;
        this.backpack = new Backpack();
        this.armor=armor;
        this.weapon=weapon;
    }

    Character(String name, EnumMaleFemale sex, Role role) {
        this.name = name;
        this.sex = sex;
        this.role = role;
        this.level = 1;
        this.hp = 10;
        this.backpack = new Backpack();
        this.armor=new Armor("First Armor",1,1,1);
        this.weapon=new Weapon("First Sword",1,1,1);
    }

    public Backpack getBackpack() {
        return backpack;
    }

    public String getName() {
        return name;
    }

    public EnumMaleFemale getSex() {
        return sex;
    }

    public Role getRole() {
        return role;
    }

    public Integer getLevel() {
        return level;
    }

    public Integer getHp() {
        return hp;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public Armor getArmor() {
        return armor;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }

    public void showCombatStats()
    {
        System.out.println( "Name: " + name +  "; HP: " + hp);
    }

    @Override
    public String toString() {
        return "\nName: " + name + "; \nSex: " + sex + "; \nRole: " + role + "; \nLevel: " + level + "; \nHP: " + hp + "; \nArmor: " + armor + "; \nWeapon: " + weapon;
    }

    public long calculateAttack() {
        return this.getRole().getRoleBonus()+this.getWeapon().getAttackPower() + this.getArmor().getAttackPower();
    }

    public long calculateDefense() {
        return this.getRole().getRoleBonus()+this.getWeapon().getAttackPower() + this.getArmor().getAttackPower();
    }
}
