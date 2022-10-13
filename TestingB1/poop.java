package TestingB1;

public class poop {
    String what;
    int random;
    public poop(){
        random = (int) (Math.random() * 2);
        if (random == 0){
            System.out.println("poop");
        } else if (random == 1){
            System.out.println("pee");
        }
    }
}
