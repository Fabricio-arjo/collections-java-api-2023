package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    
    // Criando o atributo tarefas , com generics.
    private List<Tarefa> tarefaList;

    //Construtor    
    public ListaTarefa(){
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String decsricao){
         tarefaList.add(new Tarefa(decsricao));
    }

    public void removerTarefa(String descricao){
      //Declarar objeto do tipo tarefa.
      List<Tarefa> tarefasParaRemover = new ArrayList<>();

         if(!tarefaList.isEmpty()){
            for(Tarefa t : tarefaList){
                tarefasParaRemover.add(t);
            }
         }else{
            System.out.println("A lista está vazia.");
         }

    }
    
    public int obterNumeroTotalTarefas(){
          return tarefaList.size();
    }

    public void obterDescricoesTarefas(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa= new ListaTarefa();

        System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 2");
        
        System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.removerTarefa("Tarefa 1");
        System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.obterDescricoesTarefas();
    }

}
