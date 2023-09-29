package com.mycompany.theprincipleofjavainheritance;
/*Дочерний класс класса Furniture*/
class Bed extends Furniture{
/*Абстракция: Базовый класс Furniture абстрагирует общие характеристики мебели, такие как цена и материалы, а также предоставляет метод displayInfo(), 
который выводит информацию о мебели. Это помогает скрыть детали реализации и сосредоточиться на сущности мебели.*/    
    public int numberOfSeats;

    public Bed(int numberOfSeats, int price, String frameMaterial, String upholsteryMaterial) {
        super(price, frameMaterial, upholsteryMaterial);
        /*Обращаемся к полям и методам материнского класса.*/
        this.numberOfSeats = numberOfSeats;
    }
    
            public void Сapacity(){
            System.out.println("На этой кровати может спать " + numberOfSeats);
    }
            @Override
            public void Usage(){
        System.out.println("Лежат на кровати.");
        /*Полиморфизм: Метод Usage() в классе Bed переопределен. Это пример полиморфизма, где одно и то же имя метода используется для разных классов, 
        и метод выполняется в соответствии с конкретной реализацией класса. Это улучшает гибкость кода.*/
    }
    
}
