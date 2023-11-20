public class Caiet extends Rechizita{

    public Caiet(String eticheta) {
        this.eticheta = eticheta;
    }

    public String getNume() {
        return "Caiet "+ eticheta;
    }

    @Override
    public String toString() {
        return this.getNume();
    }
}
