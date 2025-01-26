package iPhone;

import funcionalidades.AparelhoTelefonico;
import funcionalidades.NavegadorInternet;
import funcionalidades.ReprodutorMusical;

public class IPhone {

    private ReprodutorMusical reprodutorMusical;
    private NavegadorInternet navegadorInternet;
    private AparelhoTelefonico aparelhoTelefonico;

    public IPhone() {
    }

    public IPhone(ReprodutorMusical reprodutorMusical, NavegadorInternet navegadorInternet, AparelhoTelefonico aparelhoTelefonico) {
        this.reprodutorMusical = reprodutorMusical;
        this.navegadorInternet = navegadorInternet;
        this.aparelhoTelefonico = aparelhoTelefonico;
    }

}
