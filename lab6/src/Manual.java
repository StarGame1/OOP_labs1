public class Manual extends Rechizita{


    public Manual(String eticheta) {
        this.eticheta = eticheta;
    }
    public String getNume() {
        return "Manual "+ eticheta;
    }

    public String toString() {
        return this.getNume();
    }
}
