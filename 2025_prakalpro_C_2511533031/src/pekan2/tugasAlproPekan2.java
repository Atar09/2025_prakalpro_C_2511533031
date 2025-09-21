package pekan2;

public class tugasAlproPekan2 {
		public static void main(String[] args) {
			int match = 434;               
			float winrate = 65.9f;          
			char grade = 'S';                
			boolean efektif = winrate > 60; 
			
			System.out.println("=== Statistik Hero ===");
			System.out.println("Grade         :" + grade);
			System.out.println("Jumlah Match  :" + match);
			System.out.println("Winrate       : " + winrate + "%");
			System.out.println("Efektif       : " + efektif);
			
			if (efektif) {
				System.out.println("Kesimpulan : Hero ini efektif untuk digunakan.");
			} else {
				System.out.println("Kesimpulan : Hero ini tidak efektif.");
			}
			
			
			
		}

}