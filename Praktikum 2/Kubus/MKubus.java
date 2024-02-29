//Titah Mohamad Sahputra 24060122120007 lab A1

public class MKubus {
    public static void main(String[] args){
        Kubus k1 = new Kubus(4);
        Kubus k2 = new Kubus();

        k2.setSisi(7);

        System.out.println("Sisi k1 : " + k1.getSisi());
        System.out.println("Sisi k2 : " + k2.getSisi());

        System.out.println("volume k2 : " + k2.hitungVolume());
        System.out.println("Luas permukaan k1 : " + k1.hitungLuasPermukaan());
        
    }
    
}