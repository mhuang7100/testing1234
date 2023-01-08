package poqnk;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<String> name = new ArrayList<String>();
        for (int i = 0; i < 1000000; i++){
            name.add(i, "hi");
            System.out.println(name.get(i));
        }
    }
}
