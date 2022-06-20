package entities;

public class ArrayProfessor {
  
  private Professor[] professores;
  private int ultimaPosicao;

  public ArrayProfessor(int tamanho){
    professores = new Professor[tamanho];
    ultimaPosicao = 0;
  }

  public void adiciona(Professor professor){
    for(Professor prof : professores){
      if(prof != null && prof.getCpf().equals(professor.getCpf())) return;
    }

    professores[ultimaPosicao++] = professor;
  }

  public Professor busca(String cpf){
    for(Professor prof : professores){
      if(prof != null && prof.getCpf().equals(cpf)) return prof;
    }

    return null;
  }

  public void remove(String cpf){

    Professor paraRemover = busca(cpf);
    boolean removeu = false;

    for(int i=0; i<professores.length; i++){

      if(professores[i] == null) continue;

      if( professores[i].equals(paraRemover) || removeu) { 

        professores[i] = null;
        if(i+1 == professores.length) continue;

        professores[i] = professores[i+1];
        removeu = true;
      }
    }
  }

  public Professor[] getProfessores(){
    return professores;
  }

}
