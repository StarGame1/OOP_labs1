public class Main {

    public static void main(String[] args){

        Manual a = new Manual("MATE");
        Caiet b = new Caiet("INFO");
        Manual c = new Manual("ROMANA");
        Caiet d = new Caiet("BIOLOGIE");
        Manual e = new Manual("INFO");
        Caiet f = new Caiet("MATE");
        Manual h = new Manual("BIOLOGIE");
        Caiet i = new Caiet("ROMANA");

        Ghiozdan g = new Ghiozdan();

        g.adaugaManual(a);
        g.adaugaManual(c);
        g.adaugaCaiet(b);
        g.adaugaCaiet(d);
        g.adaugaManual(e);
        g.adaugaCaiet(f);
        g.adaugaManual(h);
        g.adaugaCaiet(i);

        System.out.println("Listare rechizite: ");
        g.listItems();
        System.out.println();

        System.out.println("Listare manuale: ");
        g.listManuale();
        System.out.println();

        System.out.println("Listare caiete: ");
        g.listCaiete();

        System.out.println();
        System.out.println("Nr rechizite: " + g.getNrRechizite());
        System.out.println("Nr Caiete: " + g.getNrCaiete());
        System.out.println("Nr Manuale: " + g.getNrManuale());
    }
}