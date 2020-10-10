package Task;

import Hierarchy.*;

import Input.*;

import java.util.ArrayList;

public class Menu {

    private ArrayList<Worker> workers;//лист со всеми объектами

    public Menu(ArrayList<Worker> workers) //конструктор
    {
        this.workers = workers;
    }

    public void add(){ //Добавление объекта
        Worker worker = fill();
        workers.add(worker);//добавляем в список
    }

    public void change(){
        int id = find();
        Worker workerForChanging = fill();
        workers.set(id, workerForChanging);
    }

    public Worker fill(){
        String name = Input.inputString("ФИО: ");
        int age = Input.inputInteger("возраст: ");

        int type = Input.inputInteger("нажмите [1], если это работник с почасовой оплатой, [2] - с фиксированной оплатой: ");
        if (type == 1){
            double costOfAnHour = Input.inputDouble("стоимость часа: ");; //стоимость часа
            int numberOfHours = Input.inputInteger("кол-во часов: ");
            return new HourWorker(name, age, costOfAnHour, numberOfHours);

        } else {
            double money = Input.inputDouble("зп: ");
            return new FixWorker(name, age, money);
        }
    }

    public int find(){
        int id = Input.inputInteger("Введите номер человека для поиска: ");

        if (id > workers.size())
            id = Input.inputInteger("Такого номера нет.");

        System.out.println("Искомый человек: " + workers.get(id-1).info());

        return id-1;
    }

    public void look(){
        int j = 0;
        for (Worker worker:
                workers) {
            j++;
            System.out.println(j + ") "+ worker.info() + " ");
        }
    }

    public Worker findObject(){
        int id = find();
        return workers.get(id);
    }

    public double executeRequest(){
        Request request = findObject();
        return request.calculateMonthlySalary();
    }



}
