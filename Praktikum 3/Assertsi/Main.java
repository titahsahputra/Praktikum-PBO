  public class Main{
    public static void main (String[] args){
        KeranjangObat KeranjangObat = new KeranjangObat();
        KeranjangObat.tambahObat("paracetamol");
        KeranjangObat.tambahObat("Vitamin C");
        KeranjangObat.tambahObat("Antibiotik");
        KeranjangObat.tambahObat("Obat Flu");
        KeranjangObat.tambahObat("Obat Batuk");
        KeranjangObat.tambahObat("Obat Sakit Kepala"); // asersi
        KeranjangObat.tampilkanObat();
    }
}