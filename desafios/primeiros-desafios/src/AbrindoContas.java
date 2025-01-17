import java.util.Scanner;

public class AbrindoContas {

    public static void main(String[] args) {
        // Lendo os dados de Entrada:
        Scanner scanner = new Scanner(System.in);
        int numeroConta = scanner.nextInt();
        scanner.nextLine(); // Consome a quebra de linha após a entrada do número da conta
        String nomeTitular = scanner.nextLine();
        double saldo = scanner.nextDouble();
        scanner.close();

        // DONE: Criar uma instância de "ContaBancaria" com os valores de Entrada.
        ContaBancaria minhaConta = new ContaBancaria(numeroConta, nomeTitular, saldo);

        System.out.println("Informacoes:");
        // DONE: Imprimir as informações da conta usando o objeto criado acima.
        System.out.println("Conta: " + minhaConta.numero);
        System.out.println("Titular: " + minhaConta.titular);
        System.out.println("Saldo: R$ " + minhaConta.saldo);
    }
}

class ContaBancaria {
    int numero;
    String titular;
    double saldo;

    public ContaBancaria(int numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }
}