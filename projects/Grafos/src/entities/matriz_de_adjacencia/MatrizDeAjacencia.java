package entities.matriz_de_adjacencia;

import java.util.Arrays;
import java.util.Stack;

import entities.enums.Flag;

public class MatrizDeAjacencia {
  
  private int numeroDeVertices;
  private int numeroDeArestas;

  private Flag[] flags;

  private int matriz_de_adjacencia[][];

  public MatrizDeAjacencia(int numeroDeVertices) {
    this.numeroDeArestas = 0;
    this.numeroDeVertices = numeroDeVertices;
    matriz_de_adjacencia = new int[numeroDeVertices+1][numeroDeVertices+1];
    flags = new Flag[numeroDeVertices+1];
    Arrays.fill(flags, Flag.NOT_VISITED);
  }

  public int getNumeroDeVertices() {
    return numeroDeVertices;
  }

  public int getNumeroDeArestas() {
    return numeroDeArestas;
  }

  public void connect(int i, int j){
    numeroDeArestas++;
    matriz_de_adjacencia[i][j] = 1;
    matriz_de_adjacencia[j][i] = 1;
  }

  public void desconnect(int i, int j){
    numeroDeArestas--;
    matriz_de_adjacencia[i][j] = 0;
    matriz_de_adjacencia[j][i] = 0;
  }

  public boolean isAdjacent(int i, int j) {
    return matriz_de_adjacencia[i][j] == 1;
  }

  public int getTotalSubgrafos() throws InterruptedException{
    int cont = 0;

    for(int i=1; i <=numeroDeVertices; i++) {
      // se existe vertice nao explorado
      // exploro ele e suas conexoes
      if(flags[i] == Flag.NOT_VISITED) {
        cont++; // conto
        dfs(i); // mando explorar
      }
    }

    return cont;
  }

  private void dfs(int vertice) throws InterruptedException {

    // pilha de vertices a serem explorados
    Stack<Integer> pilha = new Stack<>();

    // inicio adicionando o vectice que chamou
    pilha.push(vertice);
    
    while ( !pilha.empty() ) {

      // retiro e anoto o topo da pilha de vertices
      Integer topo = pilha.pop();

      // marco este topo como explorado
      flags[topo] = Flag.EXPLORED;

      // para cada posicao na matriz, que esteja
      // na linha deste vertice
      for(int i=1; i<=numeroDeVertices; i++){
        // se a conexao existe, e se a saida
        // da conexao nao esta visitada
        if(matriz_de_adjacencia[topo][i] == 1 
            && flags[i] == Flag.NOT_VISITED) {
          pilha.push(i); // adicione a pilha de processamento
        }
      }

    }

  }

}
