package Lesson11.ArrayList.Vandpolo;

class Spiller {
    private String navn;
    private int mål;

    public Spiller(String navn) {
        this.navn = navn;
        this.mål = 0;
    }

    public void scoreMål() {
        mål++;
    }

    public String getNavn() {
        return navn;
    }

    public int getMål() {
        return mål;
    }

    @Override
    public String toString() {
        return navn + " - Mål: " + mål;
    }
}
