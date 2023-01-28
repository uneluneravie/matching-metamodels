package br.usp.poli.metamodel;

import java.util.Arrays;
import java.util.List;

public class UserStoryMetamodel extends Metamodel {

  public List<Element> getElements() {
    return Arrays.asList(new Element[] {
        new Element("Role",
            "papel caracteriza��o abstrata comportamento ator social dentro contexto dom�nio especializado"),
        new Element("Actor",
            "ator entidade ativa realiza atividades dentro habilidades atingir metas"),
        new Element("Task",
            "tarefa especifica forma particular atingir meta"),
        new Element("Activity",
            "atividade representa trabalho empresa organiza��o executa uso processos neg�cio"),
        new Element("Capability",
            "capacidade representa habilidade ator definir escolher executar plano realiza��o meta dadas determinadas condi��es presen�a evento espec�fico"),
        new Element("Functionality",
            "Funcionalidades s�o capacidades sistema definidas requisitos funcionais"),
        new Element("Feature",
            "Caracter�stica delimitada sistema fornece valor stakeholders"),
        new Element("Hard Goal",
            "meta hard condi��o situa��o mundo stakeholders desejariam obter"),
        new Element("Soft Goal",
            "meta soft condi��o estado mundo ator desejaria obter diferentemente da meta hard "
                + "n�o existem crit�rios n�tidos condi��o foi atingida fica crit�rio desenvolvedor "
                + "julgar determinada situa��o atinge meta soft suficientemente"),
    });
  }
}
