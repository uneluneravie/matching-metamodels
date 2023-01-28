package br.usp.poli.metamodel;

public class Element {

  private String name;

  private String semantics;

  public Element(String name, String semantics) {
    super();
    this.name = name;
    this.semantics = semantics;
  }

  public String getName() {
    return name;
  }

  public String getSemantics() {
    return semantics;
  }

  @Override
  public String toString() {
    return name;
  }
}
