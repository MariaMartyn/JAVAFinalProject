package org.example;

import java.util.HashSet;
import java.util.Set;

/**
 * 1. Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
 *  2. Создать множество ноутбуков.
 *  3. Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки,
 *  отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:
 *  “Введите цифру, соответствующую необходимому критерию:
 *  1 - ОЗУ
 *  2 - Объем ЖД
 *  3 - Операционная система
 *  4 - Цвет …
 *   1. Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
 *   2. Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
 */
public class Main {
    public static void main(String[] args) {
        createNotebookSet();

    }
    private static void createNotebookSet() {
        Notebook notebook1 = new Notebook(2546, "Samsung", 15, "IntelCore i3", 8, "SSD 256");
        Notebook notebook2 = new Notebook(4789, "HP", 17, "IntelCore i5", 8, "SSD 512");
        Notebook notebook3 = new Notebook(9478, "Lenovo", 13, "IntelCore i7", 16, "SSD 1024");
        Notebook notebook4 = new Notebook(3214, "Apple", 13.3, "Apple M2", 8, "SSD 512");
        Notebook notebook5 = new Notebook(7599, "Asus", 14, "AMD Ryzen 5", 4, "HDD 1000");

        Set<Notebook> setNotebook = new HashSet<>();

        setNotebook.add(notebook1);
        setNotebook.add(notebook2);
        setNotebook.add(notebook3);
        setNotebook.add(notebook4);
        setNotebook.add(notebook5);

        SortedNotebook sortedArray = new SortedNotebook(setNotebook);
        sortedArray.start();
    }

}