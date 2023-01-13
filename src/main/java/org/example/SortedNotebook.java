package org.example;
import java.util.*;

public class SortedNotebook {

    private Set<Notebook> notebooks = new HashSet<>();
    private static Scanner scanner = new Scanner(System.in);

    public void printList(boolean all, String name, double value){
        for (Notebook notebook : notebooks){
            if (all == false) {
                if (name == "screenDiagonal"){
                    if (value <= Double.parseDouble(Objects.toString(notebook.getScreenDiagonal()))) {
                        System.out.println(notebook);
                    }
                }else if (name == "ram"){
                    if (value <= Double.parseDouble(Objects.toString(notebook.getRam()))) {
                        System.out.println(notebook);
                }else {
                        continue;
                }
            }
            }else {
                System.out.println(notebook);
            }
        }
    }

    public SortedNotebook(Set<Notebook> notebooks) {
        this.scanner = new Scanner(System.in);
        this.notebooks = notebooks;
    }

    public String getOperations(){

        String text = "Выберите желаемое действие: \n " +
                "1. Отобрать ноутбук по диагонали экрана \n " +
                "2. Отобрать ноутбук по объему оперативной памяти \n " +
                "3. Вывести весь ассортимент \n " +
                "4. Выход";

        System.out.println(text);

        String answer = scanner.next();

        return answer;
    }

    public void start(){

        boolean flag = true;
        while (flag){

            String operation = getOperations();
            if (operation.equals("4")){
                flag = false;
                scanner.close();
                continue;
            }else if(operation.equals("1")){
                boolean all = false;
                String text = "Введите минимально желаемое значение: ";
                String property = "screenDiagonal";
                System.out.println(text);
                double value = scanner.nextInt();
                printList(all, property, value);
            }else if (operation.equals("2")){
                boolean all = false;
                String text = "Введите минимально желаемое значение: ";
                String property = "ram";
                System.out.println(text);
                double value = scanner.nextInt();
                printList(all, property, value);
            }else if (operation.equals("3")){
                boolean all = true;
                printList(all, null, 0);
            }
        }
    }
}





