package com.zhigar.game.role;

import com.zhigar.game.characters.Character;

public class DamageDealler implements Role {


    @Override
    public void ability_1(Character character, Character target) {

        int dmg = (int) (character.calculateAttack() - target.calculateDefense());

        if (dmg > 0)
        {
            target.setHp(target.getHp()-dmg);

        }

    }

    @Override
    public void ability_2(Character character, Character target) {
        System.out.println(character.getName() + " использовал бинт на " + target.getName());
        target.setHp(target.getHp() + 5);
        System.out.println("Здоровье увеличено на + 5, общий показатель ХП =" + target.getHp());
    }

    @Override
    public void restoreAfterCombat(Character character) {
        character.setHp(character.getHp() + 20);
        System.out.println("Персонаж отдохнул, здоровье + 20");
    }

    @Override
    public int getRoleBonus() {
        return 40;
    }
}
