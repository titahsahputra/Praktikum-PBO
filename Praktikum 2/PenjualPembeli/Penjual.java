public class Penjual {
    private String nama, alamat, nomor;

    //Konstruktor
    public Penjual(){
        this.nama=nama;
        this.alamat=alamat;
        this.nomor=nomor;
    }

    public String getNama(){
        return this.nama;
    }
    
    public String getAlamat(){
        return this.alamat;
    }
    
    public String getNomor(){
        return this.nomor;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
    public void setNomor(String nomor) {
        this.nomor = nomor;
    }
    public String getInfoPenjual(){
        return "Nama Penjual : " + getNama() +"\nAlamat : " + getAlamat()+"\nNomor Telepon : " +getNomor();
    }
}

