package com.mycompany.theprincipleofjavainheritance;
/*Дочерний класс класса Furniture*/
/*Пример повторного использования кода.*/
/*Применение создания иерархии класса.*/
class  Sofa extends Furniture{
    
    public Sofa(int price, String frameMaterial, String upholsteryMaterial) {
        super(price, frameMaterial, upholsteryMaterial);
        /*Обращаемся к полям и методам материнского класса.*/
    }
    
    @Override
    public void Usage(){
        System.out.println("На диване сидят.");
        /*Пример упрощения поддержки кода.*/
        /*Мы добавляем новый метод.*/
    }
}
