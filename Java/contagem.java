import java.util.Scanner;

public class Contagem {
    public void contarNumeros() {
        // Criação de scanner para entrada de dados
        Scanner scanner = new Scanner(System.in);

        // Solicita os valores
        System.out.print("Digite o valor inicial: ");
        int inicio = scanner.nextInt();
        System.out.print("Digite o valor final: ");
        int fim = scanner.nextInt();

        int contador = 0;

        // Conta os números no intervalo
        for (int i = inicio; i <= fim; i++) {
            contador++;
        }

        // Exibe o resultado no console
        System.out.println("A quantidade de números entre " + inicio + " e " + fim + " é: " + contador);

        scanner.close();
    }
}
