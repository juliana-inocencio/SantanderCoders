package Forms;

public class ParOuImpar {

	private int numero;

	public ParOuImpar(int numero) {
		super();
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	} 
	
	public void verificarParOuImpar() {
		if (numero % 2 == 0) {
			System.out.println("O número é par!");
		}else {
			System.out.println("O número é impar!");
		}
	}
}
