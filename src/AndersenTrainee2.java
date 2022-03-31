import java.util.Scanner;

public class AndersenTrainee2 {

    public static void main(String[] args) {

        System.out.print("Впишите имя: ");
        Scanner console = new Scanner(System.in);
        String inputString = console.nextLine();
        String answer = "Вячеслав";

        if(inputString.equals(answer)){
            System.out.println("Привет, Вячеслав");
        }else{
            System.out.println("Нет такого имени");
        }

    }
}
