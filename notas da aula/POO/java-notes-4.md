# Programação Orientada a Objetos

## 0. Motivação

**📍 Objetivo:** Faça um programa que leia os dados de alunos de uma escola, realize o cadastro deles solicitando:

1. nome
2. idade
3. responsável
4. telefone

Peça para ele inserir a nota que obteve na prova e diga se ele foi ou não aprovado.

❌ **Problema:** Existe uma falta de consistência na hora de colocar estes dados pelo código, de maneiro que os princípios da flexibilidade e do reuso ficam gravemente abalados.

✅ **Solução:** Criaremos uma nova modelagem de dados, no qual podemos criar moldes(`classes`) e frutos desse molde(`objetos`). Desta maneira, conseguiremos partir de um conceito sobre algo, e modelar várias vezes a partir deste conceito.

## 1. Como orientar a objetos

Seguindo no problema do aluno, precisaremos criar uma `classe` acima da classe que contém a nossa função principal, para modelar a nossa ideia.

Criando uma classe:
```java
class Aluno{
  // minha modelagem de aluno
}

public class MyClass{
  // seu código
}
```

## 2. Atributos de uma classe

Atributos, são associados a coisas que um determinado conceito "tem". Por exemplo, um aluno tem nome e idade.

Criando um modelo de aluno com nome e idade:
```java
class Aluno{

  // atributos
  public String nome;
  public int idade;

}
```

## 3. Metodos de uma classe

Métodos (ou funções) são basicamente processos que esta modelagem é capaz de fazer. Por exemplo uma pessoa pode fazer aniversário. Processo em pseudo-código:

```
Função fazAniversario() :
  Faça idade = idade + 1;
```

Em java:

```java
class Aluno{

  // atributos
  public String nome;
  public int idade;

  // métodos
  public void birthday(){
    idade++;
  }

}
```

## 4. Pausa para métodos e funções

Toda função ou método é uma sequência de passos/regras bem definidos. Desta maneira, podemos sequenciar um processo repetitivo ou dificil e executá-lo várias vezes pelo código.

```java
<privacidade> <tipo_retorno> nome( <parametros> ){
  <código a ser executado>
}
```

```
Publico Real Media(Real variavel1, Real variavel2){
  Retorne (variavel1 + variavel2)/2.0;
}
```

```java
public double media(double variavel1, double variavel2){
  return (variavel1 + variavel2)/2.0;
}
```