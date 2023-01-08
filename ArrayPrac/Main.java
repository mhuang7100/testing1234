package ArrayPrac;

public class Main{
    public static void main(String[] args){
        int[] array1 = {1, 2, 3, 4, 5, 6};
        int[] array2 = {1, 4, 7};
        int[] array3 = {11, 17, 23, 59, 67};

        int num = 0;
        while(num < array1.length){
            System.out.print(array1[num]);
            num += 1;
        }

        System.out.println();

        for (int i = 0; i < array2.length; i++){
            System.out.print(array2[i]);
        }

        System.out.println();

        for (int x:array3){
            System.out.print(x);
        }
        
        System.out.println();

    }
}