import java.util.Scanner;

public class Fibonacci {
    public void gerarFibonacci() {
        // Criação de scanner para entrada de dados
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário a quantidade de termos da sequência
        System.out.print("Digite a quantidade de termos da sequência de Fibonacci: ");
        int numFibonacci = scanner.nextInt();

        // Inicializa as variáveis para os dois primeiros termos
        int a = 0, b = 1, aux;
        StringBuilder resultado = new StringBuilder();

        // Adiciona os primeiros dois termos
        resultado.append(a).append(", ").append(b);

        // Gera os outros termos da sequência
        for (int i = 2; i < numFibonacci; i++) {
            aux = a + b;
            resultado.append(", ").append(aux);
            a = b;
            b = aux;
        }

        // Exibe o resultado no console
        System.out.println("Os primeiros " + numFibonacci + " termos da sequência de Fibonacci são: " + resultado);

        // Fecha o scanner
        scanner.close();
    }
}
