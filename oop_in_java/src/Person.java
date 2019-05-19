import org.jetbrains.annotations.NotNull;

public class Person {
    private String name;
    private String city;
    private String gender;
    private String sexualOrientation;
    private int age;
    private static int count = 0;

    public Person(String name,String city, String gender, String sexualOrientation, int age){
        this.name = name;
        this.city = city;
        this.gender = gender;
        this.sexualOrientation = sexualOrientation;
        this.age = age;
        count +=1;
    }
    public Person(){
        this("PIY", "Sofia", "Male", "Straight", 25);
        // so you can have as many constructors as you like/need.
        // Here for instance we hard code the age at 18, so one may call in new Person with 4 args and generate an 18 y.o. person.
    }
    public String getPersonInfo () {
        return "Name: " + this.name+ ", City: "+ this.city + ", Gender: " + this.gender + ", Sexual Orientation: " + this.sexualOrientation + ", Age: " + this.age;
    }
    //getters and setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }

    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSexualOrientation() {
        return sexualOrientation;
    }
    public void setSexualOrientation(String sexualOrientation) {
        this.sexualOrientation = sexualOrientation;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public void whoIsOlder(@NotNull Person p) {
        if (this.age > p.age)       System.out.println(this.name + " is older than "        + p.name + ".");
        else if (this.age == p.age) System.out.println(this.name + " is the same age as "   + p.name + ".");
        else                        System.out.println(this.name + " is younger than "      + p.name + ".");
    }

    public static int getCount (){
        return count;
    }
}
