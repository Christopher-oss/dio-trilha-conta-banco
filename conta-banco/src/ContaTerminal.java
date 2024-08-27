import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        /*
         * int numero = 1021;
         * String agencia = "067-8";
         * String nomeCliente = "MARIO ANDRADE";
         * double saldo = 237.48;
         */

        // Criação do metodo Scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da conta:");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite o número da agência:");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o nome de usuario:");
        String nomeCliente = scanner.next();
        
        System.out.println("Por favor, digite o valor de deposito:");
        double saldo = scanner.nextDouble();

        // Mensagem de exibição para o usario
        System.out.println("Olá" + " " + nomeCliente + "," + " obrigado por criar uma conta em nosso banco!");
        System.out.println("Sua agência é" + " " + "N°" + agencia + ".");
        System.out.println("Conta" + " " + "N°" + numero + ".");
        System.out.println("Seu saldo atual é de:" + " " + "R$" + saldo + ".");
        System.out.println("Valor disponivel para saque:" + " " + "R$" + saldo + ".");
    }
}
