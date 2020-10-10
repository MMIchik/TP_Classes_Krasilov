package Hierarchy;

public class FixWorker extends Worker {

    private double fixSalary;

    public FixWorker(String name, int age, double fixSalary) {
        super(name, age);
        this.fixSalary = fixSalary;
    }

    public String info(){
        return super.info() + "Зарплата: " + fixSalary;
    }

    @Override
    public double calculateMonthlySalary() {
        return fixSalary;
    }
}
