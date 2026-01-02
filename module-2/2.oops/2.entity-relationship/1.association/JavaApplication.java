class JavaApplication {

    public static void execution() {
        Engine engine = new Engine(1200, 4, 85);
        MediaPlayer m = new MediaPlayer("Boat", "India", 5000000);

        Car c = new Car("Hyundai", "White", "India", 1000000);

        c.displayCarInfo();
        c.getEngine().displayEngineInfo();

        c.setMediaPlayer(m);
        c.getMediaPlayer().displayMediaPlayerInfo();
    }
}
