package intro;

import java.util.ArrayList;
import java.util.List;

public class Question2 {
	
	public static boolean mukemmelSayi(int sayi) {
		int top=0;
		for (int i = 1; i < sayi; i++) {
			if(sayi % i == 0) {
				top += i;
			}
		}
		
		if(top == sayi) {
			return true;
		}
		
		return false;
	}

	public static void main(String[] args) {

		int sayi=1;
		boolean control=false;
		
		List<Integer> list = new ArrayList<Integer>();
		
		int sayac=1;
		while(sayac < 5) {
			control = mukemmelSayi(sayi);
			if (control) {
				list.add(sayi);
				sayac++;
			}
			sayi++;
		}
		
		System.out.println(list);
	}

}
