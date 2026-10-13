package exercicios.validacao;

import java.util.Scanner;

public class ConversaoMaiusculas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a quantidade de strings: ");
        int quantidade = scanner.nextInt();
        scanner.nextLine();
        
        String[] strings = new String[quantidade];
        
        for (int i = 0; i < quantidade; i++) {
            System.out.print("Digite a string " + (i + 1) + " (ou deixe em branco para null): ");
            String entrada = scanner.nextLine();
            strings[i] = entrada.isEmpty() ? null : entrada;
        }
        
        System.out.println("\nStrings em maiusculas:");
        for (int i = 0; i < strings.length; i++) {
            try {
                if (strings[i] == null) {
                    System.out.println("Indice " + i + ": null");
                } else {
                    System.out.println("Indice " + i + ": " + strings[i].toUpperCase());
                }
            } catch (NullPointerException e) {
                System.out.println("Indice " + i + ": Erro - elemento e null!");
            }
        }
        
        scanner.close();
    }
}
