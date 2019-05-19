public class Programmer extends Person {
    private int experience, min_salary, max_salary, salary_raise_pcnt;
    private String languages;

    public Programmer (String name,String city, String gender, String sexualOrientation, int age, int experience, int min_salary, int max_salary, int salary_raise_pcnt, String languages){
        super( name, city,  gender,  sexualOrientation, age);
        this.experience = experience;
        this.min_salary = min_salary;
        this.max_salary = max_salary;
        this.salary_raise_pcnt = salary_raise_pcnt;
        this.languages = languages;
    }
    public Programmer(){
        super();
        this.experience = 1;
        this.min_salary = 1500;
        this.max_salary = 3500;
        this.salary_raise_pcnt = 2;
        this.languages = "JS";
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getMin_salary() {
        return min_salary;
    }

    public void setMin_salary(int min_salary) {
        this.min_salary = min_salary;
    }

    public int getMax_salary() {
        return max_salary;
    }

    public void setMax_salary(int max_salary) {
        this.max_salary = max_salary;
    }

    public int getSalary_raise_pcnt() {
        return salary_raise_pcnt;
    }

    public void setSalary_raise_pcnt(int salary_raise_pcnt) {
        this.salary_raise_pcnt = salary_raise_pcnt;
    }

    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }

    public String getPersonInfo () {
        String s = super.getPersonInfo();
        s+= ", experience: " + experience + " years, " + "min/max salary: " + min_salary + "/" +
                max_salary + ", annual raise: " + salary_raise_pcnt + "%" + ", languages:" + languages;
        return s;
    }

}
