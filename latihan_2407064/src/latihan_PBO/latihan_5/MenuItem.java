package latihan_PBO.latihan_5;

public class MenuItem extends Menu {

    private int jumlah;

    public MenuItem(String nama, double harga, int  jumlah) {
        super(nama ,harga);
        this.jumlah = jumlah;
    }

    @Override
    public double hitungTotal() {
        return harga*jumlah;
    }
    @Override
    public void tampilkan() {
        System.out.println(nama + " = " + harga + " * " + jumlah + " = " + hitungTotal());
    }
}
