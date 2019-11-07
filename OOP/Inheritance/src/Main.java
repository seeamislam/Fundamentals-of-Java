public class Main {
    public static void main(String[] args){ // main method

        Insect insect = new Insect (5, 6); // build an insect object
        Spider spider = new Spider(15, true); // build a spider object
        Cricket cricket = new Cricket(2, 1.25); // build a cricket object

        insect.crawl();
        insect.says();

        spider.crawl();
        spider.says();

        cricket.crawl(); // even though the cricket class doesn't list a crawl method, we can do this because it inherited methods from the parent class
        cricket.says();
        cricket.jump();

        if (spider instanceof Insect && spider instanceof Spider) // if spider is an instance of the parent class Insect AND spider is an instance of the spider class
            System.out.println("Spider is an insect and a spider");
    }
}
