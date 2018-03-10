package Role;

import Characters.Character;

public class DamageDealler implements Role {


    @Override
    public void fight(Character character, Character target) {

        int tArmor = target.getArmor().Defense()+ target.getWeapon().Defense();
        int cDamage = character.getWeapon().AttackPower()+ character.getArmor().AttackPower();
        if (tArmor < cDamage)
        {
            target.setHp(tArmor-cDamage);
            System.out.println(character.getName() + " ударил " + target.getName() + " " + (tArmor-cDamage) + "  здоровья" );
        }
        else
            System.out.println("Броня не пробита");

    }

    @Override
    public void heal(Character character) {

    }

    @Override
    public void restoreAfterCombat() {

    }
}
