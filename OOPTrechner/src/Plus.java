public class Plus 
{
	private double wert1;
	private double wert2;
	private double ergebnis;
	
	Plus(double wert1, double wert2, double ergebnis)
	{	
		this.wert1 = wert1;
		this.wert2 = wert2;
		this.ergebnis = ergebnis;
	}
	public void setWert1(double wert1) {
		this.wert1 = wert1;
	}
	public void setWert2(double wert2) {
		this.wert2 = wert2;
	}
	public double getErgebnis() {
		this.ergebnis = this.wert1 + this.wert2;
		return this.ergebnis;
	}
}
