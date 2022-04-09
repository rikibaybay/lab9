public class Sofar extends Furniture {
    private double Sofav;

    Sofar() {
        super();
        Sofav = 0;
    }

    Sofar(String sofaname, double SofaValue) {
        super(sofaname);
        Sofav = SofaValue;
    }

    public void AreaSet(int SofaValue) {
        Sofav = SofaValue;
    }

    public double AreaValue() {
        return Sofav;
    }

    @Override
    public String toString() {
        return "Sofa{" +
                "Sofa_v=" + Sofav +
                "Type=" + getType() +
                '}';
    }
}
