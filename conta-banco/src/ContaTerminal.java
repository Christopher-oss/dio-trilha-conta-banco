import java.util.Scanner;

/**
 * <h1>Criação de Conta Bancaria
 * <h1>
 * 
 * <p>Este formulario captura dados do usuario utilizando a classe Scanner, e
 * dovolve como print na tela as informações.<p>
 * 
 * <B>Note:<b/> Leia atentamente a documentação desta classe
 * para desfrutar dos recursos oferecidos pelo autor.
 *
 * @author Christopher Martins
 * @version 1.0
 * @since 27/08/2024
 */

public class ContaTerminal {

    /**
     * Este metodo é utilizado para capturar os dados do usuario
     * 
     * @param numero          este é o primeiro parametro de metodo, que captura os dados da conta do usuario.
     * @param agencia         este é o segundo parametro de metodo, que captura os dados da agencia do usuario
     * @param nomeCliente     este é o terceiro parametro de metodo, que captura os dados da agencia do usuario
     * @param saldo           este é o quarto parametro de metodo, que captura os dados do saldo do usuario.
     * @return o sistema irá printar os dados junto a mensagem definida na classe.
     */
    public static void main(String[] args) {

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
