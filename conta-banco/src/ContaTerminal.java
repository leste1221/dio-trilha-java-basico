import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Seja bem-vindo ao banco digital");

        System.out.println("Por favor, informe seu nome completo: ");
        String nomeCompleto = scanner.nextLine();

        System.out.println("Por favor, digite o número da Agência: ");
        int agencia = scanner.nextInt();

        System.out.println("Por favor, digite o número da conta: ");
        int conta = scanner.nextInt();

        Double saldo = 250.53;
        System.out.println("Olá " + nomeCompleto + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque");

    }
    
}
