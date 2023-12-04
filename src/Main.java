import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            double valor = sc.nextDouble();

            int[] notas = {100, 50, 20, 10, 5, 2};
            int[] moedas = {100, 50, 25, 10, 5, 1};

            int parteInteira = (int) valor;
            int parteDecimal = (int) ((valor - parteInteira) * 100);

            System.out.println("NOTAS:");
            for (int nota : notas) {
                int quantidadeNotas = parteInteira / nota;
                parteInteira %= nota;
                System.out.printf("%d nota(s) de R$ %.2f%n", quantidadeNotas, nota / 100.0);
            }

            System.out.println("MOEDAS:");
            for (int moeda : moedas) {
                int quantidadeMoedas = parteDecimal / moeda;
                parteDecimal %= moeda;
                System.out.printf("%d moeda(s) de R$ %.2f%n", quantidadeMoedas, moeda / 100.0);
            }
        }
    }
}
