package com.zhigar.game.role;

import com.zhigar.game.characters.Character;

public interface Role {

   void ability_1(Character character, Character target);

   void ability_2(Character character, Character target);

   void restoreAfterCombat(Character character);

   int getRoleBonus();
}
