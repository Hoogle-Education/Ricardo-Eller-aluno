import java.util.Scanner;

class Aluno {

    // atributos
    String name;
    int age;
    String parent;
    long phone;
    double score;
    
    // constructors and overloaded contructors    
    public Aluno(String name, int age, String parent, long phone, double score) {
        this.name = name;
        this.age = age;
        this.parent = parent;
        this.phone = phone;
        this.score = score;
    }

    public Aluno(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public Aluno(String name, int age, String parent) {
        this.name = name;
        this.age = age;
        this.parent = parent;
    }
    
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

    @Override // sobreescrever
    public String toString() {
        return "Aluno [age=" 
                + age 
                + ", name=" 
                + name 
                + ", parent=" 
                + parent 
                + ", phone=" 
                + phone 
                + ", score=" 
                + score
                + "]";
    }

    // to String
    

}

// double f(double x) = return (x + 2) || Real x, f: R -> R
// f(3,5) = 5,5

public class Escola {
    public static void main(String[] args) throws Exception {
        
        Scanner keyboard = new Scanner(System.in);

        // criando um dado do tipo aluno
        Aluno martha = new Aluno("Martha" ,
                                 12 ,
                                 "Thomas",
                                 29121822L ,
                                 9.5);

        System.out.print("Digite o nome do aluno: ");
        String name = keyboard.nextLine();

        System.out.print("Digite a idade do aluno: ");
        int age = keyboard.nextInt();
                
        keyboard.nextLine(); // resolve enter buffer problem

        Aluno jhon = new Aluno(name, age);

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

        System.out.println( jhon );


    }
}
