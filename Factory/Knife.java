package Factory;

public class Knife {
    private String type;
    private double price;

    public Knife(String type, double price) {
        this.type = type;
        this.price = price;
    }

    public void sharpen() {
        System.out.println("Sharpening the " + type + " knife");
    }

    public void polish() {
        System.out.println("Polishing the " + type + " knife");
    }

    public void packageKnife() {
        System.out.println("Packaging the " + type + " knife");
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }
}
