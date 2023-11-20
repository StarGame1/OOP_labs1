public class Rezervor{
    private int capacitateMaxima;
    private int nivelCurent;

    public int getCapacitateMaxima() {
        return capacitateMaxima;
    }

    public void setCapacitateMaxima(int capacitateMaxima) {
        this.capacitateMaxima = capacitateMaxima;
    }

    public int getNivelCurent() {
        return nivelCurent;
    }

    public void setNivelCurent(int nivelCurent) {
        this.nivelCurent = nivelCurent;
    }

    public void adaugaCombustibil(int litrii){
        if(litrii> 0 ){
            if(litrii > (capacitateMaxima-nivelCurent)) {
                this.nivelCurent = capacitateMaxima;
            }
            else
            {
                this.nivelCurent += litrii;
            }
        }
    }

    public void golireCombustibil(int litrii){
        if(litrii<capacitateMaxima){
            this.nivelCurent -=litrii;
        }else{
            this.nivelCurent = 0;
        }
    }
}
