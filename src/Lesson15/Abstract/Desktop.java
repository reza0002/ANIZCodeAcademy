package Lesson15.Abstract;


// Subclass: Desktop
class Desktop extends Computer {
    private boolean hasRGB;

    public Desktop(String brand, int ram, boolean hasRGB) {
        super(brand, ram);
        this.hasRGB = hasRGB;
    }

    @Override
    public void bootUp() {
        System.out.println(getBrand() + " Desktop is booting... RGB: " + (hasRGB ? "ON" : "OFF"));
    }

    @Override
    public String toString() {
        return super.toString() + ", Type: Desktop, RGB: " + (hasRGB ? "Yes" : "No");
    }
}
