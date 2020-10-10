package Main;

import Hierarchy.*;
import Task.Menu;
import Input.*;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Worker> workers = new ArrayList<Worker>(); //создаем список для хранения всех людей

        //добавляем 2 объекта для примера
        workers.add(new FixWorker("Красилов Л. В.", 19, 20000));
        workers.add(new HourWorker("Бухтаев В.", 20, 100, 2 ));

        boolean flag = false; // переменная для цикла. Если = true, то выход из программы
        while (!flag) {
            System.out.println("\nВыберите задание: \n[1] - добавить\n" +
                    "[2] - изменить\n[3] - просмотр\n" +
                    "[4] - запрос\n[5] - выход");

            Menu menu = new Menu(workers);

            switch (Input.inputInteger("")) {
                case 1://добавить
                    menu.add();
                    System.out.println("работник добавлен");
                    break;
                case 2://изменить
                    menu.change();
                    System.out.println("работник изменен");
                    break;
                case 3://просмотр
                    System.out.println("Все работники:");
                    menu.look();
                    break;
                case 4://запрос
                    System.out.println("Месячная зарплата = " + menu.executeRequest());
                    break;
                case 5://выxод
                    System.out.println("[Выход]");
                    flag = true;
                    break;
                default:
                    System.out.println("Ошибка. Повторите ввод.");
                    break;
            }

        }

    }
}
