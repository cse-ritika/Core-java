public class MediaPlayer {

    private String brand;
    private String make;
    private double price;

    public MediaPlayer(String brand, String make, double price) {
        this.brand = brand;
        this.make = make;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public String getMake() {
        return make;
    }

    public double getPrice() {
        return price;
    }

    public void displayMediaPlayerInfo() {
        System.out.println("MediaPlayer Details");
        System.out.println("---------------------");
        System.out.println("Brand : " + brand);
        System.out.println("Make  : " + make);
        System.out.println("Price : " + price);
        System.out.println();
    }
}
