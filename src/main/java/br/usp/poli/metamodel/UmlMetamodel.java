package br.usp.poli.metamodel;

import java.util.Arrays;
import java.util.List;

public class UmlMetamodel extends Metamodel {

  public List<Element> getElements() {
    return Arrays.asList(new Element[] {
        new Element("Service",
            "Servi�o descreve funcionalidade realizada Sistema sob considera��o (System under Consideration - SUC) "
                + "Servi�o pode fornecer valor Ator auxili�-lo realiza��o meta"
                + "Servi�o pode auxiliar realiza��o outro Servi�o"),
        new Element("Actor",
            "Ator sistema pessoa papel dedicado utiliza funcionalidade fornecida"),
        new Element("Function",
            "Fun��o descreve processo aplicado objeto atributo objeto dom�nio sistema"),
        new Element("Simple Service",
            "estruturar refinar funcionalidade SUC Servi�o abstrato especializado Servi�o Complexo Servi�o Simples"),
        new Element("Complex Service",
            "contraste Servi�os Simples podem ser refinados Servi�os Complexos podem consistir outros Servi�os"),
        new Element("System",
            "sistema pode ser definido conjunto servi�os fornecidos interoperabilidade entre esses servi�os"),
        new Element("Quality of Service",
            "Qualidade Servi�o caracteriza qualidade Servi�o relacionado"),
        new Element("Quality of System",
            "Qualidade Sistema contraste Qualidade Servi�o endere�a qualidade SUC completo"),
        new Element("Function Object",
            "Objeto de Fun��o representa objeto atributo objeto dom�nio sistema"),
    });
  }
}
