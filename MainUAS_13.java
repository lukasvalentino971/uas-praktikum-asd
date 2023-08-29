import java.util.Scanner;
public class MainUAS_13{
    public static void menuProgram() {
        System.out.println("1. Input Data Pajak");
        System.out.println("2. Daftar Transaksi");
        System.out.println("3. Transaksi ACS berdarkan kendaraan");
        System.out.println("");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedListKendaraan k = new LinkedListKendaraan();
        LinkedListPajak p = new LinkedListPajak();

        System.out.println("====== UAS PRAKTIKUM ASD TI-1E=======");
        System.out.println("Dibuat Oleh : Lukas Valentino");
        System.out.println("NIM         : 2141720032");
        System.out.println("Absen       : 13");
        System.out.println("");

        int inputPilihan;
        do {
           System.out.println("");
           menuProgram();
           System.out.print("Pilih menu : ");
           pilih = sc.nextInt();
           switch (inputPilihan) {
            case 1:
                Kendaraan_13 ken1 = new Kendaraan_13("S3301TY", "VARIO", "RODA-2", 150, 2022, 5);
                k.addLast(ken1);
                Kendaraan_13 ken2 = new Kendaraan_13("S7789VC", "ALPHARD", "RODA-4", 1500, 2023, 7);
                k.addLast(ken2);
                Kendaraan_13 ken3 = new Kendaraan_13("AB8924BN", "SUPRA", "RODA-2", 300, 2025, 7);
                k.addLast(ken3);
                //     int kode, nominal, denda, bulan;

                System.out.println("Masukkan TNKB : ");
                String inTnkb = sc.next();
				
				int itn = k.cekTNBK(inTnkb);
				
                System.out.println("Masukkan bulan bayar : ");
                int inBulanBayar = sc.nextInt();
				
				//double hasil = k.totalYangDibayar(inTnkb, inBulanBayar);
				if(itn >

                
                break;
           
            case 2:

                break;
           } 
        } while (condition);
    }
}