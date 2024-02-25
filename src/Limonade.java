public class Limonade extends BasisRezeptGetraenk {

    private String fruchtgeschmack;
    private Boolean herstellungInHouse;

    public boolean eiswuerfelMitKundeAbstimmen() {

        return true;

    }

    public String getFruchtgeschmack() {
        return fruchtgeschmack;
    }

    public void setFruchtgeschmack(String fruchtgeschmack) {
        this.fruchtgeschmack = fruchtgeschmack;
    }

    public Boolean getHerstellungInHouse() {
        return herstellungInHouse;
    }

    public void setHerstellungInHouse(Boolean herstellungInHouse) {
        this.herstellungInHouse = herstellungInHouse;
    }

}
