package Bu_Aul;

import java.util.Scanner;

public class Diskon {
    public static void main(String[] args) {
        double Jumlahbarang, hargabarang, diskon, totalharga;

        Scanner input = new Scanner(System.in);
        System.out.println("jumlahbarang");
        Jumlahbarang = input.nextDouble();
        System.out.println("hargabarang");
        hargabarang = input.nextDouble();
        System.out.println("diskon");
        diskon = input.nextDouble();
    
        totalharga = hargabarang*Jumlahbarang;
        diskon= diskon/100*totalharga;

        totalharga = totalharga-diskon;
        System.out.println("totalharga"+totalharga);


    }
    
}
