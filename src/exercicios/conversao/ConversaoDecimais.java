package exercicios.conversao;

import java.util.Scanner;

public class ConversaoDecimais {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a quantidade de strings: ");
        int quantidade = scanner.nextInt();
        scanner.nextLine();
        
        String[] strings = new String[quantidade];
        
        for (int i = 0; i < quantidade; i++) {
            System.out.print("Digite a string " + (i + 1) + ": ");
            strings[i] = scanner.nextLine();
        }
        
        System.out.println("\nConversao para decimais:");
        for (int i = 0; i < strings.length; i++) {
            try {
                double valor = Double.parseDouble(strings[i]);
                System.out.println("Indice " + i + ": " + valor);
            } catch (NumberFormatException e) {
                System.out.println("Indice " + i + ": Erro - nao pode ser convertido para decimal!");
            }
        }
        
        scanner.close();
    }
}
