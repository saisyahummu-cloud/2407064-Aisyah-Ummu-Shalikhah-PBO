package latihan_PBO.tugas_1;

import java.util.Scanner;

/**
 * Class Main berfungsi sebagai pengatur alur program (User Interface).
 * Menggunakan Selection (Switch-Case) untuk memilih menu.
 */
public class Main {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk menangkap input dari keyboard
        Scanner input = new Scanner(System.in);
        
        // Instansiasi objek dari class BangunDatar
        BangunDatar bd = new BangunDatar();

        System.out.println("=== KALKULATOR BANGUN DATAR ===");
        System.out.println("1. Persegi");
        System.out.println("2. Persegi Panjang");
        System.out.println("3. Segitiga");
        System.out.println("4. Belah Ketupat");
        System.out.print("Pilih Menu (1-4): ");

        int pilih = input.nextInt();

        // Struktur Selection sesuai instruksi tugas
        switch (pilih) {
            case 1:
                System.out.print("Masukkan Sisi: ");
                bd.setSisi(input.nextDouble()); // Mengirim input ke setter
                System.out.println("Hasil Luas Persegi: " + bd.hitungPersegi());
                break;

            case 2:
                System.out.print("Masukkan Panjang: ");
                bd.setPanjang(input.nextDouble());
                System.out.print("Masukkan Lebar: ");
                bd.setLebar(input.nextDouble());
                System.out.println("Hasil Luas Persegi Panjang: " + bd.hitungPersegiPanjang());
                break;

            case 3:
                System.out.print("Masukkan Alas: ");
                bd.setAlas(input.nextDouble());
                System.out.print("Masukkan Tinggi: ");
                bd.setTinggi(input.nextDouble());
                System.out.println("Hasil Luas Segitiga: " + bd.hitungSegitiga());
                break;

            case 4:
                System.out.print("Masukkan Diagonal 1: ");
                bd.setDiagonal1(input.nextDouble());
                System.out.print("Masukkan Diagonal 2: ");
                bd.setDiagonal2(input.nextDouble());
                System.out.println("Hasil Luas Belah Ketupat: " + bd.hitungBelahKetupat());
                break;

            default:
                System.out.println("Input Salah! Silakan pilih angka 1-4.");
        }

        // Menutup scanner untuk efisiensi memori
        input.close();
    }
}