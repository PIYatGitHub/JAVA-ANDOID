import mediator.Mediator;
import mediator.Engineer;
import mediator.Marketing;
import mediator.Bookie;
import mediator.Person;
import observer.Author;
import observer.EmailSubscriber;
import observer.SmsSubscriber;
import strategy.Mouse;
import strategy.Smart;
import strategy.Stupid;

public class Main {
    public static void main(String[] args) {
        // SINGLETON
        // guarantees that a class has only one instance
        // ex: connection to a DB - one instance, al done
//        prot_singleton_stuff.Singleton obj1 = prot_singleton_stuff.Singleton.getSingleton();
//        System.out.println(obj1.getX());
        /*
        *
        * SOME CODE LATER....
        *
        * */
//        prot_singleton_stuff.Singleton obj2 = prot_singleton_stuff.Singleton.getSingleton();
//        obj1.setX(26);
//        System.out.println(obj2.getX());
        // so you set x in obj 1, but you get the value @ obj2???
//        System.out.println(obj1 + "---" + obj2);
        // prot_singleton_stuff.Singleton@506e1b77---prot_singleton_stuff.Singleton@506e1b77
        // There is the "bug" ^^ same reference...


        // Next: PROTOTYPE
        // when you want a full copy of an object
//        prot_singleton_stuff.Prototype p1 = new prot_singleton_stuff.Prototype(5,10);
//        System.out.println(p1.toString());
//
//        prot_singleton_stuff.Prototype p2 = p1.clone();
//        System.out.println(p2.toString());
//        p2.setX(23);
//        System.out.println("----------------/-------------");
//        System.out.println(p1.toString());
//        System.out.println(p2.toString());

        // Next: BUILDER - makes little to no sense w/o public properties
        // ultimately you split getters and setters
        // you may also do an Architect class which generates default objs
        // all could be done with constructors - way simpler and 100% bulletproof

        //Next: structure pattern # 1 - Adapter
        // ex: we have a lib that runs on XML, but another lib returns JSON,
        // so we need to adapt that data --> we use adapter...
        // another example: transfer EU power plug to UK power plug = adapter

//        prot_singleton_stuff.CurrencyAdapter adapter = new prot_singleton_stuff.CurrencyAdapter(new prot_singleton_stuff.BankAccount());
//        System.out.println("You have " + adapter.getSumUSD() + " in USD, based on an exchange ratio " + adapter.RATIO +" RU/USD.");

        // Next Bridge.Bridge
        // reduces complete heirarchy pizdec and splits into pretty simple two way hierarchy
//        boolean isWindows = true; //supose it is linux
//        boolean isLinux = false; //supose it is linux
//        Bridge.Bridge b = null;
//        if(isWindows) b = new Bridge.Windows();
//        else if(isLinux) b=new Bridge.Linux();
//
//        b.startWiFi();    // done for Bridge.Windows/Bridge.Linux/MacOs... whatever in 1 -2 lines ;)
//        b.startBrowser();

        // Next pattern: FACADE
        // ideal to interact with libraries --> ex you build a house and you have the sales rep
        // he is responsible for all, you only communicate with him.

//        double roubles = 50000.26;
//        double usd = Facade.rubToUSD(roubles);// basically 1 line... instead of 7... and what if they are 70 or 700 even better
//        System.out.println("So in  usd...: " + usd);

        // Next Mediator
        // reusable of forms and elements
//        Mediator mediator = new Mediator();
//        Person engineer = new Engineer(mediator);
//        Person market = new Marketing(mediator);
//        Person bookie = new Bookie(mediator);
//        mediator.setEng(engineer);
//        mediator.setMarket(market);
//        mediator.setBookie(bookie);
//
//        engineer.send("I am ready with the new design...");
//        bookie.send("Great job. all done!");

        // Next: Observer
//
//        Author author = new Author();
//        author.subscribe(new EmailSubscriber("piy@gmail.com"));
//        author.subscribe(new EmailSubscriber("bot@gmail.com"));
//        EmailSubscriber pesho = new EmailSubscriber("jogger@gmail.com");
//        author.subscribe(pesho);
//        author.subscribe(new SmsSubscriber("+359 2 943 43 99"));
//        author.subscribe(new SmsSubscriber("+359 893 431 262"));
//        author.posts("News on our website. Go check them out!");
//        author.unsubscribe(pesho);
//        System.out.println("--------------------");
//        author.posts("Check ot the new Marylin Manson song on our channel!");

        // Final pattern: STRATEGY
        // distinct between paths to achieve any given goal
        boolean is_genius = Math.random()*100 >35; // if num is greater than 35 then true, else false
        Mouse mouse = new Mouse();
        if(is_genius) mouse.setStrategy(new Smart());
        else mouse.setStrategy(new Stupid());
        mouse.execute();
    }
}
