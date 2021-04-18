package ContaBancaria;
import java.util.Scanner;

public class ContaBancaria {
	public static void main(String[] args) {
		double num, media, maior = 0, menor = 0, soma = 0;
		int i = 0, length;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Quantos n�meros voc� digitar�: ");
		length = entrada.nextInt();
		
		double[] numeros = new double[length];
		
		do {
			System.out.print("\nN�mero: ");
			
			num = entrada.nextDouble();
			
			while(num < 0) {
				System.out.print("\nDigite um n�mero positivo: ");
				
				num = entrada.nextDouble();
			}

			numeros[i] = num;
			
			soma += num;
			
			if(i == 0) {
				maior = menor = num;
			}
			
			if(num > maior) {
				maior = num;
			}
			
			if(num < menor) {
				menor = num;
			}
			
			i++;
			
		} while(i < length);
		
		media = soma/length;
		
		System.out.print("M�dia: " + media + "\nMaior n�mero: " + maior + "\nMenor n�mero: " + menor);
	}
}