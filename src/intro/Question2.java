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

		int sayac = 1, sayi=1;
		boolean control=false;
		
		List<Integer> list = new ArrayList<Integer>();
		
		while(sayac < 6) {
			control = mukemmelSayi(sayi);
			if (control) {
				System.out.println(sayi);
				list.add(sayi);
				sayac++;
			}
			sayi++;
		}
		
		System.out.println(list);
	}

}
