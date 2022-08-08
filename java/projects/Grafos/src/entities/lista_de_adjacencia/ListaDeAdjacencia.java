package entities.lista_de_adjacencia;

public class ListaDeAdjacencia {
  
  private int numeroDeVertices;
  private int numeroDeArestas;
  private ListaDeVertice[] vertice;

  public ListaDeAdjacencia(int numeroDeVertices){
    this.numeroDeVertices = numeroDeVertices;
    this.numeroDeArestas = 0;
    vertice = new ListaDeVertice[numeroDeVertices];
  }

  public void connect(int i, int j){
    numeroDeArestas++;
    vertice[i].connect(j);
    vertice[j].connect(i);
  }

}
