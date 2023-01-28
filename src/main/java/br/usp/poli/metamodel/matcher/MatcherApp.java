package br.usp.poli.metamodel.matcher;

import br.usp.poli.metamodel.Element;
import br.usp.poli.metamodel.Metamodel;
import br.usp.poli.metamodel.UmlMetamodel;
import br.usp.poli.metamodel.UserStoryMetamodel;

public class MatcherApp {

  public static void main(String[] args) {
    final Metamodel M1 = new UmlMetamodel();
    final Metamodel M2 = new UserStoryMetamodel();

    long t0 = System.currentTimeMillis();

    cartesianProductComparison(M1, M2);

    long t1 = System.currentTimeMillis();
    System.out.println("Done in " + (t1 - t0) + " msec.");
  }

  private static void cartesianProductComparison(Metamodel m1, Metamodel m2) {
    for (Element e1 : m1.getElements()) {
      for (Element e2 : m2.getElements()) {
        new Comparison(e1, e2).print();
      }
    }
  }

}
