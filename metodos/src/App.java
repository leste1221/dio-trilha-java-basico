public class App {
    public static void main(String[] args) throws Exception {
        String primeiroNome = "Welton";
        String segundoNome = "Sampaio Vieira";
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);

        String numero1 = "5";
        String numero2 = "10";
        String somar = somar(numero1, numero2);
        System.out.println(somar);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
    }

    public static String somar (String numero1, String numero2) {
        return "Resultado do método " + numero1.concat(" ").concat(numero2);
    }
}
