public class Principal {

	public static void main(String[] args) {
		Carro car1 = new Carro();
		car1.potencia = 10;
		car1.velocidade = 0;
		car1.nome = "Fusca";
		
		car1.acelerar();
		car1.acelerar();
		car1.frear();
		
		car1.imprimir();
	}

}
