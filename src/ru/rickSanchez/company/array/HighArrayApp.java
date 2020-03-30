package ru.rickSanchez.company.array;

public class HighArrayApp {
    public static void main(String[] args) {
        int maxSize = 100;
        HighArray array = new HighArray(maxSize);

        array.insert(77);
        array.insert(88);
        array.insert(33);
        array.insert(25);

        array.display();

        int searchKey = 25;
        if(array.find(searchKey)){
            System.out.println("Found "+searchKey);
        }else System.out.println("Can't find "+searchKey);

        array.delete(88);
        array.delete(33);

        array.display();
    }
}
