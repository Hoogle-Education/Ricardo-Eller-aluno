import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int anterior, atual;
        int tamanhoDaMaiorSequencia = 0, tamanho = 1;

        // o primeiro elemento já começa sendo o anterior
        anterior = sc.nextInt();

        for(int i = 1; i < n; i++){
            atual = sc.nextInt();

            if(atual == anterior) {
                tamanho++;
            } else {
                // vendo se o tamanho maximo foi superado
                if(tamanho > tamanhoDaMaiorSequencia) 
                    tamanhoDaMaiorSequencia = tamanho;
                tamanho = 1; // contei um elemento diferente
            }

            anterior = atual; // atualiza o anterior
        }

        if(tamanho > tamanhoDaMaiorSequencia) 
            tamanhoDaMaiorSequencia = tamanho;

        System.out.println(tamanhoDaMaiorSequencia);

    }
}
