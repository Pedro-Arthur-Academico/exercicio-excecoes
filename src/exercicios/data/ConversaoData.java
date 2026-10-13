package exercicios.data;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ConversaoData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite uma data no formato dd/MM/yyyy: ");
        String entrada = scanner.nextLine();
        
        try {
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            Date data = formato.parse(entrada);
            System.out.println("Data convertida com sucesso: " + data);
        } catch (ParseException e) {
            System.out.println("Erro: Formato de data invalido! Use dd/MM/yyyy");
        } finally {
            scanner.close();
        }
    }
}
