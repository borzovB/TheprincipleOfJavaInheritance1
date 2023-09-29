package com.mycompany.theprincipleofjavainheritance;
/*Класс Armchair (Кресло), наследует от Furniture*/
class Armchair extends Furniture{
    private int height;
    public Armchair(int price, String frameMaterial, String upholsteryMaterial,int height) {
        super(price, frameMaterial, upholsteryMaterial);
        /*Обращаемся к полям и методам материнского класса.*/
        this.height=height;
        // Высота кресла.
        //Добавление нового параметра.
    }
     // Виртуальный метод Usage (Использование)
    @Override
    public void Usage(){
        System.out.println("На кресле сидят.");
    }
    // Класс Armchair (Кресло), наследует от Furniture
    public void Back(){
        System.out.println("Спинка высокая.");
    }
    // Конструктор класса Armchair, который также инициализирует поле height
    public void ChairSize(){
        String chairSize = height>=80 ? " большой " : height==70? " средний ":"маленький";
        System.out.printf("Высота стула равна %d размер стула %s", height, chairSize);
    }
}
