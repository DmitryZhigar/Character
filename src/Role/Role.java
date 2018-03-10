package Role;

import Characters.Character;

public interface Role {

   void fight(Character character, Character target);

   void heal(Character character);

   void restoreAfterCombat();
}
