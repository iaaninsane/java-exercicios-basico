package operacoesbasicas.carrinhodecompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> itens;

    public CarrinhoDeCompras() {

        this.itens = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
       itens.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {

        if(!itens.isEmpty()) {

            List<Item> itensARemover = new ArrayList<>();

           for (Item item : itens){
               if(item.getNome().equals(nome)){
                   itensARemover.add(item);
               }

           }

           itens.removeAll(itensARemover);
        } else {
            System.out.println("Lista vazia");
        }
    }

   public Double calcularValorTotal(){

        Double valorTotal = 0d;

        if(!itens.isEmpty()){
            for ( Item item  : itens) {

            Double valorItens = item.getPreco()*item.getQuantidade();
            valorTotal += valorItens;
            }
        } else {
            System.out.println("Lista de itens vazia!");
        }

        return valorTotal;
   }

   public void exibirItens(){

        for (Item item: itens){

            System.out.println(item);
        }

   }



}
