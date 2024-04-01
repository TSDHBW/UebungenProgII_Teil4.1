/**
 * Klasse zur Generierung eines Objekts für die Rezeptverwaltung. Jede Rezeptverwaltung besitzt je ein Array für Rezepte für Pastagerichte, Fleischgerichte,
 * COcktais und Limonaden
 * @author Timo
 * @version 1
 */
public class Rezeptverwaltung {

    private BasisRezept[] rezepte;

    public Rezeptverwaltung (){

        rezepte = new BasisRezept[1000];

    }

    public void nehmeRezeptAuf (BasisRezept rezept){

        boolean aktualisiert = false;
        for (int i = 0; i < rezepte.length; i++){

            if (rezepte[i] != null){

                if (rezepte[i].getName().equals(rezept.getName()) && rezepte[i].getTyp().equals(rezept.getTyp())){

                    System.out.println("Rezept aktualisiert");
                    rezepte[i] = rezept;
                    aktualisiert = true;
                    break;

                }
            }
        }

        if (aktualisiert == false){

            for (int i = 0; i < rezepte.length; i++){

                if (rezepte[i] == null){

                    // Hinzufügen von Rezept
                    rezepte[i] = rezept;
                    System.out.println("Rezept aufgenommen");
                    break;

                }
            }
        } else {

            System.out.println("Rezept nicht aufgenommen, Rezeptverwaltung ist voll");

        }
    }

    public int ermittleAnzahlRezepte (String art){

        return 0;

    }

    public void zeigeRezetAn (String art, String name){

    }

    public void sucheRezeptNachZutat(Zutat zutat){

    }

    public BasisRezept[] getRezepte() {
        return rezepte;
    }

    public void setRezepte(BasisRezept[] rezepte) {
        this.rezepte = rezepte;
    }
}
