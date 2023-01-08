package ArrayList1;

import java.util.ArrayList;

public class RandomPermutation {
     
    public static void next(int length){
        HorseBarn h = new HorseBarn();
        ArrayList<Horse> b = new ArrayList<Horse>();
        b = h.getSpaces();
        ArrayList<Horse> a = new ArrayList<Horse>();
        

        for (int i = length - 1; i >= 0; i--){
            int randNum = (int) (Math.random() * (i + 1));
            a.add(b.get(randNum));
            b.set(randNum, b.get(i));
            b.remove(i);
        }

        for (int i = 0; i <= length - 1; i += 2){
            System.out.println(a.get(i) + " and " + a.get(i + 1));
        }
        if (length % 2 != 0){
            System.out.println(a.get(length - 1) + " did not get a partner");
        }
        System.out.println();
    }
}
