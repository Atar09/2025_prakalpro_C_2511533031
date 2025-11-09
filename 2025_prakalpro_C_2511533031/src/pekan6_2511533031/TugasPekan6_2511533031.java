package pekan6_2511533031;

import java.util.Random;
import java.util.Scanner;

public class TugasPekan6_2511533031 {
	
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);

        int percobaan = 0;
        boolean running = true;

        while (running) {
            percobaan++;
            int dadu1 = rand.nextInt(6) + 1;
            int dadu2 = rand.nextInt(6) + 1;
            int sum = dadu1 + dadu2;

            System.out.println("Percobaan ke-" + percobaan);
            System.out.println(dadu1 + " + " + dadu2 + " = " + sum);
            if (sum != 7)
            	System.out.println("Tebakan Anda Salah");
            if (sum == 7) {
                System.out.println("Anda Menang Setelah "+ percobaan + " Percobaan ");
                break; 
            }

            System.out.print("Apakah ingin lanjut main (ya/tidak)? ");
            String jawaban = scan.nextLine(); 


            if (jawaban.equalsIgnoreCase("ya")) {
            } else if (jawaban.equalsIgnoreCase("tidak")) {
            	System.out.println("Anda Gagal Menang");
                running = false;
            } else {
                System.out.println("Jawaban Tidak Dikenali, Dianggap 'Tidak Melanjutkan Permaianan'");
                break;
            }
        }	
        
    }
}
