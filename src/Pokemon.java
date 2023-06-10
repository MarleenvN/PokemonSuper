package src;

public class Pokemon {

    //VARIABLES
    private String name;
    private int level;
    private int hp;


    //CONSTRUCTOR
    public Pokemon(String name, int level, int hp) {
        this.name = name;
        this.level = level;
        this.hp = hp;
    }

    // GET & SET
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }


    // METHODS
    public void eats()  {
        System.out.println("Pokemons eat");
    }

    public void levelUp()   {
        this.level++;
        System.out.println("You have now reached level" + level);
    }
}
