package methods;

public class Main {

	public static void main(String[] args) {
		sayıBulma();

	}

	public static void sayıBulma() {

		int[] sayilar = new int[] { 1, 2, 5, 7, 9, 0 };
		int aranacak = 5;
		boolean varMı = false;

		for (int sayi : sayilar) {
			if (sayi == aranacak) {
				varMı = true;
			}
		}

		if (varMı) {
			mesajVer(aranacak + " sayisi listede vardır.");
		} else {
			mesajVer(aranacak + " sayisi listede yoktur.");
		}

	}
	
	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	}

}
