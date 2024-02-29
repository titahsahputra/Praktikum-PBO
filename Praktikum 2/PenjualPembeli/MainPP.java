public class MainPP {
    public static void main(String[] args){
        Produk B1 = new Produk();
        Penjual O1 = new Penjual();
        
        B1.setNama("Sony Xperia V");
        B1.setHarga(21500000);
        B1.setDeskripsi("Sony Flagship Phone");
        B1.setStok(2);

        O1.setNama("Juki Jukiman");
        O1.setAlamat("Jl.Belanda no.3");
        O1.setNomor("0231387643");

        System.out.println(B1.getInfoProduk());
        System.out.println(O1.getInfoPenjual());

    }
    
}
