package com.mycompany.theprincipleofjavainheritance;
/*Материнский класс.*/
public class Furniture {
    int price;
    String frameMaterial;
    String upholsteryMaterial;
    /*Инициализация переменных.*/
    public Furniture(int price, String frameMaterial, String upholsteryMaterial) {
        this.price = price;
        this.frameMaterial = frameMaterial;
        this.upholsteryMaterial = upholsteryMaterial;
    }
    /*Конструктор.*/
    
     public void displayInfo() {
         /*Материнский метод.*/
        System.out.println("Этот каркас мебели сделан из " + frameMaterial + ", а её обивка сделана из " +upholsteryMaterial+ " и стоит " + price + " рублей.");
    }
     
    public void Usage(){
        System.out.println("Зависит от мебели.");
    }
    /*Метод, который в дочерних класса мы его будем переопределять.*/
}
 
