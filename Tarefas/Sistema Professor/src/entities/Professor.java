package entities;

public class Professor {

  private String nome;
  private String cpf;
  private int aulasSemanais;
  private double horaAula;

  public Professor(String nome, String cpf, int aulasSemanais, double horaAula) {
    this.nome = nome;
    this.cpf = cpf;
    this.aulasSemanais = aulasSemanais;
    this.horaAula = horaAula;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public int getAulasSemanais() {
    return aulasSemanais;
  }

  public void setAulasSemanais(int aulasSemanais) {
    this.aulasSemanais = aulasSemanais;
  }

  public double getHoraAula() {
    return horaAula;
  }

  public void setHoraAula(double horaAula) {
    this.horaAula = horaAula;
  }

  private double salarioBase(){
    return aulasSemanais*4.5*horaAula;
  }

  private double adicionalHoraAtividade(){
    return 0.05*salarioBase();
  }

  private double descansoRemunerado(){
    return (1.0/6.0)*(salarioBase() + adicionalHoraAtividade());
  }

  public double getSalario(){
    return salarioBase() + adicionalHoraAtividade() + descansoRemunerado();
  }

  @Override
  public String toString() {
    return "Professor [aulasSemanais=" + aulasSemanais + ", cpf=" + cpf + ", horaAula=" + horaAula + ", nome=" + nome
        + "]";
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Professor other = (Professor) obj;
    if (aulasSemanais != other.aulasSemanais)
      return false;
    if (cpf == null) {
      if (other.cpf != null)
        return false;
    } else if (!cpf.equals(other.cpf))
      return false;
    if (Double.doubleToLongBits(horaAula) != Double.doubleToLongBits(other.horaAula))
      return false;
    if (nome == null) {
      if (other.nome != null)
        return false;
    } else if (!nome.equals(other.nome))
      return false;
    return true;
  }
  

}
