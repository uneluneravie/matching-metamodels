package br.usp.poli.metamodel;

import java.util.Arrays;
import java.util.List;

public class UserStoryMetamodel extends Metamodel {

  public List<Element> getElements() {
    return Arrays.asList(new Element[] {
        new Element("Role",
            "papel caracterização abstrata comportamento ator social dentro contexto domínio especializado"),
        new Element("Actor",
            "ator entidade ativa realiza atividades dentro habilidades atingir metas"),
        new Element("Task",
            "tarefa especifica forma particular atingir meta"),
        new Element("Activity",
            "atividade representa trabalho empresa organização executa uso processos negócio"),
        new Element("Capability",
            "capacidade representa habilidade ator definir escolher executar plano realização meta dadas determinadas condições presença evento específico"),
        new Element("Functionality",
            "Funcionalidades são capacidades sistema definidas requisitos funcionais"),
        new Element("Feature",
            "Característica delimitada sistema fornece valor stakeholders"),
        new Element("Hard Goal",
            "meta hard condição situação mundo stakeholders desejariam obter"),
        new Element("Soft Goal",
            "meta soft condição estado mundo ator desejaria obter diferentemente da meta hard "
                + "não existem critérios nítidos condição foi atingida fica critério desenvolvedor "
                + "julgar determinada situação atinge meta soft suficientemente"),
    });
  }
}
