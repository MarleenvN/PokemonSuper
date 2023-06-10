package src;

public class ElectricPokemon extends Pokemon {

    //VARIABLES
    private String food;
    private String sound;


    //CONSTRUCTOR
    public ElectricPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp);
        this.food = food;
        this.sound = sound;
    }


    // GET & SET
    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }


    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }


    //METHOD
    @Override
    public void eats()  {
        System.out.println("The Electric Pokemon is an omnivoor");
    }

    public void makeSound() {
        System.out.println(sound);
    }

    public void electroBall()   {
        System.out.println(super.getName() + "throws an electroball");
    }

}
