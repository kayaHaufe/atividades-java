import java.util.Scanner;

public class Perfil {
	public static void main(String[] args) {
		int ano, perfil;
		String dia, mes;
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Dia de seu nascimento: ");
		dia = entrada.next();
		System.out.print("Mês: ");
		mes = entrada.next();
		System.out.print("Ano: ");
		ano = entrada.nextInt();
		
		String diaMes = "" + dia + mes;
		
		perfil = (Integer.parseInt(diaMes)) + ano;
		perfil = ((perfil/100) + (perfil%100))%5;
		
		if(perfil == 0) {
			System.out.print("Tímido");
		} else if(perfil == 1){
			System.out.print("Sonhador");
		} else if(perfil == 2){
			System.out.print("Paquerador");
		} else if(perfil == 3){
			System.out.print("Atraente");
		} else if(perfil == 4){
			System.out.print("Irresístivel");
		} else {
			System.out.print("Não se enquadra");
		}
	}
}