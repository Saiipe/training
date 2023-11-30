package deasfio1;

import java.util.Scanner;

public class NumeroArmstrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        // Lógica para verificar se o número é um número de Armstrong
        boolean resultado = verificarArmstrong(numero);

        if(resultado) {
            System.out.println(numero + " é um número de Armstrong.");
        } else {
            System.out.println(numero + " não é um número de Armstrong.");
        }

        scanner.close();
    }

    // Método para verificar se o número é um número de Armstrong
    public static boolean verificarArmstrong(int num) {
        // Implemente sua lógica aqui
        int length = String.valueOf(num).length();
        String numeroStr = Integer.toString(num);

        int resultnumber = 0;
        for (int i = 0; i < numeroStr.length();i++){
            int number = Character.getNumericValue(numeroStr.charAt(i));
            //int number = Integer.parseInt(String.valueOf(numeroStr.charAt(i)));
            resultnumber += (int) Math.pow(number, length);

        }
        return resultnumber == num;  // Altere isso para retornar verdadeiro ou falso conforme a verificação
    }
}
