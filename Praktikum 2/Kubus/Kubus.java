//Titah Mohamad Sahputra 24060122120007 lab A1

public class Kubus {
    // Atribut
    private double sisi;

    // Konstruktor
    public Kubus(double sisi) {
        this.sisi = sisi;
    }

    public Kubus() {
        this.sisi = sisi;
    }

    public double getSisi() {
        return this.sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public double hitungVolume() {
        return Math.pow(sisi, 3);
    }
    public double hitungLuasPermukaan(){
        return 6 * sisi * sisi;
    }
}
