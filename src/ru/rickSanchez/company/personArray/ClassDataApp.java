package ru.rickSanchez.company.personArray;

public class ClassDataApp {
    public static void main(String[] args){
        int size = 100;
        ClassDataArray arr = new ClassDataArray(size);

        arr.insert("Alex","Smith", 59);
        arr.insert("Lex","Kay", 12);
        arr.insert("John","Wolf", 44);
        arr.insert("Lola","Rose", 32);
        arr.insert("Dima","Gurien", 23);

        arr.display();

        String searchKey = "Kay";
        Person found = arr.find(searchKey);
        if(found != null){
            System.out.print("Found ");
            found.displayPerson();
        }else System.out.println("Can't find "+searchKey);

        System.out.println("Deleting Rose");
        arr.delete("Rose");

        arr.display();
    }
}
