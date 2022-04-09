public class Closet extends Furniture {
    private double Closet_v;

    Closet() {
        super();
        Closet_v = 0;
    }

    Closet(String closetname, double ClosetValue) {
        super(closetname);
        Closet_v = ClosetValue;
    }

    public void ClosetSet(int ClosetValue) {
        Closet_v = ClosetValue;
    }

    public double ClosetValue() {
        return Closet_v;
    }

    @Override
    public String toString() {
        return "Closet{" +
                "Closet_v=" + Closet_v +
                "Type=" + getType() +
                '}';
    }
}
