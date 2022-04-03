public class PastaGericht extends BasisRezeptEssen {

    String nudelsorte;
    boolean vorspeise;

    public PastaGericht(String nudelsorte, boolean vorspeise, String name){

        this.nudelsorte = nudelsorte;
        this.vorspeise = vorspeise;
        this.name = name;

    }

    public boolean parmesanMitKundeAbstimmen(){

        return true;

    }

}
