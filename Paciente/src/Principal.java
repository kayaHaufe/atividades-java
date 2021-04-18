
public class Principal {

	public static void main(String[] args) {
		Paciente p1 = new Paciente(100, 1.80);
		Paciente p2 = new Paciente(50, 1.75);
		Paciente p3 = new Paciente(74, 1.80);
		
		p1.calcularIMC();
		p1.diagnostico();
		
		p2.calcularIMC();
		p2.diagnostico();
		
		p3.calcularIMC();
		p3.diagnostico();	
	}

}
