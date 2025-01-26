package funcionalidades;

public class AparelhoTelefonico implements IAparelhoTelefonico {

    public AparelhoTelefonico() {
    }

    public void ligar(String numero) {
        System.out.println("lingando: " + numero);
    }

    public void atender() {
        System.out.println("atendendo ligação");
    }

    public void iniciarCorreioVoz() {
        System.out.println("iniciando correio de voz");

    }
}

