public class WaterBottle {

    private int volume;

    public WaterBottle(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void drink() {
        int newVolume = getVolume() - 10;
        setVolume(newVolume);
        getVolume();
    }

    public void empty() {
        setVolume(0);
        getVolume();
    }

    public void fill() {
        setVolume(100);
        getVolume();
    }


}
