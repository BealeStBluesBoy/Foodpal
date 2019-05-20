package com.grupotres.foodpal.classes;

import java.util.ArrayList;

public class Items {
    private ArrayList<Item> items = new ArrayList<>();

    public Items() {
        items.add(new Item("Mate", "infusion", 94, 19, 2, 0));
        items.add(new Item("Cafe", "infusion", 2, 0, 1, 0));
        items.add(new Item("Harina", "Cereales y derivados", 455, 95, 13, 1));
        items.add(new Item("Palmitos", "Fruta", 9, 2, 1, 0));
        items.add(new Item("Yerba", "Planta", 30, 6, 2, 0));
        items.add(new Item("Mermelada", "Conserva dulce", 27, 8, 0, 0));
        items.add(new Item("Cacao", "Planta de Hoja", 12, 3, 1, 1));
        items.add(new Item("Picadillo", "Relleno", 444, 2, 29, 32));
        items.add(new Item("Pate", "Pasca cosmetible", 29, 0, 1, 3));
        items.add(new Item("Caballa", "Pez marino", 182, 0, 19, 12));
        items.add(new Item("Arroz Integral", "Semilla", 355, 74, 7, 2));
        items.add(new Item("Arvejas", "Semilla", 42, 6, 5, 1));
        items.add(new Item("Sardinas", "Pezcado", 224, 0, 23, 15));
        items.add(new Item("Atun", "Pez", 60, 1, 13, 1));
        items.add(new Item("Choclo", "Grano", 97,22, 3, 1));
        items.add(new Item("Lentejas", "Legumbre", 325, 54, 25,2));
    }


    public ArrayList<Item> getItems() {
        return items;
    }
}
