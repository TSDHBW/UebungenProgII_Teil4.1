public class Bestellung {

    private Kunde kunde;
    private FleischGericht fleischGericht;
    private PastaGericht pastaGericht;
    private Cocktail[] cocktails;
    private Limonade[] limonaden;

    public Bestellung(Kunde kunde, FleischGericht fleischGericht, PastaGericht pastaGericht, Cocktail[] cocktails, Limonade[] limonaden){

        this.kunde = kunde;
        this.fleischGericht = fleischGericht;
        this.pastaGericht = pastaGericht;
        this.cocktails = cocktails;
        this.limonaden = limonaden;

    }

    public double erstelleRechnung() {

        return 0.0;

    }

    public Kunde getKunde() {
        return kunde;
    }

    public void setKunde(Kunde kunde) {
        this.kunde = kunde;
    }

    public FleischGericht getFleischGericht() {
        return fleischGericht;
    }

    public void setFleischGericht(FleischGericht fleischGericht) {
        this.fleischGericht = fleischGericht;
    }

    public PastaGericht getPastaGericht() {
        return pastaGericht;
    }

    public void setPastaGericht(PastaGericht pastaGericht) {
        this.pastaGericht = pastaGericht;
    }

    public Cocktail[] getCocktails() {
        return cocktails;
    }

    public void setCocktails(Cocktail[] cocktails) {
        this.cocktails = cocktails;
    }

    public Limonade[] getLimonaden() {
        return limonaden;
    }

    public void setLimonaden(Limonade[] limonaden) {
        this.limonaden = limonaden;
    }

}
