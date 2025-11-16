package pekan7_2511533031;

import java.util.Scanner;

public class tugasAlproPekan7_2511533031 {
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        System.out.println("=== Registrasi Akun Baru ===");
	        System.out.print("Masukkan Username: ");
	        String username = input.nextLine();
	        System.out.print("Masukkan Password: ");
	        String password = input.nextLine();
	        System.out.print("Masukkan Email: ");
	        String email = input.nextLine();
	        System.out.print("Masukkan PIN (Angka 6 Digit): ");
	        int pin = input.nextInt();

	        Akun_2511533031 a= new Akun_2511533031();
	        a.setUsername(username);
	        a.setPassword(password);
	        a.setEmail(email);
	        a.setPinAngka(pin);
	        
	        if (!a.isPasswordValid()) {
	        	System.out.println("--- REGISTRASI GAGAL ---");
	        	System.out.println("ERROR: Password Minimal Mengandung 8 Karakter");
	            return;
	        }
	        if (!a.isEmailValid()) {
	            System.out.println("--- REGISTRASI GAGAL ---");
	            System.out.println("ERROR: Email anda \""+ email +"\" tidak valid (harus mengandung '@' dan '.')");
	            return;
	        }
	        System.out.println();
	        System.out.println("--- Registrasi Berhasil ---");
	        System.out.println("Akun untuk \""+ username +"\" telah berhasil dibuat.");
	        System.out.println();
	        System.out.println("--- Detail Akun ---");
	        System.out.println("Username (Lowercase) : " + username.toLowerCase());
	        System.out.println("Email (Uppercase) : " + email.toUpperCase());
	        System.out.println("ID Pengguna (Gabungan) : " + username + pin);
	        System.out.println();
	        System.out.println("--- Uji Tipe Data (Pin Anda: " + pin + ") ---");
	        System.out.println("PIN (int) + 10 = " + (pin + 10));
	        System.out.println("PIN (String) \""+ 10 +"\" = " + (String.valueOf(pin) + 10));
	        
	        }
	}

