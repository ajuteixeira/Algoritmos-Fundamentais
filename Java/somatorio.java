import java.util.Scanner;
import java.util.Arrays;

public class Somatorio {
    public void calcularSomatorio() {
        // Lê a lista de números separada por vírgula
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma lista de números separados por vírgula: ");
        
        // Converte os números para inteiros e calcula a soma
        int soma = Arrays.stream(scanner.nextLine().split(","))
                         .mapToInt(Integer::parseInt)
                         .sum();
        
        // Exibe o resultado
        System.out.println("O somatório dos números é: " + soma);
        
        // Fecha o scanner
        scanner.close();
    }
}
