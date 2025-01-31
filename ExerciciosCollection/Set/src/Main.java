import operacoesbasicas.ConjuntoPalavrasUnicas;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();

        conjuntoPalavrasUnicas.adicionarPalavra("maluco");
        conjuntoPalavrasUnicas.adicionarPalavra("teste");
        conjuntoPalavrasUnicas.adicionarPalavra("anta");

        conjuntoPalavrasUnicas.exibirPalavrasUnicas();
        conjuntoPalavrasUnicas.removerPalavra("anta");
        System.out.println("após remoção: ");
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();


    }
}