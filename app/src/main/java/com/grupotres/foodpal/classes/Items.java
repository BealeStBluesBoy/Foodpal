package com.grupotres.foodpal.classes;

import java.util.ArrayList;

public class Items {
    private ArrayList<Item> items = new ArrayList<>();

    public Items() {
        items.add(new Item("Mate", "Test", 1, 1, 1, 1));
        items.add(new Item("Cafe", "Test", 1, 1, 1, 1));
        items.add(new Item("Harina", "Test", 1, 1, 1, 1));
        items.add(new Item("Palmitos", "Test", 1, 1, 1, 1));
        items.add(new Item("Yerba", "Test", 1, 1, 1, 1));
        items.add(new Item("Mermelada", "Test", 1, 1, 1, 1));
        items.add(new Item("Cacao", "Test", 1, 1, 1, 1));
        items.add(new Item("Picadillo", "Test", 1, 1, 1, 1));
        items.add(new Item("Pate", "Test", 1, 1, 1, 1));
        items.add(new Item("Caballa", "Test", 1, 1, 1, 1));
        items.add(new Item("Arroz", "Test", 1, 1, 1, 1));
        items.add(new Item("Arvejas", "Test", 1, 1, 1, 1));
        items.add(new Item("Sardinas", "Test", 1, 1, 1, 1));
        items.add(new Item("Atun", "Test", 1, 1, 1, 1));
        items.add(new Item("Choclo", "Test", 1, 1, 1, 1));
        items.add(new Item("Lentejas", "Test", 1, 1, 1, 1));
    }

    public ArrayList<Item> getItems() {
        return items;
    }
}
