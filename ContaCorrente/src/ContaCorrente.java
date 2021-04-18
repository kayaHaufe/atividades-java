import java.util.Scanner;

public class ContaCorrente {
	private int conta;
	private String titular, erro;
	private double saldo, limite, limiteUtilizado, saldoLimite;
		
	public ContaCorrente(int $conta, String $titular, double $saldo, double $limite) {
		conta = $conta;
		titular = $titular;
		limite = $limite;
		
		if($saldo >= 0) {
			saldo = $saldo;
			saldoLimite = saldo + limite;
		} else {
			erro = "Saldo não pode ser menor que zero";
		}
	}
	
	public ContaCorrente(int $conta, String $titular, double $saldo) {
		conta = $conta;
		titular = $titular;
		limite = 1000;
		
		if($saldo >= 0) {
			saldo = $saldo;			
		} else {
			erro = "Saldo não pode ser menor que zero";
		}
	}
	
	public ContaCorrente(int $conta, String $titular) {
		conta = $conta;
		titular = $titular;
		saldo = 0;
		limite = 0;
	}
	
	public double deposito(double valorDeposito) {
		if(valorDeposito > 0) {
			saldo += valorDeposito;			
		} else {
			erro = "Valor de depósito deve ser maior que zero";
		}
		
		return saldo;
	}
	
	public double saque(double valorSaque) {		
		if(valorSaque > 0) {
			if(valorSaque <= saldo) {
				saldo -= valorSaque;
			} else if(valorSaque <= saldoLimite){
				limiteUtilizado += (saldo - valorSaque)*-1;
				limite -= (saldo - valorSaque)*-1;
				saldo = 0;
				saldoLimite = limite;
			} else {
				erro = "Recursos insuficientes";
			}
		} else {
			erro = "Valor a ser sacado deve ser maior que zero";
		}
		
		return saldo;
	}
	
	public void showData() {
		System.out.print("\n\nConta: " + conta + "\nTitular: " + titular + "\nSaldo: R$" + saldo + "\nLimite disponível: R$" + limite + "\nLimite utilizado: R$" + limiteUtilizado + "\n");
	}
	
	public void verifyError() {
		if(erro != null) {
			System.out.print("\n" + erro);
		}
	}
}