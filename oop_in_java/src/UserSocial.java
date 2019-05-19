public class UserSocial extends User implements Cloneable {
    private static int counter = 0;
    private String name;
    private int age;
    UserSocial (int id, String login, String password, String name, int age){
        super(id, login, password);
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public static int generateSeqID () {
        return counter+=1;
    }
    public String getSocialInfo(){
        return this.getId() + "; " + this.name + "; " + this.age + "; " + this.getLogin() + "; " + this.getPassword() + "...";
    }

    @Override
    public void printUser() {
        System.out.println("I AM HERE!!!! HEY YOU! ");
    }

    @Override
    public String toString(){
        return this.getId() + "; " + this.name + "; " + this.age + "; " + this.getLogin() + "; " + this.getPassword() + "...";
    }
    //USE THIS ^^^^^^^ all the others do the same thing...
    @Override
    public UserSocial clone (){
        return new UserSocial(generateSeqID(), this.getLogin(), this.getPassword(), this.name, this.getAge());
    }
}
