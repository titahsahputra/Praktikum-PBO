public class Pembeli {
    private String nama;
    private Obat[] keranjangObat;
    private int jumlahObat;
    //private final int batasObat = 0;

    
    public Pembeli(String nama){
        this.nama= nama;
        keranjangObat= new Obat[5];
        jumlahObat = 0;
    }
    public String getNama(){
        return nama;
    }
    public Obat[] getkeranjangObat(){
        return keranjangObat;
    }
    public void beliObat(Obat Obat) throws BatasObatPenuhException, ObatTidakTersediaException{
        try {
            if(jumlahObat>=5){
                throw new BatasObatPenuhException("Jumlah obat sudah mencapai batas");
            }
            if(!Obat.isTersedia()){
                throw new ObatTidakTersediaException("Obat tidak tersedia");
            }
            Obat.setTersedia(false);
            keranjangObat[jumlahObat] = Obat;
            jumlahObat++;
        }catch(BatasObatPenuhException| ObatTidakTersediaException e){
            System.out.println(e.getMessage());
        }
    }
}
