# Revisando Java

`entrypoint`: ponto de entrada do programa.

O *entrypoint* padrão é a classe que contém a `main`.

```java
public class MyFirstProgram {

  public static void main(String[] agrs){

    System.out.println("Hello World!"); //sysout

  }

}
```

## Variáveis no programa

|Nome Variável| Keyword | Propósito|
|:-:|:-:|:-:|
|Inteiro|`int`|Números inteiros|
|Reais|`float`|Números com ponto flutuante (4 casas decimais)|
|Reais|`double`|Números com ponto flutuante (8 casas decimais)|
|Caracter|`char`|Guarda um caracter|
|Frase|`String`|Vetor(conjunto ordenado) de caracteres|

# Estruturas condicionais - `if-else if-else`

## Estrutura `if`

O `if` pede uma condição e um bloco de código a ser executado se a condição for verdadeira.

sintaxe:
```java
if( /*condição*/ ){
  /*Bloco de código*/
}
```
 
## Estrutura `else`

A etrutura `else` captura uma sobra do `if` e executa quando a condição associada ao `if` for falsa.

sintaxe:
```java
if( /*condição*/ ){
  /*Bloco de código se for verdade*/
}else{
  /*Bloco de código se for falso*/
}
```

## Estrutura `else if`

A estrutura `else-if` melhora o uso dos `if`s permitindo múltiplos testes de condição

sintaxe:
```java
  
```

⚠️ **cuidado!** Se um bloco de código `if` for executado durante uma longa cadeia de esturutras condicionais, todos os blocos abaixo são automaticamente ignorados e pulados.
