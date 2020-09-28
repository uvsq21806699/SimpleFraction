
public class Fraction {
	
	private int dividende;
	private int diviseur;
	private int result; 
	
	
	public Fraction(int dividende, int diviseur) {
		this.dividende = dividende;
		this.diviseur = diviseur;
		result = dividende/diviseur;
	}


	@Override
	public String toString() {
		return "Fraction [dividende=" + dividende + ", diviseur=" + diviseur + ", result=" + result + "]";
	}
	
	

}
