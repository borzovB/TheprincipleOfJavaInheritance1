package com.mycompany.theprincipleofjavainheritance;
/*В данном примере представлена польза наследования в ООП.*/
/*
В Java, наследование играет важную роль и имеет несколько польз:
1. Повторное использование кода: Наследование позволяет создавать новые классы на основе существующих, 
что позволяет избегать дублирования кода.
2. Упрощение поддержки кода: Если есть изменения или улучшения, которые нужно внести в общую функциональность, 
то можно внести их в базовый класс, и эти изменения автоматически применятся ко всему наследующему классу.
3. Создание иерархии классов: Наследование позволяет создавать иерархии классов, 
где каждый новый класс может добавлять уникальную функциональность к уже существующим. 
4. Полиморфизм: Наследование является основой для полиморфизма в ООП. 
Полиморфизм позволяет вам работать с объектами наследников базового класса, используя интерфейс базового класса. 
Это улучшает гибкость кода.
5. Абстракция: Наследование позволяет абстрагироваться от конкретных деталей реализации и сосредотачиваться на общей структуре и функциональности.
*/
public class ThePrincipleOfJavaInheritance {
/*Основное тело программы.*/
    public static void main(String[] args) {
        /*Вызываем основной(родительский) класс*/
        Furniture  furniture = new Furniture(2000, "дерева", "ткани");
        furniture.displayInfo();
        /*Вызываем метод из родительского класса.*/
        furniture.Usage();
        Sofa sofa = new Sofa(1900, "дерева", "ткани");
        /*Вызываем дочерний класс.*/
        sofa.displayInfo();
        /*Вызываем метод из дочернего класса.*/
        sofa.Usage();
        Bed bed = new Bed(4,4000, "сталь", "пух");
        bed.displayInfo();
        bed.Сapacity();
        Armchair armchair = new Armchair(19000, "дерева", "кожы", 81);
        armchair.displayInfo();
        armchair.Usage();
        Chair chair = new Chair(19000, "дерева", "кожы","красный", 90);
        /*Вызываем дочерний класс Chair, класса Armchair, при этом класс Armchair является дочерним классом класса Furniture.*/
        /*Это пример повторного использования кода.*/
        chair.Usage();
        chair.Back();
        armchair.ChairSize();
    }
}

