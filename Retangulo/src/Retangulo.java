public class Retangulo {
	float base, altura, area, perimetro;
	boolean quadrado;
	
	public Retangulo() {
		base = 2;
		altura = 1;
		
		callMethods();
	}
	
	public Retangulo(float $base, float $altura) {
		base = $base;
		altura = $altura;
		
		callMethods();
	}
	
	public float Area() {
		return area = base*altura;
	}
	
	public float Perimetro() {
		return perimetro = 2*(base+altura);
	}
	
	public boolean IsSquare() {
		return quadrado = base == altura ? true : false; 
	}
	
	public void ShowData() {
		System.out.print("\nBase: " + base +
				"\nAltura: " + altura +
				"\nArea: " + area +
				"\nPerimetro: " + perimetro +
				"\nQuadrado: " + quadrado + "\n");
	}
	
	public void callMethods() {
		Area();
		Perimetro();
		IsSquare();
		ShowData();
	}
}