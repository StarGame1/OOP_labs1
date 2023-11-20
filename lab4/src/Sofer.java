public class Sofer{
    String numeSofer;
    int varsta ,numarPermis;

    public String getNumeSofer() {
        return numeSofer;
    }

    public void setNumeSofer(String numeSofer) {
        this.numeSofer = numeSofer;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public int getNumarPermis() {
        return numarPermis;
    }

    public void setNumarPermis(int numarPermis) {
        this.numarPermis = numarPermis;
    }





    public Sofer(String nume, int varsta, int numarPermis){
        numeSofer = nume;
        this.varsta = varsta;
        this.numarPermis = numarPermis;
    }

    public Sofer(String nume, int varsta){
        numeSofer = nume;
        this.varsta = varsta;

    }

    public Sofer(String nume){
        numeSofer = nume;

    }

    public Sofer(){
    }
}
