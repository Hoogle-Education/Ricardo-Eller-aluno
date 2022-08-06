import java.util.Scanner;

public class App {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in); 

        System.out.println("Digite o tamanho do vetor: ");
        int tamanho = input.nextInt();
        
        int[] vetor = new int[tamanho];

        for (int i = 0; i < tamanho; i++){
            vetor[i] = input.nextInt();
        }

        input.close();
    }
}
