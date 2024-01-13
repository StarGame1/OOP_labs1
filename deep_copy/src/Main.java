// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Robert", "Rayan");
        Masina m1 = new Masina("Mercedes", "Negru");
        s1.m = m1;

        Student s2 = s1.deepClone();

        s2.m.culoare = "Roz";
        System.out.println(s1);
        System.out.println(s2);

    }
}