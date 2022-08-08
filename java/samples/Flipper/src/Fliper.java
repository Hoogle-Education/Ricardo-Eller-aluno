import java.util.Scanner;

public class Fliper {
    public static void main(String[] args){
       Scanner teclado = new Scanner(System.in);

       System.out.print("Digite a posição da porta P:");
       int p = teclado.nextInt();

       System.out.print("Digite a posição da porta R:");
       int r = teclado.nextInt();
       
       if(p == 0){
           System.out.println("Caiu no caminho C");
       } else if(r == 0){
           System.out.println("Caiu no caminho B");
       }else if(r == 1){
           System.out.println("Caiu no caminho A");
       }else {
           System.err.println("Digite entre 0 e 1");
       }
    }
}
