public class Student implements Cloneable {
    String nume, prenume;
    Masina m;

    public Student(String nume, String prenume) {
        this.nume = nume;
        this.prenume = prenume;
    }
    public Student() {
    }

    @Override
    public String toString() {
        return nume + " "+prenume + " "+ m.marca +" "+m.culoare;
    }

    public Student deepClone(){
        Student studentClone = new Student();
        Masina masinaClone = new Masina();
        try{
            studentClone =(Student) super.clone();
            masinaClone.culoare = m.culoare;
            masinaClone.marca=m.marca;
            studentClone.m =masinaClone;
            return studentClone;
        }
        catch (CloneNotSupportedException e){
            System.out.println("Not clonable");
        }


        return null;
    }
}
