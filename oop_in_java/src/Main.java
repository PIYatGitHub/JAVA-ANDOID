import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) {
//CLASSES AND OBJECTS
//    Person peter = new Person("Peter", "Sofia", "Male", "Straight", 27);
//        System.out.println(peter.sexualOrientation);
//        peter.sexualOrientation = "Gay";
//        System.out.println(peter.sexualOrientation);
//
//        Person [] p_arr = new Person[5];
//        p_arr[0] = new Person("Gosho", "Plovdiv", "Male", "Gender", 22);
//        p_arr[1] = new Person("Ivan", "Trun", "Male", "Gay", 33);
//        p_arr[2] = new Person("Dragan", "Kyustenja", "Male", "Transvestite",666);
//        p_arr[3] = new Person("Dragan2", "Kyustenja2", "Male", "Transvestite");
//        p_arr[4] = new Person("Dragan3", "Kyustenja3", "Male", "Transvestite");
//        for (Person temp: p_arr) {
//            //   here you may do this: "Name: " + temp.name+ ", City: "+ temp.city + ", ...;       OR... use the method we created...
//            System.out.println(temp.getPersonInfo());
//        }
//    User pesho = new User(1, "pesho_sex_master_9000", "1523r#@#@T34uh$@u");
//        System.out.println(pesho.getUserInfo());
//
//        p_arr[0].whoIsOlder(p_arr[3]);


// ACCESS MODIFIERS
//        Firm hoganAndDots = new Firm("Hogan and Dots Legal Office", "Hogan Mogan", 55);
//        System.out.println(hoganAndDots.director.name);
//        System.out.println(hoganAndDots.director.isPensioner());

//STATIC FIELDS & METHODS
//Ex: Math.random() --> we did not create an object math, we just called its static method random().
//        Person [] p_arr = new Person[3];
//        p_arr[0] = new Person();
//        p_arr[1] = new Person();
//        p_arr[2] = new Person();
//
//        System.out.println("Created " + Person.getCount() + " new Person instances.");

// Exercise time:
//        System.out.println(MyMath.add(5,2));
//        System.out.println(MyMath.sub(5,2));
//        System.out.println(MyMath.mult(5,2));
//        System.out.println(MyMath.div(5,0));
//        System.out.println("The counter is equal to: " + MyMath.getCount());
//
//        System.out.println(MyMath.add(15,12));
//        System.out.println(MyMath.sub(52,21));
//        System.out.println(MyMath.mult(56,82));
//        System.out.println("The counter is equal to: " + MyMath.getCount());

// EXTENDS
//        Programmer pesho = new Programmer();
//
//        System.out.println("pesho's name is:" + pesho.getName());
//        pesho.setName("Petar Ivanov Yonkov");
//        System.out.println("pesho's name is:" + pesho.getName());
//        System.out.println("pesho's languages are:" + pesho.getLanguages());
//        System.out.println(pesho.getPersonInfo());
//
//        Worker gosho = new Worker();
//        gosho.setName("Gosho Ang");
//        gosho.setCity("Shumen");
//        gosho.setAge(52);
//        gosho.setSalary(20000);
//        System.out.println(gosho.getPersonInfo());

//        // Exercise time:
//        UserSocial peshoProfile = new UserSocial(UserSocial.generateSeqID(),"pesho", "16548weu7327WET$@we", "Peter IV. Yonkov", 27);
//        System.out.println("pesho's info reads: " + peshoProfile.getSocialInfo());
//        peshoProfile.printUser();

//POLYMORPHISM
//        Person ivan = new Programmer();
//        System.out.println("ivan" + ivan.getPersonInfo());

// ABSTRACT CLASSES & INTERFACES

//        Point p = new Point(10, 25);
//        p.draw();
//        Circle c = new Circle(5, 10, 25);
//        c.draw();
//        Shape[] shapes = new Shape[3];
//        shapes[0] = new Circle(5, 7, 10);
//        shapes[1] = new Circle(7, 8, 15);
//        shapes[2] = new Point(15, 17);
//        for (Shape s : shapes) s.draw();
//        shapes[0].info();
//        shapes[2].info();

//ANONYMOUS CLASSES
//        Shape triangle = new Shape(10, 20) {
//            @Override
//            public void draw() {
//                System.out.println("Drawing a point with coordinates (" + x + ", " + y + ")");
//            }
//        };
//        triangle.draw();

// GENERIC CLASSES
//        Test <Integer,  String> t = new Test <> (123, "Some string goes here...");
//        t.print();
//        t.setData1(234);
//        t.print();


// TO STRING + CLONE methods
//    Point p = new Point(19, 23);
//    System.out.println("New point: " + p); // works fine --> calls to string implicitly
//
//    Point pNew = p;
//    System.out.println("Even newer point:" + pNew);
//    p.setX(33);
//    System.out.println("Even newer point:" + pNew); // #FAILARMY why? because of memory references! p points to address 123, pNew points to the same address, so if you change either you change all references.
//    // clone to the rescue
//    Point pClone = p.clone();
//    System.out.println("The Clone: " + pClone);
//    p.setX(1);
//    p.setY(2);
//    System.out.println("New point: " + p); // returns 1, 2, so the completely new value is applied with the get and set methods...
////    System.out.println("The Clone: " + pClone); // and this guy keeps 33, 23 so success - it was not modified after the change.
//        UserSocial pesho = new UserSocial(UserSocial.generateSeqID(),"pesho", "16548weu7327WET$@we", "Peter IV. Yonkov", 27);
//        System.out.println("Introducing pesho: " + pesho);
//        UserSocial peshoCopyCat = pesho.clone();
//        System.out.println("Someone copies pesho... " + peshoCopyCat); // --> works as expected

        // LAMBDA EXPRESSIONS
//        String [] arr = {"Hello...", "Is there anybody", "in there", "?"};
//        Arrays.sort(arr, (s1,s2) -> Integer.compare(s1.length(), s2.length()));
//        for (String s : arr) System.out.println(s);
//        System.out.println("<=======================>");
//        List <String> dict = Arrays.asList("A", "AB", "AC", "AD");
////        dict.forEach((t) -> System.out.println(t));
//        dict.forEach(System.out::println);
//        System.out.println("<=======================>");
//        Integer [] numbers = {1,2,241,5634,12,67,4574,5956,44,753};
//        Arrays.sort(numbers, Integer::compareTo); // works bomb af for double as well... super short!
//
//        Double [] doubles = {1.35,2.654,241.33,5634.0,12.0,67.55,4574.33,5956.11,44.22,753.2};
//        Arrays.sort(doubles, Double::compareTo);
//        for (double i:doubles) System.out.println(i);

        // EXCEPTIONS
//        String in_1 = JOptionPane.showInputDialog(null, "Please input a positive integer a.");
//        String in_2 = JOptionPane.showInputDialog(null, "Please input a positive integer b.");
//        try {
//            int a = Integer.parseInt(in_1);
//            int b = Integer.parseInt(in_2);
//            if (a <= 0 || b <= 0) throw new Exception();
//            JOptionPane.showMessageDialog(null, "Numbers add up to: " + (a + b));
//        } catch (NumberFormatException e) {
//            JOptionPane.showMessageDialog(null, "Sorry we detected jibberish along your way...");
//            System.out.println(e);
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, "One or two of the numbers were either 0 or negative!");
//            System.out.println(e);
//        }
//        finally {
//            System.out.println("Terminating program!");
//        }

        // CUSTOM USER EXCEPTIONS
