import java.util.Scanner;
import java.util.Arrays;

public class Ordenacao {
    public void ordenarArray() {
        // Criação de scanner para entrada de dados
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário a lista de números e converte em um array de inteiros
        System.out.print("Digite uma lista de números separados por vírgula para ordenar: ");
        int[] arrayOrdenar = Arrays.stream(scanner.nextLine().split(","))
                                    .mapToInt(Integer::parseInt)
                                    .toArray();

        // Ordena o array
        Arrays.sort(arrayOrdenar);

        // Exibe o resultado
        System.out.println("Array ordenado: " + Arrays.toString(arrayOrdenar));

        // Fecha o scanner
        scanner.close();
    }
}
