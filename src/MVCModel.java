public class MVCModel {

    public Rezeptverwaltung rezeptverwaltung;

    public MVCModel() {

        init();

    }

    public void init(){

        rezeptverwaltung = new Rezeptverwaltung();
        System.out.println("Initialisierung des Datenmodells abgeschlossen");

    }

    public Rezeptverwaltung getRezeptverwaltung() {
        return rezeptverwaltung;
    }

    public void setRezeptverwaltung(Rezeptverwaltung rezeptverwaltung) {
        this.rezeptverwaltung = rezeptverwaltung;
    }
}
