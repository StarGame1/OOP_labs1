public class Autor {
    //variabile
    String nume, prenume;
    int varsta;

    //setters and getters
    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    //constructor

    public Autor(String nume, String prenume, int varsta) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
    }
    public Autor(String nume, String prenume) {
        this.nume = nume;
        this.prenume = prenume;

    }
    public Autor(String nume) {
        this.nume = nume;

    }
    public Autor() {}

    @Override
    public String toString() {
        return
                 nume + ' ' +  prenume + ", varsta de "+varsta +" de ani. ";

    }


}
