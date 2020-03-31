package ru.rickSanchez.company.personArray;

public class ClassDataArray {
    private Person[] array;
    private int nElems;

    public ClassDataArray(int max){
        array = new Person[max];
        nElems = 0;
    }

    public Person find(String searchName){
        int j;
        for(j = 0; j < nElems; j++)
            if(array[j].getLastName().equals(searchName))
                break;
        if(j == nElems)
            return null;
        else
            return array[j];
    }

    public void insert(String first, String last, int age){
        array[nElems] = new Person(first, last, age);
        nElems++;
    }

    public boolean delete(String searchName){
        int j;
        for(j = 0; j < nElems; j++)
            if(array[j].getLastName().equals(searchName))
                break;
        if(j == nElems)
            return false;
        else {
            for(int k = j; k < nElems; k++) {
                array[k] = array[k+1];
            }
            nElems--;
            return true;
        }
    }

    public void display(){
        for(int i = 0; i < nElems; i++) {
            array[i].displayPerson();
        }
    }
}
