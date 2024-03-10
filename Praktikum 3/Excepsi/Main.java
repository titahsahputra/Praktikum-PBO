public class Main {
    public static void main(String[] args) {
        Pembeli pembeli = new Pembeli("Tatih");
        Obat obat1 = new Obat("Vitamin C");
        Obat obat2 = new Obat("Tramadol");
        Obat obat3 = new Obat("Diapet");
        Obat obat4 = new Obat("Amoxilin");
        Obat obat5 = new Obat("Diapet");
        Obat obat6 = new Obat("Antangin");

        try {
            //simulasi Obat tidak tersedia
            pembeli.beliObat(obat1);
            pembeli.beliObat(obat1);

            // Simulasi Keranjang penuh
            pembeli.beliObat(obat2);
            pembeli.beliObat(obat3);
            pembeli.beliObat(obat4);
            pembeli.beliObat(obat5);
            pembeli.beliObat(obat6);

        } catch (BatasObatPenuhException | ObatTidakTersediaException e) {
            System.out.println(e.getMessage());
        }
    }
}