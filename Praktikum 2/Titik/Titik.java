public class Titik {
    //Atribut
    private double absis, ordinat;
    //static double counter;

    //construktor
    public Titik(){
        this(0,0);
    }

    public Titik(double absis, double ordinat){
        this.absis = absis;
        this.ordinat= ordinat;
    }

    public double getAbsis(){
        return this.absis;
    }
    
    public double getOrdinat(){
        return this.ordinat;
    }

/*     static double getCounter(){
        return counter;
    }
*/
    public void setAbsis(double absis){
        this.absis=absis;
    }

    public void setOrdinat(double ordinat){
        this.ordinat=ordinat;
    }
    
    public double getJarakPusat(double absis, double ordinat) {
        return Math.sqrt(absis * absis + ordinat * ordinat);
    }
    public void refleksiX(){
        this.ordinat=-this.ordinat;
    }
    public void refleksiY(){
        this.absis=-this.absis;
    }
    public Titik getRefleksiX(){
        return new Titik(this.absis, -this.ordinat);
    }
    public Titik getRefleksiY(){
        return new Titik(-this.absis,this.ordinat);
    }
}

