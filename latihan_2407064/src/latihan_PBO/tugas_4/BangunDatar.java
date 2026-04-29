package latihan_PBO.tugas_4;

public class BangunDatar { 
    private double varA; // Atribut dari class bangun datar
    private double varB;

   
    public BangunDatar(double varA, double varB) { //Contructor
        this.varA = varA;
        this.varB = varB;
    }


    public BangunDatar(double varA) {
        this.varA = varA;
    }

   
    public double getVarA() { return varA; }
    public double getVarB() { return varB; }

    public double hitungLuas() {
        return 0;
    }

   
    public void tampilkan() {
        System.out.println("Bangun Datar");
        System.out.println("===================");
        System.out.println("varA: " + varA);
        System.out.println("varB: " + varB);
        System.out.println("===================");
    }
}