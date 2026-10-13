package exercicios.manipulacao;

import java.util.Scanner;

public class ManipulacaoArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.println("=== Manipulacao de Arrays ===");
            System.out.println("1. Array unidimensional");
            System.out.println("2. Array bidimensional (matriz)");
            System.out.print("Escolha uma opcao: ");
            int opcao = scanner.nextInt();
            
            switch (opcao) {
                case 1:
                    manipularArrayUnidimensional(scanner);
                    break;
                case 2:
                    manipularArrayBidimensional(scanner);
                    break;
                default:
                    System.out.println("Opcao invalida!");
            }
            
        } catch (java.util.InputMismatchException e) {
            System.out.println("Erro: Digite numeros inteiros validos!");
        } finally {
            scanner.close();
        }
    }
    
    public static void manipularArrayUnidimensional(Scanner scanner) {
        try {
            System.out.print("Digite o tamanho do array: ");
            int tamanho = scanner.nextInt();
            
            if (tamanho <= 0) {
                throw new NegativeArraySizeException("Tamanho deve ser positivo!");
            }
            
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
            System.out.println("Erro: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: Indice invalido para o array!");
        }
    }
    
    public static void manipularArrayBidimensional(Scanner scanner) {
        try {
            System.out.print("Digite o numero de linhas: ");
            int linhas = scanner.nextInt();
            System.out.print("Digite o numero de colunas: ");
            int colunas = scanner.nextInt();
            
            if (linhas <= 0 || colunas <= 0) {
                throw new NegativeArraySizeException("Dimensoes devem ser positivas!");
            }
            
            int[][] matriz = new int[linhas][colunas];
            
            System.out.println("Digite os valores da matriz:");
            for (int i = 0; i < linhas; i++) {
                for (int j = 0; j < colunas; j++) {
                    System.out.print("Posicao [" + i + "][" + j + "]: ");
                    matriz[i][j] = scanner.nextInt();
                }
            }
            
            System.out.print("Digite a linha para acessar: ");
            int linha = scanner.nextInt();
            System.out.print("Digite a coluna para acessar: ");
            int coluna = scanner.nextInt();
            
            int valor = acessarMatriz(matriz, linha, coluna);
            System.out.println("Valor na posicao [" + linha + "][" + coluna + "]: " + valor);
            
            // Demonstrar acesso a dimensao inexistente
            System.out.print("Digite uma terceira dimensao (deve gerar erro): ");
            int terceiraDimensao = scanner.nextInt();
            
            // Isso vai gerar erro pois tentamos acessar uma terceira dimensao
            System.out.println("Tentando acessar terceira dimensao...");
            acessarDimensaoInexistente(matriz, linha, coluna, terceiraDimensao);
            
        } catch (NegativeArraySizeException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: Indice invalido para a matriz!");
        } catch (UnsupportedOperationException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
    
    public static int acessarArray(int[] array, int indice) {
        if (indice < 0 || indice >= array.length) {
            throw new ArrayIndexOutOfBoundsException("Indice fora dos limites do array!");
        }
        return array[indice];
    }
    
    public static int acessarMatriz(int[][] matriz, int linha, int coluna) {
        if (linha < 0 || linha >= matriz.length) {
            throw new ArrayIndexOutOfBoundsException("Linha fora dos limites da matriz!");
        }
        if (coluna < 0 || coluna >= matriz[linha].length) {
            throw new ArrayIndexOutOfBoundsException("Coluna fora dos limites da matriz!");
        }
        return matriz[linha][coluna];
    }
    
    public static void acessarDimensaoInexistente(int[][] matriz, int linha, int coluna, int terceiraDimensao) {
        // Simula tentativa de acesso a uma dimensao que nao existe
        throw new UnsupportedOperationException("A matriz e bidimensional, nao possui terceira dimensao!");
    }
}
