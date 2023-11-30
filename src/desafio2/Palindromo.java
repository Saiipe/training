package desafio2;


import java.text.Normalizer;
import java.util.Scanner;


public class Palindromo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();


        // Lógica para verificar se a frase é um palíndromo
        boolean resultado = verificarPalindromo(frase);

        if(resultado) {
            System.out.println("\"" + frase + "\"" + " é um palíndromo.");
        } else {
            System.out.println("\"" + frase + "\"" + " não é um palíndromo.");
        }

        scanner.close();
    }

    // Método para verificar se a frase é um palíndromo
    public static boolean verificarPalindromo(String frase) {
        // Implemente sua lógica aqui
            frase = Normalizer.normalize(frase, Normalizer.Form.NFD);
            frase = frase.replaceAll("[^\\p{ASCII}]", "");
            String nova = new StringBuilder(frase).reverse().toString();
            frase = frase.replace(" ","");
            nova = nova.replace(" ", "");

        return nova.equalsIgnoreCase(frase); // Altere isso para retornar verdadeiro ou falso conforme a verificação
    }
}

