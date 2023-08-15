package Forms;

public class Aceleracao {

	private double forca;
	private double massa;
	
	public Aceleracao(double forca, double massa) {
		super();
		this.forca = forca;
		this.massa = massa;
	}

	public double getForca() {
		return forca;
	}

	public void setForca(double forca) {
		this.forca = forca;
	}

	public double getMassa() {
		return massa;
	}

	public void setMassa(double massa) {
		this.massa = massa;
	} 
	
	public double aceleracao() {
		return this.forca / this.massa;
	}
	
}
