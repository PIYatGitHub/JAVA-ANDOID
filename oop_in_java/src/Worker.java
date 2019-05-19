public class Worker extends Person{


    private int salary = 0;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getPersonInfo () {
        String s = super.getPersonInfo();
        s+= ", salary: " + salary + ".";
        return s;
    }
}

