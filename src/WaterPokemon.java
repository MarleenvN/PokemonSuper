package src;

public class WaterPokemon extends Pokemon{

    //VARIABLES
    private String defence;
    private String special;


    //CONSTRUCTOR
    public WaterPokemon(String name, int level, int hp, String defence, String special) {
        super(name, level, hp);
        this.defence = defence;
        this.special = special;
    }


    //GET & SET
    public String getDefence() {
        return defence;
    }

    public void setDefence(String defence) {
        this.defence = defence;
    }

    public String getSpecial() {
        return special;
    }

    public void setSpecial(String special) {
        this.special = special;
    }


    //METHOD
    public void attacks(String special) {
        System.out.println(super.getName() + " attacks you with " + special);
    }



}
