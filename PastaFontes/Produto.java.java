// Programa de aplicação de administra e cadastro de produtos
// Incluiu e consulta de daod do produto

public class Produto {

	private int peso;
	private int altura;
	
	public Produto() {
		
	}
	
	public Produto(double peso, double altura) {
		this.peso=peso;
		this.altura=altura;
	}
	
	public int getPeso() {
		return peso;
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public int getAltura() {
		return altura;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	
	
}
