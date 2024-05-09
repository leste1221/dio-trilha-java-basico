public class App {
    public static void main(String[] args) throws Exception {
        String primeiroNome = "Welton";
        String segundoNome = "Sampaio Vieira";
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);

        int numero1 = 5;
        int numero2 = 10;
        int somar = somar(numero1, numero2);
        System.out.println(somar);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
    }

    public static int somar (int numero1, int numero2) {
        return numero1*numero2;
        
    }
}
