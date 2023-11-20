public class Autovehicul extends Sofer {
    private String culoare;
    private float vitezaCurenta, vitezaMaxima;
    private int treaptaVitezaCurenta;
    private int numarTrepte;

    private String marca;

    public String getMarca() {
        return marca;
    }

    public String getCuloare() {
        return culoare;
    }

    public float getVitezaCurenta() {
        return vitezaCurenta;
    }

    public void setVitezaCurenta(float vitezaCurenta) {
        this.vitezaCurenta = vitezaCurenta;
    }

    public float getVitezaMaxima() {
        return vitezaMaxima;
    }

    public void setVitezaMaxima(float vitezaMaxima) {
        this.vitezaMaxima = vitezaMaxima;
    }

    public int getTreaptaVitezaCurenta() {
        return treaptaVitezaCurenta;
    }

    public void setTreaptaVitezaCurenta(int treaptaVitezaCurenta) {
        this.treaptaVitezaCurenta = treaptaVitezaCurenta;
    }

    public int getNumarTrepte() {
        return numarTrepte;
    }

    public void setNumarTrepte(int numarTrepte) {
        this.numarTrepte = numarTrepte;
    }

    public Autovehicul(String marca, String culoare, float vitezaMaxima){
        this.marca = marca;
        this.culoare = culoare;
        this.vitezaMaxima = vitezaMaxima;

    }
    public Autovehicul(String marca, String culoare){
        this.marca = marca;
        this.culoare = culoare;

    }
    public Autovehicul(String marca){
        this.marca = marca;


    }
    public Autovehicul() {

    }

    //METODA

    public void accelerare(int delta){
        if(delta + this.vitezaCurenta <= vitezaMaxima)
            this.vitezaCurenta += delta;

    }

    public void decelerare(int delta){
        if( this.vitezaCurenta +delta   >= 0) {
            this.vitezaCurenta -= delta;
        }
        else{
            this.vitezaCurenta=0;

        }

    }

    public void oprire(){
        this.vitezaCurenta = 0;
    }

    void shimbaTreapta(int treapta_dorita){
        if(treapta_dorita <=6){
            treaptaVitezaCurenta = treapta_dorita;
        }

    }

    public String toString(){
        return  "Marca: " +getMarca() + "\nCuloare: " + getCuloare() + "\nViteza curenta: " + getVitezaCurenta() + " KM/H";

    }


}
