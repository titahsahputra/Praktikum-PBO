public class KeranjangObat {
    private String[] keranjang;
    private int count;
    
    public KeranjangObat(){
        keranjang = new String[5];
        count = 0;
    }
    public void tambahObat(String obat){
        if(count!=5){
            keranjang[count]=obat;
            count = count + 1;
        }else{
            assert(count>5):"Keranjang penuh";
        }
    }public void tampilkanObat(){
        for (int i = 0 ; i < keranjang.length; i++){
            System.out.println(keranjang[i]);
        }
    }

}
