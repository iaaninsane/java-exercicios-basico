import operacoesbasicas.carrinhodecompras.CarrinhoDeCompras;
import operacoesbasicas.tarefas.ListaTarefas;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Começando...");

        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.adicionarTarefa("Arrumar");
        listaTarefas.adicionarTarefa("Limpar");
        listaTarefas.adicionarTarefa("Dormir");
        listaTarefas.adicionarTarefa("Limpar");

        System.out.println("A lista de tarefas é composta por: " + listaTarefas);
        System.out.println("A lista de tarefas tem um total de: " + listaTarefas.obterNumeroTotalTarefas() + " tarefas");


        listaTarefas.removerTarefa("Limpar");

        System.out.println("Agora, a lista de tarefas é composta por: " + listaTarefas);
        System.out.println("A lista de tarefas tem um total de: " + listaTarefas.obterNumeroTotalTarefas() + " tarefas");

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionarItem("pedra", 500, 10);
        carrinho.adicionarItem("papel", 500, 10);
        carrinho.adicionarItem("tesoura", 500, 10);

       carrinho.exibirItens();


    }
}