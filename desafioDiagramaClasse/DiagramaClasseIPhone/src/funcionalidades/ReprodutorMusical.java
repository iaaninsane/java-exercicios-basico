package funcionalidades;

public class ReprodutorMusical implements IReprodutorMusical{

    public ReprodutorMusical() {
    }

    public void selecionarMusica(String musica) {
        System.out.println("Musica selecionada: " + musica);
    }

    public void tocar() {
        System.out.println("tocando musica...");
    }

    public void pausar() {
        System.out.println("musica pausada");

    }
}
