package operacoesbasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    private Set<Convidado> convidados;

    public ConjuntoConvidados() {
        this.convidados = new HashSet<>();
    }

    public void adicionarConvidado(String nome, Integer codigoConvite) {
        convidados.add(new Convidado(nome, codigoConvite));
    }

   public void removerConvidadoPorCodigoConvite(Integer codigoConvite) {
        Convidado convidadoARemover = null;
        if(!convidados.isEmpty()){
            for(Convidado c : convidados){

                if(c.getCodigoConvite() == codigoConvite){
                    convidadoARemover = c;
                    break;
                }

            }
         convidados.remove(convidadoARemover);
        }
        else {
            System.out.println("Lista de convidados vazia");
        }
   }

   public Integer contarConvidados(){
        return convidados.size();
   }

   public void exibirConvidados() {
       System.out.println(convidados);
   }

}
