package com.mycompany.theprincipleofjavainheritance;
// Класс Chair (Стул), наследует от Armchair.
class Chair extends Armchair{
    private String color;
    // Цвет спинки стула.
    // Конструктор класса Chair.
    public Chair(int price, String frameMaterial, String upholsteryMaterial, String color, int height) {
        super(price, frameMaterial, upholsteryMaterial, height);
        /*Обращаемся к полям и методам материнского класса.*/
        this.color = color;
    }
    // Переопределенный метод Back для стула
    @Override
    public void Back(){
        System.out.println("Спинка средняя и цвет спинки " + color);
    }
}
