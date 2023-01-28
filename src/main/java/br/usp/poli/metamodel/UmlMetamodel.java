package br.usp.poli.metamodel;

import java.util.Arrays;
import java.util.List;

public class UmlMetamodel extends Metamodel {

  public List<Element> getElements() {
    return Arrays.asList(new Element[] {
        new Element("Service",
            "Serviço descreve funcionalidade realizada Sistema sob consideração (System under Consideration - SUC) "
                + "Serviço pode fornecer valor Ator auxiliá-lo realização meta"
                + "Serviço pode auxiliar realização outro Serviço"),
        new Element("Actor",
            "Ator sistema pessoa papel dedicado utiliza funcionalidade fornecida"),
        new Element("Function",
            "Função descreve processo aplicado objeto atributo objeto domínio sistema"),
        new Element("Simple Service",
            "estruturar refinar funcionalidade SUC Serviço abstrato especializado Serviço Complexo Serviço Simples"),
        new Element("Complex Service",
            "contraste Serviços Simples podem ser refinados Serviços Complexos podem consistir outros Serviços"),
        new Element("System",
            "sistema pode ser definido conjunto serviços fornecidos interoperabilidade entre esses serviços"),
        new Element("Quality of Service",
            "Qualidade Serviço caracteriza qualidade Serviço relacionado"),
        new Element("Quality of System",
            "Qualidade Sistema contraste Qualidade Serviço endereça qualidade SUC completo"),
        new Element("Function Object",
            "Objeto de Função representa objeto atributo objeto domínio sistema"),
    });
  }
}
