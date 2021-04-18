import java.lang.Math;

public class Circulo {
	public static class Circle {
		private double raio, diametro, area, perimetro;
		
		public double getRaio() {
			return raio;
		}
		
		public void setRaio(double newRaio) {
			this.raio = newRaio;
		}
		
		public double diametro() {
			diametro = this.raio*2;
			return diametro;
		}
		
		public double area() {
			area = Math.PI*(Math.pow(this.raio, 2));
			return area;
		}
		
		public double perimetro() {
			perimetro = 2*Math.PI*this.raio;
			return perimetro;
		}
	}

	public static void main(String[] args) {
		Circle bola = new Circle();
		Circle bola2 = new Circle();
		
		bola.setRaio(5);
		bola2.setRaio(15);
		
		System.out.println("Dados do c�rculo de raio 5:\nDi�metro: " + bola.diametro() + "\nCircunfer�ncia: " + bola.perimetro() + "\nArea: " + bola.area());
		System.out.println("\n\nDados do c�rculo de raio 15:\nDi�metro: " + bola2.diametro() + "\nCircunfer�ncia: " + bola2.perimetro() + "\nArea: " + bola2.area());
	}
}