import Enums.EnumMaleFemale;
import Enums.EnumRace;
import Enums.EnumRole;

abstract public class AbstractCharacter {

    private    String name;
    private EnumRace race;
    private EnumMaleFemale sex;
    private EnumRole role;

    private Integer level;
    private Integer hp;

    AbstractCharacter(String name, EnumRace race, EnumMaleFemale sex, EnumRole role, Integer level, Integer hp)
    {
        this.name=name;
        this.race=race;
        this.sex=sex;
        this.role=role;
        this.level=level;
        this.hp=hp;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }

    public void say()
    {
        switch (race) {
            case Elf:
                System.out.println("ELf is say.");
                break;

            case Gnom:
                System.out.println("Gnom is say.");
                break;

            case Orc:
                System.out.println("Orc is say.");
                break;

            case Human:
                System.out.println("Human is say.");
                break;

            case Demon:
                System.out.println("Demon is say.");
                break;

            case Troll:
                System.out.println("Troll is say.");
                break;
        }
    }

    @Override
    public String toString() {
        return "Name: " + name + "; Race: "+ race + "; Sex: "+ sex + "; Role: "+ role+"; Level: "+ level+ "; HP: "+ hp;
    }
}
