/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author kien pham
 */
public class Order {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    private String product;
    private String nameCus;
    private int phone;
    private String address;
    private String email;
    private String daybuy;

    public String getDaybuy() {
        return daybuy;
    }

    public void setDaybuy(String daybuy) {
        this.daybuy = daybuy;
    }
    private float toalPrice;

    public float getToalPrice() {
        return toalPrice;
    }

    public void setToalPrice(float toalPrice) {
        this.toalPrice = toalPrice;
    }

   

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getNameCus() {
        return nameCus;
    }

    public void setNameCus(String nameCus) {
        this.nameCus = nameCus;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

 

    
}
