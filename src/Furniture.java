public class Furniture {
    private String fasType;

    public Furniture() {
        fasType = "";
    }
    public Furniture(String Type) {
        fasType = Type;
    }
    public void SetType(String temp) {
        fasType = temp;
    }
    public String getType() {
        return fasType;
    }
}
