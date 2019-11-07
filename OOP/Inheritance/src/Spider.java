public class Spider extends Insect { // use the keyword EXTEND to inherit the methods and features of Insect class (parent class)

    public boolean isPoisonous; // a new attribute for the spider class

    public Spider(int age, boolean isPoisonous) { // constructor method to build spiders
        super(age, 8); // SUPER is a keyword which calls the insect constructor (so we must make an insect first)
            this.isPoisonous = isPoisonous; // add the isPoisonous attribute to the insect, so it is now a spider
    }

    public void says() { // now, we are overridding the insect says method
        System.out.println("HISSSS");
    }

}
