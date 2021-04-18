
public class Data {
	private int mes, dia, ano;
	int diasMes[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public boolean bissexto() {
		if((ano%4 == 0 || ano%400 == 0) && ano%100 != 0) {
			diasMes[2] = 29;
			System.out.print("Ano bissexto!");
			return true;
		} else {
			System.out.print("Ano nao bissexto!");
			return false;
		}
	}
	
	public Data(int dia, int mes, int ano) {
		setData(dia, mes, ano);
	}
	
	public Data(int mes, int ano) {
		setData(1, mes, ano);
	}
	
	public Data(int ano) {
		setData(1, 1, ano);
	}
	
	public void setData(int $dia, int $mes, int $ano) {		
		if($mes > 0 && $mes <= 12)
			mes = $mes;
		else {
			mes = 1;
			System.out.println("\nMês " + $mes + " inválido. Configurado mês = 1.");
		}
		
		ano = $ano;
		bissexto();
		dia = checkDia($dia);
	}
	
	private int checkDia(int diaTeste) {
		if(diaTeste > 0 && diaTeste <= diasMes[mes])
			return diaTeste;
		
		System.out.println("\nDia " + diaTeste + " inválido. Configurado dia = 1.");
		return 1;
	}
	
	public String toString() {
		return dia + "/" + mes + "/" + ano;
	}
	
	public int getDia() {
		return dia;
	}
	
	public int getMes() {
		return mes;
	}
	
	public int getAno() {
		return ano;
	}
}
