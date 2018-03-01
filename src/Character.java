import Enums.EnumMaleFemale;
import Enums.EnumRole;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static jdk.nashorn.internal.objects.NativeString.toLowerCase;

abstract public class Character {

    private String name;
    private EnumMaleFemale sex;
    private EnumRole role;

    private Integer level;
    private Integer hp;

    Character(String name, EnumMaleFemale sex, EnumRole role, Integer level, Integer hp) {
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
