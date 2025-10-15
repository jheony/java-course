package chapter2.pracRamen;

public class Main {
    public static void main(String[] args) {
        Soup shin = new Shin();
        Soup samyang = new Samyang();

        shin.noodle();
        shin.source();

        samyang.noodle();
        samyang.source();

        if (shin instanceof Shin newShin) {
            newShin.spicy();

        } else {
            System.out.println("이건 신라면이 아니야 !!!!!!");
        }

        Samyang newSamyang = (Samyang) samyang;
        newSamyang.water();
    }
}
