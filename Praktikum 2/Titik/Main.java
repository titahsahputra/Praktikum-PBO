public class Main {
//    static double counter;
    public static void main(String[] args){
        Titik t1 = new Titik(3, 1);
        Titik t2 = new Titik();
        Titik t3 = new Titik(5,6);

        //Garis G1 = new Garis(t1,t2);
        //Garis G2 = new Garis(new Titik(3.0, 5.0), new Titik(7.0, 9.0));

        t2.setAbsis(3);
        t2.setOrdinat(4);

        System.out.println("t1: " + t1.getAbsis()+ ", "+ t1.getOrdinat());
        System.out.println("t2: " + t2.getAbsis()+ ", "+ t2.getOrdinat());
        System.out.println("t3: " + t3.getAbsis()+ ", "+ t3.getOrdinat());

        System.err.println("absis t1 dengan enkapsulasi :" + t2.getAbsis());

        System.out.println("Koordinat awal: (" + t1.getAbsis() + ", " + t1.getOrdinat() + ")");
        
        double jarak = t1.getJarakPusat(t1.getAbsis(), t1.getOrdinat());
        System.out.println("Jarak titik dengan pusat (0,0): " + jarak);

        t1.refleksiX();
        System.out.println("Setelah refleksi terhadap sumbu X: (" + t1.getAbsis() + ", " + t1.getOrdinat() + ")");
        
        t1.refleksiY();
        System.out.println("Setelah refleksi terhadap sumbu Y: (" + t1.getAbsis() + ", " + t1.getOrdinat() + ")");

        Titik titikRefleksiX = t1.getRefleksiX();
        System.out.println("Titik hasil refleksi terhadap sumbu X: (" + titikRefleksiX.getAbsis() + ", " + titikRefleksiX.getOrdinat() + ")");

        Titik titikRefleksiY = t1.getRefleksiY();
        System.out.println("Titik hasil refleksi terhadap sumbu Y: (" + titikRefleksiY.getAbsis() + ", " + titikRefleksiY.getOrdinat() + ")");
    
//GARIS
        //System.out.println("Garis: Titik awal:" + G1.getTitikAwal().getAbsis()+", "+G1.getTitikAwal().getOrdinat()+" titik akhir :"+G1.getTitikAkhir().getAbsis()+", "+G1.getTitikAkhir().getOrdinat());
        //System.err.println("absis t1 dengan enkapsulasi :" + t2.absis);
        //System.out.println("jumlah objek titik yang telah dibuat: " + Titik.getCounter());
        
        
        //System.out.println("Panjang garis 1: " + G1.getPanjang());
        //System.out.println("Gradien garis 1: " + G1.getGradien());

        //Garis garisRefleksiY = G1.getRefleksiY();
        //System.out.println("Garis hasil refleksi terhadap sumbu Y: (" + garisRefleksiY.titikAwal.getAbsis() + ", " + garisRefleksiY.titikAwal.getOrdinat() + ") - (" + garisRefleksiY.titikAkhir.getAbsis() + ", " +garisRefleksiY.titikAkhir.getOrdinat() + ")");

        //System.out.println("Apakah garis 1 tegak lurus dengan garis 2? " + G1.isTegakLurus(G2));
    }

}

