import java.util.Scanner;

public class AndersenTrainee3 {

    public static void main(String[] args) {

        int[] array = new int[10];
        for (int i = 0; i <= array.length; i++) {
            if((i%3==0)&&(i!=0)){
                System.out.println(i);
            }
        }
    }
}