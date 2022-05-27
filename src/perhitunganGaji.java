import java.util.Scanner;
import java.io.*;

public class perhitunganGaji {

    public static void main(String []args){
        int gol, gaji_kotor, tunj_mrt, tunj_ank, mar, ank;
        double pajak, gaji_bersih;

        int golongan[] = {0, 2000000, 2500000, 3000000, 3500000};
        int marital[] = {0, 300000, 500000, 800000, 1000000};
        int anak[] = {0, 1, 2};

        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("----------------------------");
            System.out.println("   LAPORAN GAJI BULAN INI   ");
            System.out.println("----------------------------");
            System.out.print("Nama: ");
            buf.readLine();
            System.out.print("NIP: ");
            Integer.parseInt(buf.readLine());
            System.out.print("Golongan: ");
            gol = sc.nextInt();
            System.out.println("Status Marital: (masukan golongan anda, bila belum menikah ketik 0)");
            mar = sc.nextInt();
            System.out.print("Jumlah Anak: ");
            ank = sc.nextInt();
            System.out.println("----------------------------");

            switch (gol){
                case 1 :
                    gaji_kotor = golongan[gol];
                    tunj_mrt = marital[mar];
                    tunj_ank = 500000 * anak[ank];
                    pajak = gaji_kotor * 0.025;
                    break;
                case 2 :
                    gaji_kotor = golongan[gol];
                    tunj_mrt = marital[mar];
                    tunj_ank = 750000 * anak[ank];
                    pajak = gaji_kotor * 0.05;
                    break;
                case 3 :
                    gaji_kotor = golongan[gol];
                    tunj_mrt = marital[mar];
                    tunj_ank = 1000000 * anak[ank];
                    pajak = gaji_kotor * 0.07;
                    break;
                case 4 :
                    gaji_kotor = golongan[gol];
                    tunj_mrt = marital[mar];
                    tunj_ank = 1250000 * anak[ank];
                    pajak = gaji_kotor * 0.1;
                    break;
                default:
                    gaji_kotor = 0;
                    tunj_ank = 0;
                    tunj_mrt = 0;
                    pajak = 0;
            }

            gaji_bersih = gaji_kotor + tunj_mrt + tunj_ank - pajak;

            System.out.println("Gaji Kotor: "+gaji_kotor);
            System.out.println("Tunjangan Anak: "+tunj_ank);
            System.out.println("Tunjangan Marital: "+tunj_mrt);
            System.out.println("========================== +");
            System.out.println("Gaji Bersih: "+gaji_bersih);
            System.out.println("----------------------------");

        } catch (IOException e){
            System.out.println("Error Input");
        } catch (Exception e){
            System.out.println("Terdapat Error");
        }
    }
}