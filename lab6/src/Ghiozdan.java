public class Ghiozdan {
    Rechizita[] lista = new Rechizita[10];
    int nrRechizite = 0, nrCaiete = 0, nrManuale = 0;

    public void adaugaCaiet(Caiet x){
        nrRechizite++;
        nrCaiete++;
        int i = 0;
        while(lista[i]!=null){
            i++;
            if(i >= 10){
                break;
            }
        }
        lista[i]= x;
    }

    public void adaugaManual(Manual x){
        nrRechizite++;
        nrManuale++;
        int i = 0;
        while(lista[i]!=null){
            i++;
            if(i >= 10){
                break;
            }
        }
        lista[i]= x;
    }
    public void listItems(){
        int i = 0;
        while(lista[i]!=null){
            System.out.println(lista[i]);
            i++;
        }
    }
    public void listManuale(){
        int i = 0;
        while(lista[i]!=null){
            if (lista[i] instanceof Manual) {
                System.out.println(lista[i]);
            }
            i++;
        }
    }

    public void listCaiete(){
        int i = 0;
        while(lista[i] !=null){
            if (lista[i] instanceof Caiet) {
                System.out.println(lista[i]);
            }
            i++;
        }
    }
    public int getNrRechizite(){
        return this.nrRechizite;
    }
    public int getNrCaiete(){
        return this.nrCaiete;
    }
    public int getNrManuale(){
        return this.nrManuale;
    }
}


