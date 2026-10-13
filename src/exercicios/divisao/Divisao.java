package exercicios.divisao;

import java.util.Scanner;

public class Divisao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Digite o primeiro numero: ");
            int dividendo = scanner.nextInt();
            
            System.out.print("Digite o segundo numero: ");
            int divisor = scanner.nextInt();
            
            int resultado = dividendo / divisor;
            System.out.println("Resultado da divisao: " + resultado);
            
        } catch (ArithmeticException e) {
            System.out.println("Erro: Divisao por zero nao permitida!");
        } catch (java.util.InputMismatchException e) {
            System.out.println("Erro: Digite numeros inteiros validos!");
        } finally {
            scanner.close();
        }
    }
}
