import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);

        int linhas = 4;
        int colunas = 3;
        int[][] matrix = new int[linhas][colunas];

        for(int i=0; i<linhas; i++){
            for(int j=0; j<colunas; j++){
                matrix[i][j] = teclado.nextInt();
            }
        }

        for(int i=0; i<linhas; i++){
            for(int j=0; j<colunas; j++){
              System.out.print( matrix[i][j] + " " );
            }
            System.out.println("");
          }

    }
}



// [0][0] [0][1] [0][2]
// [1][0] [1][1] [1][2]
// [2][0] [2][1] [2][2]

[i][3-i-1]
[i][n-i-1]