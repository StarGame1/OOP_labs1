import java.util.Scanner;

public class Matrice {
    NumarComplex[][] numar = new NumarComplex[3][3];

    public void setElement(int rand,int coloana, NumarComplex x ){
        numar[rand][coloana] = x;
    }


    public void adunare(Matrice x){
        for(int i = 0 ; i < 3 ; i++){
            for(int j = 0 ; j < 3 ; j++){
               this.numar[i][j].adunare(x.numar[i][j]);
            }
        }
    }

    public void scadere(Matrice x){
        for(int i = 0 ; i < 3 ; i++){
            for(int j = 0 ; j < 3 ; j++){
                this.numar[i][j].scadere(x.numar[i][j]);
            }
        }
    }


    public String toString(){
        return numar[0][0]+ " " +numar[0][1]+ " " +numar[0][2]+ "\n" +numar[1][0]+ " " +numar[1][1]+ " " +numar[1][2]+ "\n" +numar[2][0]+ " " +numar[2][1]+ " " +numar[2][2];


    }
}
