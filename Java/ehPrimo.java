import java.util.Scanner;

public class ehPrimo {
    
    // Método para verificar se o número é primo e exibir o resultado
    public void verificarPrimo() {
        // Cria o scanner para entrada de dados
        Scanner scanner = new Scanner(System.in);
        
        // Solicita ao usuário para digitar um número
        System.out.print("Digite um número para verificar se é primo: ");
        int n = scanner.nextInt();
        
        // Verifica se o número é primo
        if (n < 2 || n % 2 == 0) {
            System.out.println("O número " + n + " não é primo.");
        } else {
            System.out.println("O número " + n + " é primo.");
        }
        
        // Fecha o scanner
        scanner.close();
    }
}
