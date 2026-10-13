package exercicios.operacoes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MediaNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a quantidade de numeros: ");
        int quantidade = scanner.nextInt();
        
        List<Double> numeros = new ArrayList<>();
        
        for (int i = 0; i < quantidade; i++) {
            System.out.print("Digite o numero " + (i + 1) + ": ");
            try {
                double numero = scanner.nextDouble();
                numeros.add(numero);
            } catch (java.util.InputMismatchException e) {
                System.out.println("Erro: Digite um numero valido!");
                scanner.nextLine();
                i--;
            }
        }
        
        try {
            double media = calcularMedia(numeros);
            System.out.println("Media: " + media);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        
        scanner.close();
    }
    
    public static double calcularMedia(List<Double> numeros) {
        if (numeros == null || numeros.isEmpty()) {
            throw new IllegalArgumentException("A lista nao pode estar vazia!");
        }
        
        double soma = 0;
        for (Double numero : numeros) {
            if (numero == null) {
                throw new IllegalArgumentException("A lista contem valores nulos!");
            }
            soma += numero;
        }
        
        return soma / numeros.size();
    }
}
