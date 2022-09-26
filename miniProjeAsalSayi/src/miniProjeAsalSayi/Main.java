package miniProjeAsalSayi;

public class Main {

	public static void main(String[] args) {
		
		int number=-2;
		int remainder = number % 2;
		System.out.println(remainder);
		
		boolean asalMı = true;
		
		if(number==1) {
			System.out.println("Asal sayı değildir.");
			return;
		}
		if(number<1) {
			System.out.println("Geçersiz sayı");
			return;
		}
		
		for (int i=2;i<number;i++) {
			int kalan = number % i;
			if (kalan==0) {
				asalMı = false;
			}
			
		}
		if (asalMı) {
			System.out.println("Asal sayıdır");
		}
		else {
			System.out.println("Asal sayı değildir.");
		}
		
		

	}

}
