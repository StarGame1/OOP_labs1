public class piesa {
    String color;
    int positionX, positionY;
    String Type = new String();

    public void setPion(){
        this.Type = "Pion";

    }
    public void setRege(){
        this.Type = "Rege";

    }
    public void setRegina(){
        this.Type = "Regina";

    }
    public void setTurn(){
        this.Type = "Turn";

    }
    public void setNebun(){
        this.Type = "Nebun";

    }
    public void setCal(){
        this.Type = "Cal";

    }

    public String getType(){
        return this.Type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPositionX() {
        return positionX;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    public piesa(String color, int positionX, int positionY) {
        this.color = color;
        this.positionX = positionX;
        this.positionY = positionY;
    }
    public piesa(String color ) {
        this.color = color;
    }
    public piesa() {

    }

    @Override
    public String toString() {
        return this.getType() + " " + this.getColor();
    }

    void move(int x, int y){

        this.positionX = x;
        this.positionY = y;



    }


}
