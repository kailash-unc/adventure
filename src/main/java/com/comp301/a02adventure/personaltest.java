package com.comp301.a02adventure;

public class personaltest {
    public static void main(String args[]){
        Item one = new ItemImpl("Ball");
        Item two = new ItemImpl("Toy");
        Item three = new ItemImpl("cat");
        Item four = new ItemImpl("dog");

        Inventory other = new InventoryImpl();
        other.addItem(one);
        other.addItem(two);
        other.addItem(three);
        other.addItem(four);

        System.out.println("Hello");

        Inventory main = new InventoryImpl();

        main.transferFrom(other);

        System.out.println("YAYYAYAYA");
    }
}
