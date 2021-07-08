package childs;

import parent.Employee;

public class Specialist extends Employee {
    private int levels;

    public Specialist(String fio, int age, int salary, int levels) {
        super(fio, age, salary);
        this.levels = levels;
    }

    public int getLevels() {
        return levels;
    }

    public void setLevels(int levels) {
        this.levels = levels;
    }

    @Override
    public void print() {
        System.out.println(levels);
    }

    public void goToVacation() {
        System.out.println("I am going to the sea");
    }

    public void workWithClients(){
        System.out.println("I am working with our clients!");
    }
}
