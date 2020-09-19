public class Potenz 
{
	private double basis;
	private double potenzwert;
	private double ergebnis;
	
	Potenz(double basis, double potenzwert, double ergebnis)
	{
		this.basis = basis;
		this.potenzwert = potenzwert;
		this.ergebnis = ergebnis;
	}
	public void setBasis(double basis) {
		this.basis = basis;
	}
	public void setPotenzwert(double potenzwert) {
		this.potenzwert = potenzwert;
	}
	public double getErgebnis() {
		
		this.ergebnis = Math.pow(basis, potenzwert);
		return this.ergebnis;
	}
}