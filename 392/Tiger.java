public class Tiger extends Feline{
    public Tiger(String food, boolean nocturnal, double aveLifeSpan){
        super(food, nocturnal, aveLifeSpan);
    }
    public Tiger(){
    }
    public void swim(){
        System.out.println("The Tiger swims");
    }
    public void huntAlone(){
        System.out.println("The Tiger hunts alone");
    }
}
