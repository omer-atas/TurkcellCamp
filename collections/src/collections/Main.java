package collections;

public class Main {
    
    public static void main(String[] args){
        
        MyArrayList<Object> myArrayList = new MyArrayList<>();
       
        myArrayList.add("Java Developer");
        myArrayList.add('c');
        myArrayList.add(true);
        myArrayList.add(4);
        myArrayList.delete(3);
        
        myArrayList.update(1, 20.00);
        
        myArrayList.getAll();
        
    }

}

// ArrayList nedir? nas�l �al���r ?
// ArrayList fonksiyonlar� nelerdir ? �rnekleyiniz..
// engindemirog@gmail.com
