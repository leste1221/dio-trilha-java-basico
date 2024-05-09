import java.util.Locale;
import java.util.Scanner;

public class ScannerTeste {

    public static void main(String[] args) {
        //criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite um número: ");
        int numero1 = scanner.nextInt();

        System.out.println("Digite outro número: ");
        int numero2 = scanner.nextInt();

        int resultado = numero1 + numero2;

        System.out.println("O resultado de " + numero1 + "+" + numero2 + " é igual á " + resultado);
    }
    
}
