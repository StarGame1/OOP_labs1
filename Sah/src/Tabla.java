import java.util.Arrays;

public class Tabla {
    piesa[][] arr = new piesa[8][8];

    public void AranjeazaPioni(){
        piesa[] pion = new piesa[16];
        for(int i = 0 ; i < 8 ; i++){
            pion[i]= new piesa();
            pion[i].setColor("negru");
            pion[i].setPion();
            pion[i].positionX = 1;
            pion[i].positionY = i;
            arr[1][i] = pion[i];


        }
        for(int i = 8 ; i < 16 ; i++){
            pion[i]= new piesa();
            pion[i].color = "alb";
            pion[i].setPion();
            pion[i].positionX = 6;
            pion[i].positionY = i;
            arr[6][i-8] = pion[i];
        }
    }

    public void AranjeazaTurn(){
        piesa[] turn = new piesa[4];
        for(int i = 0 ; i < 4 ; i ++){
            turn[i] = new piesa();
            turn[i].setTurn();
        }
        turn[0].color = "negru";
        turn[1].color = "negru";
        turn[2].color = "alb";
        turn[3].color = "alb";

        turn[0].positionX = 0;
        turn[1].positionX = 0;
        turn[0].positionY = 0;
        turn[1].positionY = 7;

        turn[2].positionX = 7;
        turn[2].positionY = 0;
        turn[3].positionX = 7;
        turn[3].positionY = 7;
        for(int i = 0 ; i < 4 ; i++){
            arr[turn[i].positionX][turn[i].positionY]=turn[i];
        }

    }

    public void AranjeazaCai(){
        piesa[] cal = new piesa[4];
        for(int i = 0 ; i < 4 ; i ++){
            cal[i]=new piesa();
            cal[i].setCal();
        }
        cal[0].color = "negru";
        cal[1].color = "negru";
        cal[2].color = "alb";
        cal[3].color = "alb";

        cal[0].positionX=0;
        cal[0].positionY=1;
        cal[1].positionX=0;
        cal[1].positionY=6;
        cal[2].positionX = 7;
        cal[2].positionY = 1;
        cal[3].positionX =7;
        cal[3].positionY = 6;
        for(int i = 0 ; i < 4 ; i++){
            arr[cal[i].positionX][cal[i].positionY]=cal[i];
        }

    }

    public void AranjeazaNebuni(){
        piesa[] nebun = new piesa[4];
        for(int i = 0 ; i < 4 ; i ++){
            nebun[i]=new piesa();
            nebun[i].setNebun();
        }
        nebun[0].color = "negru";
        nebun[1].color = "negru";
        nebun[2].color = "alb";
        nebun[3].color = "alb";

        nebun[0].positionX=0;
        nebun[0].positionY=2;
        nebun[1].positionX=0;
        nebun[1].positionY=5;
        nebun[2].positionX=7;
        nebun[2].positionY=2;
        nebun[3].positionX=7;
        nebun[3].positionY=5;

        for(int i = 0 ; i < 4 ; i++){
            arr[nebun[i].positionX][nebun[i].positionY]=nebun[i];
        }
    }

    public void AranjeazaRegi(){
        piesa[] rege = new piesa[2];
        for(int i = 0 ; i < 2 ; i ++){
            rege[i]=new piesa();
            rege[i].setRege();
        }
        rege[0].color = "negru";
        rege[1].color= "alb";

        rege[0].positionX = 0;
        rege[0].positionY = 4;
        rege[1].positionX = 7;
        rege[1].positionY = 4;
        for(int i = 0 ; i < 2 ; i++){
            arr[rege[i].positionX][rege[i].positionY]=rege[i];
        }

    }

    public void AranjeazaRegine(){
        piesa[] regina = new piesa[2];
        for(int i = 0 ; i < 2 ; i ++){
            regina[i]=new piesa();
            regina[i].setRegina();
        }
        regina[0].color = "negru";
        regina[1].color= "alb";

        regina[0].positionX = 0;
        regina[0].positionY = 3;
        regina[1].positionX = 7;
        regina[1].positionY = 3;
        for(int i = 0 ; i < 2 ; i++){
            arr[regina[i].positionX][regina[i].positionY]=regina[i];
        }
    }


    public void makeTable() {
        AranjeazaPioni();
        AranjeazaTurn();
        AranjeazaCai();
        AranjeazaNebuni();
        AranjeazaRegi();
        AranjeazaRegine();
    }




    public void printTable(){
        System.out.println("\n");
        for(int i = 0 ; i < 8 ; i ++){
            for(int j = 0 ; j < 8 ; j++){
                if(arr[i][j] == null){
                    System.out.print("     GOL  ");
                }else{
                System.out.print(arr[i][j]+ "  ");
                }
            }
            System.out.print("\n\n");
        }
    }
}
