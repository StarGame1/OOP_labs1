
public class Main {
    public static void main(String[] args) {


        Biblioteca biblioteca = new Biblioteca();


        Autor[] a = new Autor[5];
        a[0] = new Autor("Albert", "Camus", 50);
        a[1] = new Autor("Marcel", "Proust", 65);
        a[2] = new Autor("Franz", "Kafka", 43);
        a[3] = new Autor("Andre", "Malraux", 51);
        a[4] = new Autor("John", "Steinbeck", 55);

        Carte[] c = new Carte[5];
        c[0] = new Carte("Strainul", a[0], 312);
        c[1] = new Carte("In cautarea timpului pierdut", a[1], 132);
        c[2] = new Carte("Procesul", a[2], 352);
        c[3] = new Carte("Conditia umana", a[3], 113);
        c[4] = new Carte("Fructele maniei", a[4], 333);

        for(int i = 0 ; i < 5 ; i++){
            c[i].setCopiiDisponibile(100);
        }
        for(int i = 0 ; i < 5 ; i++){
            biblioteca.adaugaCarte(c[i]);
        }

        biblioteca.listeazaCarti();

        //exemplu carte acelasi id
        Carte x = new Carte("Strainul 2", a[0], 312);
        x.setCopiiDisponibile(500);
        biblioteca.adaugaCarte(x);

        //exemplu 0 copii
        Carte y = new Carte("Strainul 3", a[0], 999);
        y.setCopiiDisponibile(0);
        biblioteca.adaugaCarte(y);
        System.out.println(" ");

        //exemplu cautare
        Carte carteCautata = biblioteca.gasesteCarteDupaTitlu("Procesul");
        Carte carteInexistenta = biblioteca.gasesteCarteDupaTitlu("Poezii");

        //exemplu printare carte
        System.out.println("\n" + c[4]);
    }
}