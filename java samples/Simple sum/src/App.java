import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();

        int sum = a+b;

        System.out.println("A soma eh " + sum);

        input.nextLine();
        String frase = input.nextLine();

        System.out.println("Voce digitou: " + frase);
        
        input.close();

    }
}
