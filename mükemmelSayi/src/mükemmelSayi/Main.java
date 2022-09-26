package mükemmelSayi;

public class Main {

	public static void main(String[] args) {
		
		int number=28;
		int total=0;
		boolean mukemmelSayiMi = false;
		
		for(int i=1;i<number;i++) {
			if(number%i==0) {
			 total = i + total;
			} 
		}
		if(total==number) {
			mukemmelSayiMi=true;
			System.out.println(number + " bir mükemmel sayıdır.");
		}else {System.out.println(number + " bir mükemmel sayı değildir.");}
		
		

	}

}
