package exercicios.validacao;

import java.util.Scanner;

public class ValidacaoNull {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Digite uma string: ");
            String entrada = scanner.nextLine();
            
            if (entrada == null) {
                entrada = "";
            }
            
            int tamanho = entrada.length();
            System.out.println("Comprimento da string: " + tamanho);
            
        } catch (NullPointerException e) {
            System.out.println("Erro: A string e nula!");
        } finally {
            scanner.close();
        }
    }
}
