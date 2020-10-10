package Hierarchy;

public class HourWorker extends Worker{

    private double costOfAnHour; //стоимость часа
    private int numberOfHours;//кол-во часов

    public HourWorker(String name, int age, double costOfAnHour, int numberOfHours) {
        super(name, age);
        this.costOfAnHour = costOfAnHour;
        this.numberOfHours = numberOfHours;
    }

    public String info(){
        return super.info() + "часов: " + numberOfHours
                + " за час: " + costOfAnHour;
    }

    @Override
    public double calculateMonthlySalary() {
        return costOfAnHour * numberOfHours;
    }
}
