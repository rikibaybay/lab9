import java.util.ArrayList;

public class Room {
    private ArrayList<Furniture> furnitures = new ArrayList<Furniture>();

    public void addf(Furniture m) {
        furnitures.add(m);
    }

    public Room() {

    }

    public int countSofa() {
        int count = 0;
        for (Furniture a : furnitures) {
            if (a instanceof Sofar)
                count++;
        }
        return count;
    }

    public int countCloset() {
        int count = 0;
        for (Furniture a : furnitures) {
            if (a instanceof Closet)
                count++;
        }
        return count;
    }

    public Room(ArrayList<Furniture> n) {
        furnitures = n;
    }

    public void printRoom() {
        System.out.println("В комнате= ");
        for (Furniture a : furnitures) {
            System.out.println("\t" + a.toString());
        }
    }
}
