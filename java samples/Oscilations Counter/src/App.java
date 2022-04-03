// Proposta: Fazer um programa que dado uma sequência conta todas as vezes em que esta sequência mudou de sentido.

// Por exemplo a sequencia abaixo é crescente até o elemento 4, porém no elemento -2, ela registra uma oscilação e começa a ser descrescente, e assim sucessivamente, contamos 3 oscilações nesse caso de teste.


// Entrada:
// 11
// p p p p  a
// 1 2 3 4 -2  2 3 4 5 6 1
// x + + +  -
// Saída: Total de oscilações: 3

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        Scanner teclado;
        int count = 0;
        teclado = new Scanner(System.in);

        System.out.print("Digite o tamanho: ");
        int tamanho = teclado.nextInt();

        System.out.println("Digite as variaveis");
        int passado = teclado.nextInt();
        int atual = teclado.nextInt();
        int deltaPassado = atual - passado;

        for(int i=2; i < tamanho; i++){
            passado = atual;
            atual = teclado.nextInt();

            int deltaAtual = atual - passado;

            int signal1 = deltaPassado / Math.abs(deltaPassado);
            int signal2 = deltaAtual / Math.abs(deltaAtual);

            if( signal1*signal2 == -1 ) count++;

            deltaPassado = deltaAtual;
        }

        System.out.println("O total de oscilações é: " + count);
    }
}

