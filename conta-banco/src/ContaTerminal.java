import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ContaTerminal {
    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência! ");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o número da conta corrente! ");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite o nome do titular da conta! ");
        String nome = scanner.next();

        System.out.println("Por favor, digite o saldo inicial da conta corrente! ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + ", " + "obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", "
                + "conta " + numero + " e seu saldo " + saldo + " já está disponível para saque." );

    }
}