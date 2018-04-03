package com.zhigar.game.role;

import com.zhigar.game.characters.Character;

public class Tank implements Role {

    private  int absorb = 40;
    private  boolean flagAbsorb = false;

    public boolean isFlagAbsorb() {
        return flagAbsorb;
    }

    public void setFlagAbsorb(boolean flagAbsorb) {
        this.flagAbsorb = flagAbsorb;
    }

    public int getAbsorb() {
        return absorb;
    }

    public void abilityAbsorbOn()
    {
        setFlagAbsorb(true);
    }

    public void abilityAbsorbOff()
    {
        setFlagAbsorb(false);
    }

    @Override
    public void ability_1(Character character, Character target) {

    }

    @Override
    public void ability_2(Character character, Character target) {

    }

    @Override
    public void restoreAfterCombat(Character character) {

    }

    @Override
    public int getRoleBonus() {
        return 0;
    }

}
