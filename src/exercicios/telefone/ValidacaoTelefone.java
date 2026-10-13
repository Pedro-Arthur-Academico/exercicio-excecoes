package exercicios.telefone;

import java.util.Scanner;

public class ValidacaoTelefone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um numero de telefone: ");
        String telefone = scanner.nextLine();
        
        try {
            validarTelefone(telefone);
            System.out.println("Telefone valido!");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        
        scanner.close();
    }
    
    public static void validarTelefone(String telefone) {
        if (telefone == null) {
            throw new IllegalArgumentException("Telefone nao pode ser nulo!");
        }
        
        if (telefone.length() != 9) {
            throw new IllegalArgumentException("Telefone deve ter exatamente 9 digitos!");
        }
        
        for (int i = 0; i < telefone.length(); i++) {
            if (!Character.isDigit(telefone.charAt(i))) {
                throw new IllegalArgumentException("Telefone deve conter apenas digitos!");
            }
        }
    }
}
