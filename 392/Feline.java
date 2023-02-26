public class Feline extends Animal{
    public Feline(String food, boolean nocturnal, double aveLifeSpan){
        super(food, nocturnal, aveLifeSpan);
        System.out.println("A feline arrives");
    }
    public Feline(){
    }
    public void roar(){
        System.out.println("The feline roars");
    }
    
    public void growl(){
        System.out.println("The feline growls");
    }
}
