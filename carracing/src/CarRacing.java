import java.util.Scanner;

public class CarRacing {
    public static void main(String[] args) {
        CarRacing car = new CarRacing();
        car.resolve();
    }

    public void resolve() {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();

        for (int index = 1; index <= T; index++) {
            int R = in.nextInt();
            int C = in.nextInt();
            int best = -1;
            int bestTime = Integer.MAX_VALUE;
            for(int i=0; i<C; i++){
                Car car = new Car(in.nextInt(), in.nextInt(), in.nextInt(), in.nextInt(), in.nextInt());
                int s = 0;
                int pos = 0;
                boolean turbo = true;
                int d = car.getCd();
                int c = car.getCc();
                while (pos<R) {
                    s++;
                    if(turbo){
                        pos+=car.getCt();
                        d--;
                        if(d==0){
                            turbo=false;
                            d=car.getCd();
                        }
                    }
                    else{
                        pos+=car.getCs();
                        c--;
                        if(c==0){
                            turbo=true;
                            c=car.getCc();
                        }
                    }
                }
                if(s<bestTime) {
                    bestTime=s;
                    best=car.getCid();
                }

            }

            System.out.println("Case #" + index + ": "+ best);
        }
    }
}