public class Lion extends Feline{
    public Lion(String food, boolean nocturnal, double aveLifeSpan) {
        super(food, nocturnal, aveLifeSpan);
    }

    public void packHunt(){
        System.out.println("The lion hunts in a pack");
    }
}
