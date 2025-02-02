import operacoesbasicas.ConjuntoPalavrasUnicas;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();

        conjuntoPalavrasUnicas.adicionarPalavra("teste");
        conjuntoPalavrasUnicas.adicionarPalavra("teste1");
        conjuntoPalavrasUnicas.adicionarPalavra("teste2");

        conjuntoPalavrasUnicas.exibirPalavrasUnicas();
        conjuntoPalavrasUnicas.removerPalavra("teste1");
        System.out.println("após remoção: ");
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();


    }
}