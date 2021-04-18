package imc;

public class Paciente {
	double imc;
	String diagnostico;
	
	public void calcularIMC(double peso, double altura) {
		imc = peso/(altura*altura);
		System.out.printf("\nO imc é: " + imc);
		diagnostico();
	}
	
	public void diagnostico() {
		if(imc < 16) {
			diagnostico = "Baixo peso muito grave";
		} else if(imc >= 16 && imc < 17) {
			diagnostico = "Baixo peso grave";
		} else if(imc >= 17 && imc < 18.5) {
			diagnostico = "Baixo peso";
		} else if(imc >= 18.5 && imc < 25) {
			diagnostico = "Peso normal";
		} else if(imc >= 25 && imc < 30) {
			diagnostico = "Sobrepeso";
		} else if(imc >= 30 && imc < 35) {
			diagnostico = "Obesidade grau I";
		} else if(imc >= 35 && imc < 40) {
			diagnostico = "Obesidade grau II";
		} else if(imc >= 40) {
			diagnostico = "Obesidade grau III (obesidade mórbida)";
		} else {
			diagnostico = "Não identificado";
		}
		
		System.out.printf("\nDiagnóstico: " + diagnostico);
	}
	
	public static void main(String[] args) {
		Paciente p1 = new Paciente();
		Paciente p2 = new Paciente();
		Paciente p3 = new Paciente();
		
		p1.calcularIMC(70, 1.75);
		p2.calcularIMC(45, 1.60);
		p3.calcularIMC(120, 1.90);
	}
}

