public class Produk {
    //Atribut
    private String nama, deskripsi;
    private double  harga, stok;

    // Konstruktor
    public Produk(){
        this.nama= nama;
        this.harga=harga;
        this.stok=stok;
        this.deskripsi=deskripsi;
    }
    public String getNama(){
        return this.nama;
    }
    public String getDeskripsi(){
        return this.deskripsi;
    }
    public double getHarga(){
        return this.harga;
    }
    public double getStok(){
        return this.stok;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public void setStok(double stok) {
        this.stok = stok;
    }
    
    public String getInfoProduk(){
        return "Nama Produk : " + getNama() +"\nHarga : " + getHarga()+"\nStok Tersisa : " +getStok()+ "\nDeskripsi Produk : "+getDeskripsi();
    }
}
