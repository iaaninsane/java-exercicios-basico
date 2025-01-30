package operacoesbasicas.tarefas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {

    private List<Tarefa> tarefaList;

    public ListaTarefas() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        List tarefasARemover = new ArrayList<>();

        for (Tarefa tarefaARemover : tarefaList){

           if (descricao.equals(tarefaARemover.getDescricao())){
               tarefasARemover.add(tarefaARemover);
           }
        }
        tarefaList.removeAll(tarefasARemover);
    }

    public int obterNumeroTotalTarefas(){
        return tarefaList.size();
    }

    @Override
    public String toString() {
        return String.join(", ", tarefaList.stream()
                .map(Tarefa::getDescricao)
                .toList());
    }

}
