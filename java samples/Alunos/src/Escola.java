import java.util.Scanner;

class Aluno {

    // atributos
    String name;
    int age;
    String parent;
    long phone;
    double score;

    // métodos
    public void birthday(){
        System.out.println("-----------------------");
        System.out.println("Jhon is making birthday");
        System.out.println("-----------------------");
        age++;
    }

    public void isApproved(){
        if(score >= 7.0) 
            System.out.println("Aprovado");
        else if(score >= 4.0) 
            System.out.println("Recuperação");
        else 
            System.out.println("Reprovado");
    }

}

// double f(double x) = return (x + 2) || Real x, f: R -> R
// f(3,5) = 5,5

public class Escola {
    public static void main(String[] args) throws Exception {
        
        Scanner keyboard = new Scanner(System.in);

        // criando um dado do tipo aluno
        Aluno jhon = new Aluno();
        Aluno martha = new Aluno();

        martha.name = "Martha";
        martha.age = 12;
        martha.parent = "Thomas";
        martha.phone = 29121822L;
        martha.score = 9.5;

        System.out.print("Digite o nome do aluno: ");
        jhon.name = keyboard.nextLine();

        System.out.print("Digite a idade do aluno: ");
        jhon.age = keyboard.nextInt();
        keyboard.nextLine(); // resolve enter buffer problem

        System.out.print("Digite o nome do responsável: ");
        jhon.parent = keyboard.nextLine();

        System.out.print("Digite o telefone do aluno: ");
        jhon.phone = keyboard.nextLong();

        System.out.println("Aluno Cadastrado!");        

        System.out.print("Digite sua nota na prova: ");
        jhon.score = keyboard.nextDouble();

        jhon.isApproved();
        martha.isApproved();

        System.out.println("John age before birthday: " + jhon.age);
        jhon.birthday();
        jhon.birthday();
        System.out.println("Jhon age after birthday: " + jhon.age);


    }
}
