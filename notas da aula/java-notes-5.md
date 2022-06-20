# Contrutores 

Melhoram a maneira que criamos novos objetos e podem servir para exigir que tenham certos pré-requisitos.

## Exemplo

```java
public class Pessoa {

  String name;
  int age;
  String phone;

  public Pessoa(String nomeEntrada, int ageEntrada, String phoneEntrada){
    name = nomeEntrada;
    ageEntrada = age;
    phone = phoneEntrada;
  }

}
```

```java
  Pessoa joao = new Pessoa("joao", 12, "210-971-919");
```