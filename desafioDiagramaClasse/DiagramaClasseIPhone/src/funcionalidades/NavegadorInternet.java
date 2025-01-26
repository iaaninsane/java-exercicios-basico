package funcionalidades;

public class NavegadorInternet implements INavegadorInternet {


    public NavegadorInternet() {
    }

    public void exibirPagina(String url) {
        System.out.println("exibindo página: " + url);
    }

    public void adicionarNovaAba() {
        System.out.println("adicionando nova aba");
    }

    public void atualizarPagina() {
        System.out.println("atualizando pagina");

    }
}
