public class NumarComplex {
    public int img, re;

    public NumarComplex(int re, int img){
        this.re = re;
        this.img = img;
    }

    public NumarComplex adunare(NumarComplex x){
        this.re += x.re;
        this.img += x.img;
        return this;
    }

    public NumarComplex scadere(NumarComplex x){
        this.re -= x.re;
        this.img -= x.img;
        return this;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public int getRe() {
        return re;
    }

    public void setRe(int re) {
        this.re = re;
    }

    public NumarComplex impartire(NumarComplex x){
        int denominator = x.re * x.re + x.img * x.img;

        int newRe = (this.re * x.re + this.img * x.img) / denominator;
        int newImg = (this.img * x.re - this.re * x.img) / denominator;

        this.re = newRe;
        this.img = newImg;

        return this;
    }

    public NumarComplex inmultire(NumarComplex x){

        int newRe = (this.re * x.re) - (this.img * x.img);
        int newImg = (this.re * x.img) + (this.img * x.re);

        this.re = newRe;
        this.img = newImg;

        return this;
    }


    @Override
    public String toString() {
        return this.re + " + " + this.img + "i";
    }
}
