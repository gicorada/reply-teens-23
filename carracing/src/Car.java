/**
 * Car class
 */
public class Car {
    int R=50;
    int Cid = 0;// car identifier
    int Cs = 0;// car's normal speed
    int Ct = 0;// car's turbo speed
    int Cc = 0;// boost cool downtime
    int Cd = 0;// turboboost duration time

    public Car(int Cid, int Cs, int Ct, int Cc, int Cd) {
        this.Cid = Cid;
        this.Cs = Cs;
        this.Ct = Ct;
        this.Cc = Cc;
        this.Cd = Cd;
    }

    public int getR() {
        return R;
    }

    public int getCid() {
        return Cid;
    }

    public int getCs() {
        return Cs;
    }

    public int getCt() {
        return Ct;
    }

    public int getCc() {
        return Cc;
    }

    public int getCd() {
        return Cd;
    }
}