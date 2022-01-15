package intro;

public class Question {

	public static void main(String[] args) {
		
		boolean control = false ;
		
		for(int sayi = 2 ; sayi <= 1000 ; sayi++){
			
			control = true;
			
            int i=2;
            
            while (i < sayi){
            	
               if (sayi % i == 0){
            	   
            	   control = false;
                   break;
               }
               
               i++;
            }
            
            if(control) {
            	System.out.print(sayi + " ");
            }
        }
	}
}
