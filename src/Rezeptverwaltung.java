/**
 * Klasse zur Generierung eines Objekts für die Rezeptverwaltung. Jede Rezeptverwaltung besitzt je ein Array für Rezepte für Pastagerichte, Fleischgerichte,
 * COcktais und Limonaden
 * @author Timo
 * @version 1
 */
public class Rezeptverwaltung {

    private PastaGericht[] pastaRezepte;
    private FleischGericht[] fleischRezepte;
    private Cocktail[] cocktailRezepte;
    private Limonade[] limonadeRezepte;

    public Rezeptverwaltung (){

        pastaRezepte = new PastaGericht[1000];
        fleischRezepte = new FleischGericht[1000];
        cocktailRezepte = new Cocktail[1000];
        limonadeRezepte = new Limonade[1000];

    }


    public int ermittleAnzahlRezepte (String art){

        return 0;

    }

    public void zeigeRezetAn (String art, String name){

    }

    public void sucheRezeptNachZutat(Zutat zutat){

    }

    public PastaGericht[] getPastaRezepte() {
        return pastaRezepte;
    }

    public void setPastaRezepte(PastaGericht[] pastaRezepte) {
        this.pastaRezepte = pastaRezepte;
    }

    public FleischGericht[] getFleischRezepte() {
        return fleischRezepte;
    }

    public void setFleischRezepte(FleischGericht[] fleischRezepte) {
        this.fleischRezepte = fleischRezepte;
    }

    public Cocktail[] getCocktailRezepte() {
        return cocktailRezepte;
    }

    public void setCocktailRezepte(Cocktail[] cocktailRezepte) {
        this.cocktailRezepte = cocktailRezepte;
    }

    public Limonade[] getLimonadeRezepte() {
        return limonadeRezepte;
    }

    public void setLimonadeRezepte(Limonade[] limonadeRezepte) {
        this.limonadeRezepte = limonadeRezepte;
    }

}
