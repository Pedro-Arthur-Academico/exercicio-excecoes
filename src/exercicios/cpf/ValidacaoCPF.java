package exercicios.cpf;

import java.util.Scanner;

public class ValidacaoCPF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um numero de CPF: ");
        String cpf = scanner.nextLine();
        
        try {
            validarCPF(cpf);
            System.out.println("CPF valido!");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        
        scanner.close();
    }
    
    public static void validarCPF(String cpf) {
        if (cpf == null) {
            throw new IllegalArgumentException("CPF nao pode ser nulo!");
        }
        
        if (cpf.length() != 11) {
            throw new IllegalArgumentException("CPF deve ter exatamente 11 caracteres!");
        }
        
        for (int i = 0; i < cpf.length(); i++) {
            if (!Character.isDigit(cpf.charAt(i))) {
                throw new IllegalArgumentException("CPF deve conter apenas numeros!");
            }
        }
    }
}
