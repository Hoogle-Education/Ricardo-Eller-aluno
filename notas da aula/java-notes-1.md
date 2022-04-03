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
|Booleano|`boolean`|armazena `true` ou `false`|

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
if( /*condição*/ ){
  /*Bloco de código se for verdade*/
}else if( /*condição 2*/){

}else if(/*ccondição 3*/){

}else{
  /*Bloco de código se for falso*/
}
```

⚠️ **cuidado!** Se um bloco de código `if` for executado durante uma longa cadeia de esturutras condicionais, todos os blocos abaixo são automaticamente ignorados e pulados.

# Estruturas de repetição

## Keyword - `break`

Basicamente ela força a parada do loop no ponto em que for lida.

```java
 while (true) {

  if(pression == 10) break;

 }
```

##  keyword - `continue`

Ela serve para pular os comandos de um determinado laço e avançar para o próximo laço.

```java
while (true) {

  if(pression < 5 ) continue;
  if(pression == 10) break;

 }
```

## Estrutura `while` - *enquanto*

Objetivo fazer ações enquanto uma determinada condição durar. Exige uma atualização ou critério de parada. 

sintaxe:
```java
  while( /*condição*/ ){
    // faça algo
  }
```

Exemplo: Prenchendo e esvanziando estoque.
```java
while (estoque != 0){
  if( estoque > 0 ){
    System.out.println("continua vendendo... || Estoque = " + estoque);
    estoque--;
   }else{
    System.out.println("continua comprando... || Estoque = " + estoque);
    estoque++;
   }
}
```

Exemplo: Contador
```java
int i = 10;

while( i >= 0 ){
  System.out.println(i);
  i--;
}
```

## Esturura `for` - *para*

Lida da mesma forma que o `while` porém possui mais recursos e é mais limpo de ler e escrever.

```java

for( /*inicialização*/ ; /*validação*/ ; /*atualização*/ ){
  // faça algo
}

```

```java
for(int i=10 ; i>=0; i--){

}
```