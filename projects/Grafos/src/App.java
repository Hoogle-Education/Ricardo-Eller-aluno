import entities.matriz_de_adjacencia.MatrizDeAjacencia;

public class App {
    public static void main(String[] args) throws Exception {
        
        MatrizDeAjacencia grafo = new MatrizDeAjacencia(5);

        grafo.connect(1, 2);
        grafo.connect(1, 3);
        grafo.connect(4, 5);

        System.out.println(grafo.getTotalSubgrafos());

    }
}
