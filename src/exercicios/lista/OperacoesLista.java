package exercicios.lista;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OperacoesLista {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> nomes = new ArrayList<>();
        
        boolean continuar = true;
        
        while (continuar) {
            System.out.println("\nOperacoes:");
            System.out.println("1. Adicionar nome");
            System.out.println("2. Remover nome");
            System.out.println("3. Acessar elemento");
            System.out.println("4. Listar nomes");
            System.out.println("5. Sair");
            System.out.print("Digite sua opcao: ");
            
            String opcao = scanner.nextLine();
            
            try {
                switch (opcao) {
                    case "1":
                        System.out.print("Digite o nome: ");
                        String nome = scanner.nextLine();
                        nomes.add(nome);
                        System.out.println("Nome adicionado!");
                        break;
                    case "2":
                        System.out.print("Digite o indice: ");
                        int indiceRemover = Integer.parseInt(scanner.nextLine());
                        if (indiceRemover < 0 || indiceRemover >= nomes.size()) {
                            throw new IndexOutOfBoundsException("Indice invalido!");
                        }
                        nomes.remove(indiceRemover);
                        System.out.println("Nome removido!");
                        break;
                    case "3":
                        System.out.print("Digite o indice: ");
                        int indiceAcesso = Integer.parseInt(scanner.nextLine());
                        if (indiceAcesso < 0 || indiceAcesso >= nomes.size()) {
                            throw new IndexOutOfBoundsException("Indice invalido!");
                        }
                        System.out.println("Nome: " + nomes.get(indiceAcesso));
                        break;
                    case "4":
                        System.out.println("Nomes: " + nomes);
                        break;
                    case "5":
                        continuar = false;
                        break;
                    default:
                        System.out.println("Opcao invalida!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Erro: Digite um numero inteiro valido!");
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
        
        scanner.close();
    }
}
