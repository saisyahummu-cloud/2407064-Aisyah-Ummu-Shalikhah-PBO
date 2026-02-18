package latihan_PBO.latihan_1;

class Cafe{
    String nama;
    String alamat;
    Cafe(String nama, String alamat){
    this.nama = nama;
   this.alamat = alamat;
   
  
} 
//method
void buka(){
    System.out.println("Cafe " +  nama + " Sudah Buka ");
}
}

// contrusctor

public class Main {
 public static void main(String[] args) {

  Cafe cafe1 = new Cafe("Kopi Kenangan", "Indramayu");
  Cafe cafe2 = new Cafe("Janji Jiwa", "Jatibarang");  
  Cafe cafe3 = new Cafe("kopte", "imkot");  

  cafe1.buka();

System.out.println("Nama Cafenya adalah : " + cafe1.nama);
System.out.println("Alamatnya ada di : " + cafe1.alamat);

System.out.println("Nama Cafenya adalah : " + cafe2.nama);
System.out.println("Alamatnya ada di : " + cafe2.alamat);

System.out.println("Nama Cafenya adalah : " + cafe3.nama);
System.out.println("Alamatnya ada di : " + cafe3.alamat);
 }   
}