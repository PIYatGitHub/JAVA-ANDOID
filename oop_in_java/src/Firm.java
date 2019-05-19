public class Firm {
    public String firmName;
    public Director director;

    public Firm(String firmName, String nameDirector, int age){
        this.firmName = firmName;
        this.director = new Director(nameDirector, age);
    }
    class Director {
        public String name;
        public int age;
        Director(String name, int age){
          this.name = name;
          this.age = age;
            System.out.println("We created a new director @ "+ firmName);
        }
        public boolean isPensioner(){
            return age >= 60;
        }
    }

}
