package exercicios.operacoes;

import java.util.Scanner;

public class OperacoesMatematicas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Digite o primeiro numero: ");
            double numero1 = scanner.nextDouble();
            
            System.out.print("Digite o segundo numero: ");
            double numero2 = scanner.nextDouble();
            
            System.out.print("Digite a operacao (soma, subtracao, multiplicacao, divisao): ");
            scanner.nextLine();
            String operacao = scanner.nextLine().toLowerCase();
            
            double resultado = executarOperacao(numero1, numero2, operacao);
            System.out.println("Resultado: " + resultado);
            
        } catch (ArithmeticException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (java.util.InputMismatchException e) {
            System.out.println("Erro: Digite numeros validos!");
        } finally {
            scanner.close();
        }
    }
    
    public static double executarOperacao(double num1, double num2, String operacao) {
        switch (operacao) {
            case "soma":
                return num1 + num2;
            case "subtracao":
                return num1 - num2;
            case "multiplicacao":
                return num1 * num2;
            case "divisao":
                if (num2 == 0) {
                    throw new ArithmeticException("Divisao por zero nao permitida!");
                }
                return num1 / num2;
            default:
                throw new IllegalArgumentException("Operacao invalida!");
        }
    }
}
