package Characters;

import Bag.Backpack;
import Enums.EnumMaleFemale;
import Equipment.Potion;
import Role.Role;


abstract public class Character{

    private String name;
    private EnumMaleFemale sex;
    private Role role;
    private Integer level;
    private Integer hp;
    protected Backpack backpack;

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

    Character(String name, EnumMaleFemale sex, Role role, Integer level, Integer hp) {
        this.name = name;
        this.sex = sex;
        this.role = role;
        this.level = level;
        this.hp = hp;
        this.backpack = new Backpack();
    }

    public void usePotion(Potion potion)
    {
            setHp(getHp()+ potion.getPoints());

    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }

    @Override
    public String toString() {
        return "Name: " + name + "; Sex: " + sex + "; Role: " + role + "; Level: " + level + "; HP: " + hp;
    }

}
