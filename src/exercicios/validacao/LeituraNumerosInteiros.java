package exercicios.validacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LeituraNumerosInteiros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();
        
        System.out.println("Digite numeros inteiros. Digite 'sair' para encerrar:");
        
        while (true) {
            System.out.print("Digite um numero: ");
            String entrada = scanner.nextLine();
            
            if (entrada.equalsIgnoreCase("sair")) {
                break;
            }
            
            try {
                int numero = Integer.parseInt(entrada);
                numeros.add(numero);
                System.out.println("Numero adicionado com sucesso!");
            } catch (NumberFormatException e) {
                System.out.println("Erro: Digite um numero inteiro valido!");
            }
        }
        
        System.out.println("\nNumeros lidos: " + numeros);
        scanner.close();
    }
}
