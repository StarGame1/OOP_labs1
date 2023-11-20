public class Carte {
    private String titlu;
    private Autor autor;
    private int id;

    private int copiiDisponibile;


    //getter and setter
    public String getTitlu() {
        return titlu;
    }


    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public int getId() {
        return id;
    }


    public int getCopiiDisponibile() {
        return copiiDisponibile;
    }

    public void setCopiiDisponibile(int copiiDisponibile) {
        this.copiiDisponibile = copiiDisponibile;
    }

    //constructor

    public Carte(String titlu, Autor autor, int id) {
        this.titlu = titlu;
        this.autor = autor;
        this.id = id;
    }

    public Carte(String titlu, Autor autor) {
        this.titlu = titlu;
        this.autor = autor;
    }
    public Carte(String titlu) {
        this.titlu = titlu;
    }

    public Carte(){

    }

    @Override
    public String toString() {
        return "Carte:" +
                "\ntitlu: '" + titlu + '\'' +
                "\nautor:" + autor +
                "\nid: " + id +
                "\ncopiiDisponibile: " + copiiDisponibile +
                '\n';
    }
}
