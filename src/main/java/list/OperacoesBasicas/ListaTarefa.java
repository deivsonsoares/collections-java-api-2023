package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    //atributo
    private List<Tarefa> tarefaList;
    //construtor

    //criar nem array lista vazia
    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }
    //adicionar tarefa na lista
    public void adicionarTarefa(String decricao){
        tarefaList.add(new Tarefa(decricao));
    }
    //remover tarefa na lista
    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for(Tarefa t: tarefaList){
            if (t.getDescricao().equalsIgnoreCase(descricao)){
            tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }
    //obter numero total de tarefas
    public int obterNumeroTotalTarefas(){
        return tarefaList.size();
    }
    //obert descricoes tarefas
    public  void obterDescricoesTarefas(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();
        System.out.println("O numero total de elementos na lista é:"+ listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 2");
        System.out.println("O numero total de elementos na lista é:"+ listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.removerTarefa("Tarefa 2");
        System.out.println("O numero total de elementos na lista é:"+ listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.obterDescricoesTarefas();
    }
}
