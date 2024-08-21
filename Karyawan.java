package Bu_Aul;
import java.util.Scanner;


public class Karyawan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        // Meminta input jumlah jam kerja
        System.out.println("Masukan jumlah jam kerja ");
        int JamKerja = scanner.nextInt();

        // Meminta input tarif jam kerja
        System.out.println("Masukan tarif per jam kerja ");
        int tarifPerjam = scanner.nextInt();

        // Menghitung gaji bruto
        int gajiBruto = JamKerja * tarifPerjam;
    
        // Menghitung potongan pajak
        double PotonganPajak = gajiBruto * 0.10;

        // Menghitung potongan pajak
        double gajiBersih = gajiBruto - PotonganPajak;

        // Menampilkan hasil
        System.out.println(" Gaji Bruto: " + gajiBruto);
        System.out.println(" Potongan pajak: " + PotonganPajak);
        System.out.println(" Gaji Bersih: " + gajiBersih);
    
    
    }
}