//        String login = JOptionPane.showInputDialog(null, "Please type in your login.");
//        User pesho = new User(){
//            @Override
//            public String toString() {
//                return this.getLogin() + " " + this.getId() + " " + this.getPassword() ;
//            }
//        };
//        try {
//            pesho.setLogin(login);
//        }catch (UserException e){
//            System.out.println(e);
//            System.out.println(pesho.toString());
//        }finally {
//            System.out.println(pesho.toString());
//        }

        //  STUDY OF THE STRING CLASS
//        String in_1 = JOptionPane.showInputDialog(null, "Please tell us your name.");
//        try {
//           if (in_1.equals("")) throw new Exception("No name provided");
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//            in_1 = JOptionPane.showInputDialog(null, "Let's try again, shall we?");
//        }finally {
//            System.out.println("Lower case: " + in_1.toLowerCase() + " Upper case: " + in_1.toUpperCase());
//            if(in_1.length()>6) System.out.println("Substring from 2 nd to 5th char: " + in_1.substring(1,6));
//            System.out.println("Hello there, " + in_1);
//            System.out.println("END! ");
//        }

        //MATH CLASS
//        System.out.println(Math.hypot(5.3,7.1));

        // HASH MAP CLASS
//        HashMap <String, String> data = new HashMap <> ();
//        data.put("name", "Michael");
//        data.put("age", "33");
//        data.put("stage", "33");
//        data.put("gender", "NO");
//        data.put("sex", "Occasional");
//
//        for (Map.Entry<String, String> d: data.entrySet()) System.out.println(d);
//        data.remove("sex");
//        System.out.println("<========== EASIER WAY? =============>");
//        data.forEach((key,value) -> System.out.println(key + " = " + value));
//        System.out.println("<==========SPLITTER=============>");
//        data.values().removeAll(Collections.singleton("33"));
//        data.forEach((key,value) -> System.out.println(key + " = " + value));
//        data.clear();
        // Exercise time
//        HashMap <String, Integer> humans = new HashMap <> ();
//        humans.put("Joe", 33);
//        humans.put("Pesho", 27);
//        humans.put("Gosho", 18);
//        humans.put("Ivan", 44);
//
//        humans.forEach((key,value) -> System.out.println(key + " = " + value));
//        System.out.println("<==========SPLITTER=============>");
//        humans.put("Pesho", 31);
//        humans.replace("Pesho", humans.get("Pesho") + 4);
//        humans.forEach((key,value) -> System.out.println(key + " = " + value));

        // ARRAY LIST CLASS

//        ArrayList<Integer> numbers = new ArrayList<>();
//        for(int i=0; i<10; i+=1) {
//            int n = (int) (Math.random()*11);
//            numbers.add(n);
//        }
//        numbers.forEach((value) -> System.out.print(value + " "));
//        numbers.sort(new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o1-o2;
//            }
//        });
//        System.out.println("New line - sorted:");
//        numbers.forEach((value) -> System.out.print(value + " "));
//
//        ArrayList<String> logins = new ArrayList<>();
//        logins.add("Pesho@abv.bg");
//        logins.add("Gods@abv.bg");
//        logins.add("Gugi@abv.bg");
//        logins.add("Puhi@abv.bg");
//        logins.forEach((value) -> System.out.print(value + " "));
//        logins.set(2, "eqjwieugwuet8wetowltuwg");
//        System.out.println();
//        logins.forEach((value) -> System.out.print(value + " "));

        // DATE TIME CLASS
//        Date date = new Date();
//        System.out.println(date);
//        Calendar cal = new GregorianCalendar();
//        System.out.println(cal.getTimeInMillis());
//        String newDate = "12.12.2019 14:14:14";
//        SimpleDateFormat formatted = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
//        try {
//            date = formatted.parse(newDate);
//        } catch (Exception e){
//            System.out.println(e.getMessage());
//        }
//        cal.setTime(date);
//        System.out.println(cal.getTime());
    }
}
