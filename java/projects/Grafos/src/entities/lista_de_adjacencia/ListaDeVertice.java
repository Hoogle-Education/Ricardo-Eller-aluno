package entities.lista_de_adjacencia;

import java.util.ArrayList;
import java.util.List;

public class ListaDeVertice {

  private int verticePrincipal;
  private List<Integer> vertices;
  
  protected ListaDeVertice(int verticePrincipal) {
    this.verticePrincipal = verticePrincipal;
    vertices = new ArrayList<>();
  }

  protected void connect(Integer vertice){
    vertices.add(vertice);
  }

  protected void disconnect(Integer vertice){
    vertices.removeIf( e -> e.intValue() == vertice.intValue() );
  }

  protected int getVerticePrincipal() {
    return verticePrincipal;
  }

}
