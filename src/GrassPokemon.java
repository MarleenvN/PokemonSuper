package src;

import java.util.SplittableRandom;

public class GrassPokemon extends Pokemon {

    //VARIABLES
    private String attack;
    private int sound;


    //CONSTRUCTOR
    public GrassPokemon(String name, int level, int hp, String attack, int sound) {
        super(name, level, hp);
        this.attack = attack;
        this.sound = sound;
    }


    //GET & SET
    public String getAttack() {
        return attack;
    }

    public void setAttack(String attack) {
        this.attack = attack;
    }

    public int getSound() {
        return sound;
    }

    public void setSound(int sound) {
        this.sound = sound;
    }


    //METHOD
    public void speaks(String sound)    {
        System.out.println(super.getName() + " says " + sound);
    }

    public void leaveBlade()    {
        System.out.println(super.getName() + " attacks with leaves");
    }
}
