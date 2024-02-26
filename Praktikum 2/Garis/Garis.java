public class Garis {
    //atribut
    private Titik titikAwal,titikAkhir;

    //construktor
    public Garis(){
        this(new Titik(), new Titik());
    }

    public Garis(Titik titikAwal, Titik titikAkhir){
        this.titikAwal=titikAwal;
        this.titikAkhir=titikAkhir;
    }
    
    public void setTitikAwal(){
        this.titikAwal=titikAwal;
    }

    public void setTitikAkhir(){
        this.titikAkhir=titikAkhir;
    }

    public Titik getTitikAwal(){
        return this.titikAwal;
    }

    public Titik getTitikAkhir(){
        return this.titikAkhir;
    }

    public double getPanjang() {
        double dx = titikAkhir.getAbsis() - titikAwal.getAbsis();
        double dy = titikAkhir.getOrdinat() - titikAwal.getOrdinat();
        return Math.sqrt(dx * dx + dy * dy);
    }

    public double getGradien() {
        if (titikAkhir.getAbsis() == titikAwal.getAbsis()) {
            return Double.POSITIVE_INFINITY;
        }
        return (titikAkhir.getOrdinat() - titikAwal.getOrdinat()) / (titikAkhir.getAbsis() - titikAwal.getAbsis());
    }

    public Garis getRefleksiY() {
        Titik titikAwalRefleksi = new Titik(-titikAwal.getAbsis(), titikAwal.getOrdinat());
        Titik titikAkhirRefleksi = new Titik(-titikAkhir.getAbsis(), titikAkhir.getOrdinat());
        return new Garis(titikAwalRefleksi, titikAkhirRefleksi);
    }

    public boolean isTegakLurus(Garis G) {
        return Math.abs(getGradien() * G.getGradien() + 1) < 1e-6;
    }

}
