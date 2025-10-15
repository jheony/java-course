package chapter2.pracRamen;

public class Main {
    public static void main(String[] args) {
        Ramen jjajjaloni = new BlackRamen();
        Ramen samyang = new Samyang();

        jjajjaloni.noodle();
        jjajjaloni.source();

        samyang.noodle();
        samyang.source();

        StirFried newJjajjaloni = (StirFried) jjajjaloni;
        Soup newSamyang = (Soup) samyang;

        newJjajjaloni.skill();
        newSamyang.water();


    }
}
