package sayiBulma;

public class Main {

	public static void main(String[] args) {
		
		int[] sayilar = new int[] {1,2,5,7,9,0};
		int aranacak = 5;
		boolean varMı = false;
		
		for (int sayi:sayilar) {
			if(sayi==aranacak) {
				varMı = true;
			}
		}
		
		if(varMı) {
			System.out.println(aranacak + " sayisi listede vardır.");
		}else {System.out.println(aranacak + " sayisi listede yoktur.");}
		

	}

}
