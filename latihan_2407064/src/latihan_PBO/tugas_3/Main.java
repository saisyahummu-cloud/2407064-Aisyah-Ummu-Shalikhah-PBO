package latihan_PBO.tugas_3;

public class Main {
    public static void main(String[] args) {
        BangunRuang br = new BangunRuang(10, 5, 4);

       
        System.out.println("Luas alas : " + br.hitungLuas());   
        System.out.println("Volume dari class parents    : " + br.hitungVolume());
        System.out.println("Volume dari class child    : " + br.hitungVolume()); 
    }
}