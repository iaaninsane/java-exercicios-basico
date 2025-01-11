import java.util.Scanner;

public class Contador {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite primeiro número: ");
        int primeiroNumero = scanner.nextInt();

        System.out.println("Por favor, digite segundo número: ");
        int segundoNumero = scanner.nextInt();

        try{
            contar(primeiroNumero, segundoNumero);
        } catch(ParametrosInvalidosException e){
            System.out.println("O segundo  número deve ser maior que o primeiro");
        }

    }

    static void contar (int primeiroNumero, int segundoNumero) throws ParametrosInvalidosException {
        int contador = segundoNumero - primeiroNumero;

        if (contador <=0 ){
            throw new ParametrosInvalidosException();
        }

        for (int i = 1; i <= contador; i++) {

            System.out.println("imprimindo o numero " + i);
        }
    }

}







