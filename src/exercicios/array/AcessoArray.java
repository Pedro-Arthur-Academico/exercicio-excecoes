package exercicios.array;

import java.util.Scanner;

public class AcessoArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] numeros = {10, 20, 30, 40, 50};
        
        try {
            System.out.print("Digite o indice desejado: ");
            int indice = scanner.nextInt();
            
            int valor = acessarElemento(numeros, indice);
            System.out.println("Valor no indice " + indice + ": " + valor);
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: Indice invalido! O array tem " + numeros.length + " elementos.");
        } catch (java.util.InputMismatchException e) {
            System.out.println("Erro: Digite um numero inteiro valido!");
        } finally {
            scanner.close();
        }
    }
    
    public static int acessarElemento(int[] array, int indice) {
        return array[indice];
    }
}
