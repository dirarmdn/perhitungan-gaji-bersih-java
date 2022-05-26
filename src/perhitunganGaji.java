import java.util.Scanner;
import java.io.*;

public class perhitunganGaji {

    public static void main(String []args){
        int anak, gol, marital, gaji_kotor, tunj_mrt, tunj_ank;
        double pajak, gaji_bersih;

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
            System.out.print("Status Marital: ");
            marital = sc.nextInt();
            System.out.print("Jumlah Anak: ");
            anak = sc.nextInt();
            System.out.println("----------------------------");

            switch (gol){
                case 1 :
                    gaji_kotor = 2000000;
                    pajak = gaji_kotor * 0.025;
                    break;
                case 2 :
                    gaji_kotor = 2500000;
                    pajak = gaji_kotor * 0.05;
                    break;
                case 3 :
                    gaji_kotor = 3000000;
                    pajak = gaji_kotor * 0.07;
                    break;
                case 4 :
                    gaji_kotor = 3500000;
                    pajak = gaji_kotor * 0.1;
                    break;
                default:
                    gaji_kotor = 0;
                    pajak = 0;
            }

            switch (marital){
                case 1:
                    tunj_mrt = 300000;
                    break;
                case 2:
                    tunj_mrt = 500000;
                    break;
                case 3:
                    tunj_mrt = 800000;
                    break;
                case 4:
                    tunj_mrt = 1000000;
                    break;
                default:
                    tunj_mrt = 0;
                    break;
            }

            if (gol == 1 && anak == 1) {
                tunj_ank = 500000;
            }else if(gol == 1 && anak == 2){
                tunj_ank = 1000000;
            }else if(gol == 2 && anak == 1){
                tunj_ank = 750000;
            }else if(gol == 2 && anak == 2){
                tunj_ank = 1500000;
            }else if(gol == 3 && anak == 1){
                tunj_ank = 1000000;
            }else if(gol == 3 && anak == 2){
                tunj_ank = 2000000;
            }else if(gol == 4 && anak == 1){
                tunj_ank = 1250000;
            }else if(gol == 4 && anak == 2){
                tunj_ank = 2500000;
            } else {
                tunj_ank = 0;
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
        }
    }
}
