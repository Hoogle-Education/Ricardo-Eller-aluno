public class PessoaFisica extends Cliente {
  
  // String nome;
  private String cpf;
  
  public PessoaFisica(String nome, String cpf) {
    super(nome);
    this.cpf = cpf;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  @Override
  public String toString(){
    return super.toString()
          + "\n(Pessoa Fisica)CPF: " + cpf;
  }
}
