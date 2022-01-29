package collections;

public class Main {
    
    public static void main(String[] args){
        
        MyArrayList<Object> myArrayList = new MyArrayList<>();
        
        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(3);
        myArrayList.add(4);
        myArrayList.delete(3);
        
        myArrayList.update(1, "Java");
        
        myArrayList.getAll();
        
    }

}

// ArrayList nedir? nasýl çalýþýr ?
// ArrayList fonksiyonlarý nelerdir ? Örnekleyiniz..
// engindemirog@gmail.com
