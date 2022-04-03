public class App {
    public static void main(String[] args) {
        
        int[] vetor = {1, 2, 3, 40, 50, 6, 97, 80, 9};
        int tam = 9;

        int maior = vetor[0]; 

        for (int i = 1; i<tam; i++){
            if( vetor[i] > maior ) {
                System.out.println("O valor " + vetor[i] + " eh maior que " + maior);
                maior = vetor[i];
            }
        }

        System.out.println(maior);
    }
}
