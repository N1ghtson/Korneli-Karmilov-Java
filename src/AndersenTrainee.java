import java.util.Scanner;

public class AndersenTrainee {


    public static void main(String[] args) {

        int num, answer = 7;
        System.out.print("Напишите число: ");
        Scanner console = new Scanner(System.in);
        num = console.nextInt();

        if (num > answer) {
            System.out.println("Привет");
        }

    }

}
