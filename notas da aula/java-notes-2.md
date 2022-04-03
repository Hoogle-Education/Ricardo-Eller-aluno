# Vetores - *Arrays unidimensionais*

Vetores são conjuntos de de um mesmo tipo de variável.

## Propriedades

1. Homogêneo
2. Contíguo na memória
3. Indexado em zero

## Vantagens

* Fácil acesso a um indice

## Desvantagens

* Limitado pelo tamanho.
* a deleção de um elemento não é prática e pode trazer problemas.

## Sintaxe - Criação

criando um vetor já com os elementos definidos:
```java
  int[] array = {1, 2, 3, 4, 5};
```

criando um vetor reservando os espaços:
```java
  int[] array = new int[100];
```
O código acima cria um vetor com 100 espaços para números inteiros indo de 0 até 99.

## Sintaxe - Acesso

Para acessar um elemento na posição `i` do vetor, basta mencionar o nome com `[i]` ao seu lado. Exemplo:

```java
  array[i];
```

# Entrada de valores - `Scanner`

O modelo `Scanner` do java precisa ser importaddo e é uma classe que pede uma manipulação um pouco mais delicada que o processo de realizar entradas em outras linguagens.

## Importando

```java
  import java.util.Scanner;
```

## Criando um Scanner

```java
  Scanner input = new Scanner(System.in);
```

## Fechando o `Scanner`

```java
  input.close();
```

## Usando o `Scanner`

|Método|O que ele faz?|
|:--:|:--:|
|`input.next()`| Lê uma `String` única no terminal |
|`input.nextLine()`|Lê uma linha do terminal|
|`ìnput.nextInt()`| Lê o próximo `int` no terminal|
|`input.nextDouble()`| Lê o próximo `double` no terminal|