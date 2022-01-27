package intro;

public class Qustions3 {

	public static int toplam(int sayi) {
		int top = 0;
		for(int i= 1 ; i < sayi ; i++ ) {
			if( sayi % i == 0 ) {
				top += i;
			}
		}
		return top;
	}
	
	public static void main(String[] args) {
				
		int sayi = 1, sayi2 = 1, top= 0, top2=0, sayac= 0;
		
		while (true) {
			
			top = toplam(sayi);
			sayi2 = 0;
			
			while (sayi2 < sayi) {
				top2 = toplam(sayi2);
				if (sayi == top2 && sayi2 == top) {
					System.out.println( "("+ sayi + "," + sayi2 + ") çifti arkadaþ sayidir." );
					sayac++;
				}
				sayi2++;
			}
			
			if(sayac == 2) {
				break;
			}
			
			sayi++;			
			
		}
		
	}

}
