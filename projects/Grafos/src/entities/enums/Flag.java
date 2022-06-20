package entities.enums;

public enum Flag{
  NOT_VISITED,
  VISITED,
  EXPLORED;

  public Flag nextFlag() {
    switch(this) {
      case NOT_VISITED :
        return VISITED;

      case VISITED :
        return EXPLORED;
        
      default :
        return EXPLORED;
    }
  }
}
