// package latihan_PBO.tugas_4;

// public class Main {
//     // public static void main(String[] args) {
//     // BangunDatar bd1 = new BangunDatar(3,4);
//     // BangunDatar bd2 = new Persegi(5);
//     // BangunDatar bd3 = new Segitiga(5,2);

//     // bd1.tampilkan();
//     // bd2.tampilkan();
//     // bd2.tampilkan();
// // }
// }
package latihan_PBO.tugas_4;

public class Main {
    public static void main(String[] args) {
        
        BangunDatar objek;

        objek = new BangunDatar(3.0, 4.0);
        objek.tampilkan();
        System.out.println(); 

        objek = new Persegi(5.0);
        objek.tampilkan();
        System.out.println();

        objek = new PersegiPanjang(10.0, 5.0);
        objek.tampilkan();
        System.out.println();

        objek = new Segitiga(6.0, 8.0);
        objek.tampilkan();
    }
}