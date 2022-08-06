import java.util.Scanner;
public class Divisores {
    public static void main(String[] args)  {
        // criando variavel para ler do terminal
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o valor:");
        int valor = teclado.nextInt();

        System.out.println("Divisores de " + valor + ":");
        for(int teste=1; teste <= valor; teste++){
            if(valor%teste == 0){
                System.out.print(teste + " ");
            } 
        }
        
    }
}
