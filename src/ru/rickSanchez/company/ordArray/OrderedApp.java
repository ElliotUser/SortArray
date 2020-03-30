package ru.rickSanchez.company.ordArray;

public class OrderedApp {
    public static void main(String[] args) {
        int maxSize = 100;
        OrdArray arr = new OrdArray(maxSize);

        arr.insert(33);
        arr.insert(44);
        arr.insert(88);
        arr.insert(12);
        arr.insert(1);
        arr.insert(3);
        arr.insert(19);
        arr.insert(6);

        arr.display();

//        int searchKey = 88;
//        if(arr.find(searchKey) != arr.size()){
//            System.out.println("Found " + searchKey);
//        }else System.out.println("Can't find " + searchKey);

//        arr.display();

//        arr.delete(1);
//        arr.delete(3);
//        arr.delete(88);
//
//        arr.display();


    }
}
