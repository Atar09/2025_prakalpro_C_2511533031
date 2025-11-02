package pekan5_2511533031;

public class TugasPekan5_2511533031 {

	public static void main(String[] args) {
		
	int n = 4;
	System.out.print("#");
	for ( int i= 1; i<=n*4; i++) {
		System.out.print("=");
	}
	System.out.println("#");
	
	for (int i= 1; i<=n; i++) {
		System.out.print("|");
		for (int j=1; j<=4-i; j++) {
			System.out.print("  ");
		}
		System.out.print("<>");
		for (int j=1; j<=(i-1)*4; j++) {
			System.out.print(".");
		}
		System.out.print("<>");
		for (int j=1; j<= 4-i; j++) {
			System.out.print("  ");
		}
		System.out.println("|");
	}
	for (int i= n; i>=1; i--) {
		System.out.print("|");
		for (int j=1; j<=4-i; j++) {
			System.out.print("  ");
		}
		System.out.print("<>");
		for (int j=1; j<=(i-1)*4; j++) {
			System.out.print(".");
		}
		System.out.print("<>");
		for (int j=1; j<= 4-i; j++) {
			System.out.print("  ");
		}
		System.out.println("|");
	}
	System.out.print("#");
	for ( int i= 1; i<=n*4; i++) {
		System.out.print("=");
	}
	System.out.println("#");
	
		}
	}