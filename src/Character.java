import Enums.EnumMaleFemale;
import Role.Role;


abstract public class Character{

    private String name;
    private EnumMaleFemale sex;
    private Role role;
    private Integer level;
    private Integer hp;

    Character(String name, EnumMaleFemale sex, Role role, Integer level, Integer hp) {
        this.name = name;
        this.sex = sex;
        this.role = role;
        this.level = level;
        this.hp = hp;
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
