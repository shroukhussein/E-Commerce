package com.example.shopping;

public class products {

    private int pro_id, pro_quantity, catId,proimage;
    private String proName;
    private double price;
    public products(int pro_quantity, int catId, String proName,double price,int proimage) {

        this.pro_quantity = pro_quantity;
        this.catId = catId;
        this.proName = proName;
        this.price = price;
        this.proimage=proimage;
    }

    public products() {
    }

    public int getProimage() {
        return proimage;
    }

    public void setProimage(int proimage) {
        this.proimage = proimage;
    }

    public int getPro_id() {
        return pro_id;
    }

    public void setPro_id(int pro_id) {
        this.pro_id = pro_id;
    }

    public int getPro_quantity() {
        return pro_quantity;
    }

    public void setPro_quantity(int pro_quantity) {
        this.pro_quantity = pro_quantity;
    }

    public int getCatId() {
        return catId;
    }

    public void setCatId(int catId) {
        this.catId = catId;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}