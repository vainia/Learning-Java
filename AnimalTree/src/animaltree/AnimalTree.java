package animaltree;

public class AnimalTree 
{
    public static void main(String[] args) 
    {
        Animal[] all = { new Cat("Bars"), new Horse("Devchik"), new Fly("Zhu"), new Dragonfly("Boss"), new Turtle("Jigan"), new Aligator("Gena") };

        for (int i = 0; i < all.length; ++i) System.out.println(all[i]);
        
        System.out.println("");

        for (Animal sole: all) System.out.println(sole);
    }   
}
