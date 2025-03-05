import java.util.Scanner;

public class MDC {
    public void calcularMDC() {
        // Criação de scanner para entrada de dados
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário os dois números para calcular o MDC
        System.out.print("Digite o primeiro número para calcular o MDC: ");
        int a = scanner.nextInt();
        System.out.print("Digite o segundo número para calcular o MDC: ");
        int b = scanner.nextInt();

        // Calcular o MDC
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        // Exibe o resultado no console
        System.out.println("O MDC dos números informados é: " + a);

        // Fecha o scanner
        scanner.close();
    }
}
