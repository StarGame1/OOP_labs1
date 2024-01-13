public class Zi {
    String nume;
    boolean lucratoare;

    public Zi(String nume, boolean lucratoare) {
        this.nume = nume;
        this.lucratoare = lucratoare;
    }
    public Zi(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public boolean isLucratoare() {
        return lucratoare;
    }

    public void setLucratoare() {
        this.lucratoare = true;
    }
    public void setNelucratoare() {
        this.lucratoare = true;
    }
}
