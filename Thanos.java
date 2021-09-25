import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Thanos {

    public static void main(String[] args) {

        Hero hulk = new Hero("Hulk", 49);
        Hero blackWidow = new Hero("Black Widow", 34);
        Hero captainAmerica = new Hero("Captain America", 100);
        Hero thor = new Hero("Thor", 1501);
        Hero vision = new Hero("Vision", 3);
        Hero scarletWitch = new Hero("Scarlet Witch", 29);
        Hero doctorStrange = new Hero("Doctor Strange", 42);
        
        Flower lily = new Flower("Lily");
        Flower tulip = new Flower("Tulip");
        Flower begonia = new Flower("Begonia");
        Flower violet = new Flower("Violet");
        Flower rose = new Flower("Rose");

        // TODO 1 : Create a TreeMap where :
        Map<Hero, Flower> treeFlower = new TreeMap<>();
        // Hulk, Thor and Scarlet Witch have a Rose
        treeFlower.put(hulk, rose);
        treeFlower.put(thor, rose);
        treeFlower.put(scarletWitch, rose);
        // Vision has a Tulip
        treeFlower.put(vision, rose);
        // Captain America has a Lily
        treeFlower.put(captainAmerica, lily);
        // Doctor Strange and Black Widow have a Violet
        treeFlower.put(doctorStrange, violet);

        // TODO 2 : Print if `begonia` is contained in the TreeMap
        System.out.println(treeFlower.containsValue(begonia));

        // TODO 3 : For each hero, alphabetically, print the corresponding flower

        for (Hero hero : treeFlower.keySet()) {
            Flower flower = treeFlower.get(hero);
            System.out.println(hero.getName() + ": " + flower.getName());
        }
    }
}
