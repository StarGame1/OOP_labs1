public class Biblioteca {
    Carte[] carti = new Carte[100];



    public void adaugaCarte(Carte carte){
        if(carte.getCopiiDisponibile() > 0){
            int ok = 1;
            for(int i = 0 ; i < 100 ; i++){
                if(carti[i] == null)
                    break;
                if(carte.getId() == carti[i].getId()){
                    ok = 0;
                }
            }
            if(ok == 1){
                int i = 0;
                while(carti[i]!=null){
                    i++;
                }
                carti[i]=carte;
            }else{
                System.out.println("Cartea "+ carte.getTitlu()+" a putut fi adaugata in biblioteca");
            }
        }else{
            System.out.println("Cartea "+ carte.getTitlu()+" a putut fi adaugata in biblioteca");
        }
    }

    public Carte gasesteCarteDupaTitlu(String titlu){
        int i = 0;
        while(carti[i]!=null){
            if(carti[i].getTitlu().equals(titlu)){
                System.out.println("Cartea "+ titlu + " a fost gasita");
               return carti[i];
            }
            i++;
        }
        System.out.println("Cartea " + titlu + " nu a fost gasita");
        return null;
    }

    public void listeazaCarti(){
        int i = 0;
        while(carti[i]!=null){
            System.out.print("\nTitlu: " + carti[i].getTitlu() +
                            "\n Autor: " + carti[i].getAutor() + "\n\n");
            i++;
        }
    }

}
