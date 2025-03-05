public class ehPrimo {
    public void verificarPrimo(int n) {
        boolean primo;

        // Considera que números menores que 2 não são primos
        if (n < 2) {
            primo = false;
        } else {
            // Verifica se o número é divisível por 2
            primo = n % 2 != 0;
        }

        // Exibe o resultado no console
        System.out.println("O número " + n + " é primo? " + primo);
    }
}
