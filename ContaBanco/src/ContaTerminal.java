import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        String agencia;
        int numero;
        String nomeCliente;
        double saldo;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Por favor, digite o número da Agência !");
            agencia = scanner.nextLine();
            System.out.println("Por favor, digite o número da Conta !");
            numero = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Por favor, digite o seu Nome !");
            nomeCliente = scanner.nextLine();
            scanner.useLocale(Locale.US);
            System.out.println("Por favor, digite o seu Saldo !");
            saldo = scanner.nextDouble();
            scanner.useLocale(Locale.getDefault());
        }

        String mensagem = String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.", 
                                        nomeCliente, agencia, numero, saldo);
        System.out.println(mensagem);
    }
}
