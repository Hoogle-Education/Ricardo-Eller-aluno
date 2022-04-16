import java.util.Scanner;

public class Escola {
    public static void main(String[] args) throws Exception {
        
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String name1 = keyboard.nextLine();

        System.out.print("Digite a idade do aluno: ");
        int idade1 = keyboard.nextInt();
        keyboard.nextLine(); // resolve enter buffer problem

        System.out.print("Digite o nome do responsável: ");
        String parent1 = keyboard.nextLine();

        System.out.print("Digite o telefone do aluno: ");
        long phone1 = keyboard.nextLong();

        System.out.println("Aluno Cadastrado!");        

        System.out.print("Digite sua nota na prova: ");
        double score = keyboard.nextDouble();

        if(score >= 7.0) 
            System.out.println("Aprovado");
        else if(score >= 4.0) 
            System.out.println("Recuperação");
        else 
            System.out.println("Reprovado");

    }
}
