package com.grupotres.foodpal.classes;

public class Item {
    private String nombre, clasificacion;
    private Integer calorias, hidratosCarbono, proteinas, grasas;

    public Item(String nombre, String clasificacion, Integer calorias, Integer hidratosCarbono, Integer proteinas, Integer grasas) {
        this.nombre = nombre;
        this.clasificacion = clasificacion;
        this.calorias = calorias;
        this.hidratosCarbono = hidratosCarbono;
        this.proteinas = proteinas;
        this.grasas = grasas;
    }

    public String getNombre() {
        return nombre;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public Integer getCalorias() {
        return calorias;
    }

    public Integer getHidratosCarbono() {
        return hidratosCarbono;
    }

    public Integer getProteinas() {
        return proteinas;
    }

    public Integer getGrasas() {
        return grasas;
    }
}
