public class CalendarLucru {
    private Zi[] zileSaptamana;
    public CalendarLucru() {
        zileSaptamana = new Zi[7];
        initializeazaZileleSaptamanii();
    }

    private void initializeazaZileleSaptamanii() {
        zileSaptamana[0] = new Zi("Luni", true);
        zileSaptamana[1] = new Zi("Marti", true);
        zileSaptamana[2] = new Zi("Miercuri", true);
        zileSaptamana[3] = new Zi("Joi", true);
        zileSaptamana[4] = new Zi("Vineri", true);
        zileSaptamana[5] = new Zi("Sambata", false);
        zileSaptamana[6] = new Zi("Duminica", false);
    }

    public void afiseazaProgramulSaptamanii() {
        for (Zi zi : zileSaptamana) {
            System.out.println(zi.getNume() + ": " + (zi.isLucratoare() ? "Lucratoare" : "Nelucratoare"));
        }
    }


}

