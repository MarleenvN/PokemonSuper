package src;

public class FirePokemon extends Pokemon {

    //VARIABLES
    private String food;
    private int flame;


    //CONSTRUCTOR
    public FirePokemon(String name, int level, int hp, String food, int flame) {
        super(name, level, hp);
        this.food = food;
        this.flame = flame;
    }


    //GET & SET
    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public int getFlame() {
        return flame;
    }

    public void setFlame(int flame) {
        this.flame = flame;
    }


    //METHOD
    public void flameThrower(int flame) {
        if(flame > 0)   {
            System.out.println(super.getName() + " throws a flame at you");
            this.flame--;
        } else {
            System.out.println(super.getName() + " cannot attack with flames");
        }
    }

    public void eats(String food)   {
        System.out.println(super.getName() + " eats " + food);
    }
}
