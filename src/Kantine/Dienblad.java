import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

public class Dienblad {
	
    private ArrayList<Artikel> artikelen;

    private int aantalArtikelen;
    
    public Persoon klant;
    
	/**
     * Constructor
     */
    public Dienblad( ) {
    }

	/**
     * Constructor
     */
    public Dienblad(Persoon klant) {
        this.klant = klant;
    }

    /**
     * Methode om artikel aan dienblad toe te voegen
     *
     * @param artikel
     */
    public void voegToe(Artikel artikel) {
        artikelen.add(artikel);
    }

    /**
     * Methode om aantal artikelen op dienblad te tellen
     *
     * @return Het aantal artikelen
     */
    public int getAantalArtikelen() {
        for(Artikel artikel : artikelen) {
        	aantalArtikelen++;
        }
    }

    /**
     * Methode om de totaalprijs van de artikelen
     * op dienblad uit te rekenen
     *
     * @return De totaalprijs
     */
    public double getTotaalPrijs() {
    	double totaalPrijs = 0;
        for(Artikel artikel : artikelen) {
        	totaalPrijs += artikel.getPrijs();
        }
        return totaalPrijs;
    }
    
    public Persoon getKlant() {
		return klant;
	}

	public void setKlant(Persoon klant) {
		this.klant = klant;
	}
}

