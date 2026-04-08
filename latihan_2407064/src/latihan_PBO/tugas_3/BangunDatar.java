package latihan_PBO.tugas_3;

public class BangunDatar {
    // 1a & 1b. Atribut private panjang dan lebar (Enkapsulasi) 
    protected double panjang;
    protected double lebar;

    // 1c. Constructor untuk mengisi nilai 
    public BangunDatar(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public double hitungLuas(){
        return panjang * lebar *2;
    }

    public void tampilkanHasil(){
        System.out.println("panjang: " + panjang);
        System.out.println("lebar = " + lebar);
    }
}