import java.util.ArrayList;

/*
 * Activity 4.9.2
 */
public class ZooKeeperRunner
{
  public static void main(String[] args)
  { 
    Animal a4 = new Elephant("leaves, grasses, roots", false, 60.0);
    System.out.println(a4.toString());
    

    /*
    ArrayList<Animal> zoo = new ArrayList<Animal>();
    Deer deer = new Deer();
    Elephant ele = new Elephant();
    Giraffe gir = new Giraffe();
    Gorilla gor = new Gorilla();
    Hippo hip = new Hippo();
    Lion lion = new Lion();
    Monkey monk = new Monkey();
    Owl owl = new Owl();
    Penguin peng = new Penguin();
    Tiger tig = new Tiger();

    zoo.add(deer);
    zoo.add(gir);
    zoo.add(gor);
    zoo.add(hip);
    zoo.add(ele);
    zoo.add(lion);
    zoo.add(monk);
    zoo.add(owl);
    zoo.add(peng);
    zoo.add(tig);

    for (Animal animal : zoo){
      animal.speak();
    }
    */
    /* 
    Penguin penguin = new Penguin();
    penguin.fish();
    Owl owl = new Owl();
    owl.hunt();
    Owl owl2 = new Owl("mice,insects", true, 4.0);
    owl2.eat();
    */
  }
}