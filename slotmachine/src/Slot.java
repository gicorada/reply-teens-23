public class Slot {
    int Ci;
    int Ri;
    int earn;

    public Slot(int ci, int ri) {
        Ci = ci;
        Ri = ri;
        earn = Ri - Ci;
    }

    public int getCi() {
        return Ci;
    }

    public int getRi() {
        return Ri;
    }

    public int getEarn() {
        return earn;
    }
}
