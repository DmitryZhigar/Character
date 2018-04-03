package com.zhigar.game.equipment;


import com.zhigar.game.characters.Character;

public class Potion extends Item implements Usable{
    
    private Integer points;

    public Potion(String nameItem, Integer quality, Integer points) {
        super(nameItem, quality);
        this.points =points;
    }

    public Integer getPoints() {
        return points;
    }

    @Override
    public String toString() {
        return nameItem +" +" + points;
    }


    @Override
    public void use(Character character) {
        character.setHp(character.getHp() + points);
    }
}
