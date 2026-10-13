package exercicios.manipulacao;

import java.util.Scanner;

public class ManipulacaoArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Digite o tamanho do array: ");
            int tamanho = scanner.nextInt();
            
            int[] array = new int[tamanho];
            
            for (int i = 0; i < tamanho; i++) {
                System.out.print("Digite o valor para posicao " + i + ": ");
                array[i] = scanner.nextInt();
            }
            
            System.out.print("Digite o indice para acessar: ");
            int indice = scanner.nextInt();
            
            int valor = acessarArray(array, indice);
            System.out.println("Valor na posicao " + indice + ": " + valor);
            
        } catch (NegativeArraySizeException e) {
            System.out.println("Erro: Tamanho do array nao pode ser negativo!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: Indice invalido para o array!");
        } catch (java.util.InputMismatchException e) {
            System.out.println("Erro: Digite numeros inteiros validos!");
        } finally {
            scanner.close();
        }
    }
    
    public static int acessarArray(int[] array, int indice) {
        if (indice < 0 || indice >= array.length) {
            throw new ArrayIndexOutOfBoundsException("Indice fora dos limites do array!");
        }
        return array[indice];
    }
}
