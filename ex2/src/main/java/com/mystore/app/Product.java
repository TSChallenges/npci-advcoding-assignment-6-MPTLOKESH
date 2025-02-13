package com.mystore.app;

class Product {

    private int id;
    private String name;

    public Product() {
        System.out.println("In Product constructor");
    }

    public int getId() { return id; }
    public String getName() { return name; }

    public void setId(int id) { this.id = id; }
    public void setName(String name) { this.name = name; }

    @Override
    public String toString() {
        return "Product{id=" + id + ", name='" + name + "'}";
    }
}
