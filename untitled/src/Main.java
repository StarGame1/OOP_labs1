// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Matrice mat1 = new Matrice();
        for(int i = 0 ; i < 3 ; i++){
            for(int j = 0 ; j < 3 ; j++){
                mat1.setElement(i, j, new NumarComplex(i, j));

            }
        }
        Matrice mat2 = new Matrice();
        for(int i = 0 ; i < 3 ; i++){
            for(int j = 0 ; j < 3 ; j++){
                mat2.setElement(i, j, new NumarComplex(i, j));

            }
        }
        mat1.adunare(mat2);
        System.out.println(mat1);


        System.out.println("\n");


        mat1.scadere(mat2);
        System.out.println(mat2);




        }




    }
