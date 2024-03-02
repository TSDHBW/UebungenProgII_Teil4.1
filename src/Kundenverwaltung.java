public class Kundenverwaltung {

    private Kunde[] kunden;
    private int index;

    public Kundenverwaltung (Kunde[]kunden){

        this.kunden = kunden;
        index = 1;

    }

    public void nehmeKundeAuf (Kunde kunde) {

    }

    public Kunde sucheKunde (String name) {

        return null;

    }

    public Kunde[] getKunden() {
        return kunden;
    }

    public void setKunden(Kunde[] kunden) {
        this.kunden = kunden;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

}
