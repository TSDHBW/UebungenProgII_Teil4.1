public class MVCController {

    private MVCView view;
    private MVCModel model;

    public MVCController() {

        this.view = new MVCView(this);
        this.model = new MVCModel();
        legeRezeptan();

    }

    public void legeRezeptan(){

        Zutat zitrone = new Zutat("Zitrone", 1.00);
        Zutat orange = new Zutat("Orange", 1.50);
        Zutat minze = new Zutat("Minze", 0.75);
        Zutat zucker = new Zutat("Zucker", 0.25);
        Zutat wasser = new Zutat("Wasser", 0.10);
        Zutat eis = new Zutat("Eis", 0.50);
        Zutat limette = new Zutat("Limette", 2.00);

        Zutat[] zutatenOrangenlimo = {orange, minze, wasser, eis};
        Limonade orangenlimo = new Limonade("Orangenlimo", zutatenOrangenlimo, false,true, "Orange", true);

        Zutat[] zutatenZitronenlimo = {zitrone, minze, zucker, wasser, eis};
        Limonade zitronenlimo = new Limonade("Zitronenlimo", zutatenZitronenlimo, false, false, "Zitrone", false);

        Zutat[] zutatenCaipirinha = {minze, limette, zucker, wasser, eis};
        Cocktail caipirinha = new Cocktail("Caipirinha", zutatenCaipirinha, false, false, 0, true);

        model.rezeptverwaltung.nehmeRezeptAuf(orangenlimo);
        model.rezeptverwaltung.nehmeRezeptAuf(zitronenlimo);
        model.rezeptverwaltung.nehmeRezeptAuf(caipirinha);

    }

}
