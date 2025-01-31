package operacoesbasicas.catalogodelivros;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    private List<Livro> livros;

    public CatalogoLivros() {
        this.livros =new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livros.add(new Livro(titulo, autor, anoPublicacao));

    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> resultPesquisa = new ArrayList<>();
        if (!livros.isEmpty()) {
            for (Livro livro : livros) {
                if (livro.getAutor().equalsIgnoreCase(autor)) {
                    resultPesquisa.add(livro);
                }
            }
        } else {
            System.out.println("lista de livros vazia");
        }
        return resultPesquisa;
    }

    public List<Livro> pesquisarPorIntervaloAno(Integer anoInicial, Integer anoFinal) {
        List<Livro> resultPesquisa = new ArrayList<>();
        if(!livros.isEmpty()) {
            for(Livro livro: livros){
                if(livro.getAnoPublicacao()>= anoInicial && livro.getAnoPublicacao() <= anoFinal){
                    resultPesquisa.add(livro);
                }
            }

        } else {
            System.out.println("lista de livros vazia");
        }
        return resultPesquisa;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroPorTitulo = null;
        if (!livros.isEmpty()) {
            for (Livro l : livros) {
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = l;
                    break;
                }
            }

        } else {
            System.out.println("lista de livros vazia");
        }
        return livroPorTitulo;
    }

}
