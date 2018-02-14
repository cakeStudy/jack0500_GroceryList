import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        //The FileHandler Class store an Arraylist with Items that had been created
        FileHandler fileHandler = new FileHandler();

        //These items are store in the grocery.txt
        GroceryItemOrder cake = new GroceryItemOrder("cake", 100, 10);
        GroceryItemOrder shampoo = new GroceryItemOrder("shampoo", 80, 20);
        GroceryItemOrder food = new GroceryItemOrder("food",50,50);

        //this list is too save the items
        GroceryList2 listToStoreITems = new GroceryList2();

        //To test add method, and I use "listToStoreITems" to store items via FileHandler
        //listToStoreITems.addToList(cake);
        //listToStoreITems.addToList(shampoo);
        //listToStoreITems.addToList(food);

        //reading data from grocery.txt to listToStoreITems
        listToStoreITems = fileHandler.loadObject(listToStoreITems);
        //write the listToStoreITems to the grocery.txt
        //fileHandler.saveObject(listToStoreITems);

        //testing the toString and getTotal methods
        System.out.println(listToStoreITems.toString());
        System.out.println(listToStoreITems.getTotal());



        //Testing the add method, and the store items from listToStoreITems can be us in a new array
        GroceryList groceryListtest1 = new GroceryList();
        //groceryListtest1.add(cake);
        //groceryListtest1.add(shampoo);
        groceryListtest1.add(listToStoreITems.getItem("food"));
        groceryListtest1.add(listToStoreITems.getItem("cake"));

        //testing the toString and getTotalCost methods
        System.out.println(groceryListtest1.getTotalCost());
        System.out.println(groceryListtest1.toString());

    }

}

