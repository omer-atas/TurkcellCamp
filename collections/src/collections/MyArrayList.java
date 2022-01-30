package collections;

public class MyArrayList<T> {
	
    private Object[] tmp;
    private Object[] products;

    public MyArrayList() {
    	
        products = new Object[1];
    }

    public void add(Object product) {
    	
        if (products[0] == null) {
            products[0] = product;
        } else {
        	tmp = products;
            products = new Object[tmp.length + 1];
            for (int i = 0; i < tmp.length; i++) {
                products[i] = tmp[i];
            }
            products[products.length - 1] = product;
        }
        
    }

    public void update(int index, Object product) {
    	
        if (index >= products.length) {
            System.out.println("Girilen index'te herhangi bir veri bulunmamaktadýr..");
        } else {
            products[index] = product;
        }
        
    }

    public void delete(int index) {
    	
        if (index >= products.length) {
            System.out.println("Girilen index'te herhangi bir veri  bulunmamaktadýr..");
        } else {
            int k = 0;
            tmp = new Object[products.length - 1];
            for (int i = 0; i < products.length; i++) {
                if (i != index) {
                	tmp[k] = products[i];
                    k++;
                }
            }
            products = tmp;
        }
        
    }

    public void getAll() {
    	
    	System.out.print("[ ");
    	for (Object p : products) {
			System.out.print(p+ " ");
		}
    	System.out.print("]");
    }

}
