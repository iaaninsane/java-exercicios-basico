package pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    private Set<Contato> contatosList;

    public AgendaContatos() {
        this.contatosList = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        contatosList.add(new Contato(nome, numero));
    }

    public void exibirContatos(){
        System.out.println(contatosList);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> retornoPesquisa = new HashSet<>();
        if(!contatosList.isEmpty()){
            for (Contato c : contatosList){
                if(c.getNome().startsWith(nome)){
                    retornoPesquisa.add(c);
                }
            }
        } else {
            System.out.println("lista de contatos vazia");
        }
        return retornoPesquisa;
    }

   public void atualizarNumeroContato(String nome, int novoNumero) {
       if(!contatosList.isEmpty()){
           for (Contato c : contatosList){
               if(c.getNome().equalsIgnoreCase(nome)){
                   c.setNumeroTelefone(novoNumero);
                   break;
               }
           }
       } else {
           System.out.println("lista de contatos vazia");
       }
   }

}
