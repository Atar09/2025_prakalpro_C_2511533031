package pekan3;
import java.util.Scanner;
public class HitungVolume {

	public static void main(String[] args) {
		double r,t,volume;
	    double phi = 3.14;
	    Scanner keyboard = new Scanner (System.in);
	    System.out.print("masukkan jari jari tabung: ");
	    r = keyboard.nextDouble();
	    System.out.print("masukkan tinggi tabung: ");
	    t = keyboard.nextDouble();
	    keyboard.close();
        volume = phi * r * r * t;
        System.out.println("volume tabung Adalah = " + volume);
	}
	
}