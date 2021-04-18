import java.util.Scanner;

public class CaixaEletronico {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.printf("Número da conta: ");
		int conta = entrada.nextInt();
		
		System.out.printf("Nome do titular: ");
		String titular = entrada.next();
		
		System.out.printf("Saldo: ");
		double saldo = entrada.nextDouble();
		
		System.out.printf("Limite: ");
		double limite = entrada.nextDouble();
		
		ContaCorrente cliente = new ContaCorrente(conta, titular, saldo, limite);
		cliente.menu();
		cliente.verifyError();
	}
}