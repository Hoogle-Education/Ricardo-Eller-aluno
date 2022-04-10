# Matrizes - *arrays 2D*

Matrizes, ou *arrays 2D*, são vetores de vetores, pois assim como podemos criar um vetor de inteiros, também podemos criar um vetor de "elementos" do tipo vetor.

Exemplo:
```
{ {1, 2, 3},
  {5, 6, 7},
  {9, 8, 10} }
```

## Como instanciar uma matriz

```java
  int[][] matrix = int[linhas][colunas];
```

## Como acessar uma matriz

Para acessar o elemento na linha `i`, coluna `j`, basta mencionar `matriz[i][j]`.

## Percorrendo uma matriz

```java
for(int i=0; i<linhas; i++){
  for(int j=0; j<colunas; j++){
    System.out.println( matrix[i][j] + " " )
  }
  System.out.println("");
}
```