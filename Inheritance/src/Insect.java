public class Insect {

    // Initialize the attributes of each insect object

    int age;
    int numberOfLegs;

    // create constructor for insect objects

    public Insect(int age, int numberOfLegs) {
        this.age = age;
        this.numberOfLegs = numberOfLegs;
    }

    // create methods which allow objects to interact (public methods so they are accessible by all classes) <-- public is the access modifier

    public void says() { // no arguments, meaning no data must be passed when executing this method with an object
        System.out.println("...");
    }

    public void crawl() {
        System.out.println("This insect crawled");
    }

    // Now, this is a generic class which defines insects speaking and crawling. We can have subclasses of specific insects, where they can still do these methods, but as well as more of their own.
    // We use inheritance for this so those new classes have access to these methods, but can also use new ones.
}
