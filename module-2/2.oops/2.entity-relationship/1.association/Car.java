public class Car {

    private String brand;
    private String color;
    private String make;
    private double price;

    // HAS-A relationship
    private Engine engine;
    private MediaPlayer mediaPlayer;

    public Car(String brand, String color, String make, double price) {
        this.brand = brand;
        this.color = color;
        this.make = make;
        this.price = price;
        this.engine = engine;
        // this.mediaPlayer = null;
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

    public String getColor() {
        return color;
    }

    public Engine getEngine() {
        return engine;
    }

    public MediaPlayer getMediaPlayer() {
        return mediaPlayer;
    }

    public void setMediaPlayer(MediaPlayer mediaPlayer) {
        this.mediaPlayer = mediaPlayer;
    }

    public void displayCarInfo() {
        System.out.println("Car Details");
        System.out.println("-------------");
        System.out.println("Brand  : " + brand);
        System.out.println("Make   : " + make);
        System.out.println("Color  : " + color);
        System.out.println("Price  : " + price);
        System.out.println();
    }
}
