import java.util.Scanner;

public class TesteCC {
	public static void main(String[] args) {
		ContaCorrente cc1 = new ContaCorrente(12345, "Joao da Silva", 0, 500);
		cc1.showData();
		
		ContaCorrente cc2;
		cc2 = new ContaCorrente(54321, "Maria dos Santos", 500, 200);
		cc2.showData();
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.printf("\nValor para depósito em c1: R$");
		double valor = entrada.nextDouble();
		
		cc1.deposito(valor);
		cc1.showData();
		cc1.verifyError();

		System.out.printf("\nValor para saque em c2: R$");
		cc2.saque(entrada.nextDouble());
		cc2.showData();
		cc2.verifyError();
	}
}