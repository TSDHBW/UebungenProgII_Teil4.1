public class BasisRezeptEssen extends BasisRezept {

    boolean vegetarisch;
    boolean vegan;

    public BasisRezeptEssen(String name, Zutat[]zutaten, boolean vegetarisch, boolean vegan){

        super(name, zutaten);
        this.vegetarisch = vegetarisch;
        this.vegan = vegan;

    }

}
