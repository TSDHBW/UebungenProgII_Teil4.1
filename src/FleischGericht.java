public class FleischGericht extends BasisRezeptEssen {

    private String fleischsorte;
    private int zielKerntemperatur;
    private int zubereitungstemperatur;

    public String gargradMitKundeAbstimmen() {

        return "";

    }

    public String getFleischsorte() {
        return fleischsorte;
    }

    public void setFleischsorte(String fleischsorte) {
        this.fleischsorte = fleischsorte;
    }

    public int getZielKerntemperatur() {
        return zielKerntemperatur;
    }

    public void setZielKerntemperatur(int zielKerntemperatur) {
        this.zielKerntemperatur = zielKerntemperatur;
    }

    public int getZubereitungstemperatur() {
        return zubereitungstemperatur;
    }

    public void setZubereitungstemperatur(int zubereitungstemperatur) {
        this.zubereitungstemperatur = zubereitungstemperatur;
    }

}
