package operacoesbasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

    private Set<String> palavras;

    public ConjuntoPalavrasUnicas() {
        this.palavras = new HashSet<>();
    }

    public void adicionarPalavra(String palavra){
        palavras.add(palavra);
    }

    public void removerPalavra(String palavra) {
        palavras.remove(palavra);
    }

    public void verificarPalavra(String palavra) {
        if(!palavras.isEmpty()) {
            for(String p : palavras) {
                if(p.equals(palavra)) {
                    System.out.println("palavra " + palavra + " encontrada no conjunto");
                    break;
                }
            }
        } else {
            System.out.println("lista de palavras vazia");
        }
    }

    public void exibirPalavrasUnicas(){
        if (!palavras.isEmpty()){
            for(String p : palavras){
                System.out.println(p);
            }
        } else {
            System.out.println("lista de palavras vazia");
        }
    }

}
