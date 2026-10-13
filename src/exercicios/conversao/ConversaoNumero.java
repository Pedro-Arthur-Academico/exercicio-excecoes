package exercicios.conversao;

import java.util.Scanner;

public class ConversaoNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Digite uma string para converter em numero inteiro: ");
            String entrada = scanner.nextLine();
            
            int numero = Integer.parseInt(entrada);
            System.out.println("Numero convertido com sucesso: " + numero);
            
        } catch (NumberFormatException e) {
            System.out.println("Erro: A string nao pode ser convertida em numero inteiro!");
        } finally {
            scanner.close();
        }
    }
}
