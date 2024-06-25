package Ordenar;

public class OrderedApp {
    public static void main(String[] args) {
        int maxSize = 100;
        OrdArray arr;
        arr = new OrdArray(maxSize);

        arr.insert(21);
        arr.insert(53);
        arr.insert(83);
        arr.insert(12);
        arr.insert(00);
        arr.insert(93);
        arr.insert(11);
        arr.insert(33);
        arr.insert(66);
        arr.insert(74);

        int searchKey = 55; //Search for item
        if(arr.find(searchKey) != arr.size())
            System.out.println("Found " + searchKey);

        else
            System.out.println("Can't find " + searchKey);

        arr.display(); //Mostrar items
        arr.delate(00); //eliminar 3 items
        arr.delate(66);
        arr.delate(11);
        arr.display(); //Mostrar items de nuevo
    }
    
}
