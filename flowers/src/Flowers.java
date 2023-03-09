import java.util.ArrayList;
import java.util.Scanner;

public class Flowers {
    public static void main(String[] args) {
        Flowers flowers = new Flowers();
        flowers.resolve();
    }

    public void resolve() {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();

        for (int index = 1; index <= T; index++) {
            int W = in.nextInt();
            int H = in.nextInt();
            int F = in.nextInt();
            int G = in.nextInt();

            char[][] field = new char[H][W];

            ArrayList<Fiore> fiori = new ArrayList<>();

            for(int i = 0; i < G; i++) {
                int x = in.nextInt();
                int y = in.nextInt();
                field[y][x] = 'G';
                fiori.add(new Fiore(y, x));
            }

            int better = Integer.MIN_VALUE;
            for(int i = 0; i < F; i++) {
                int best = Integer.MIN_VALUE;
                for(int j = 0; j < W; j++) {
                    int dist = fiori.get(i).dist(fiori.get(j));
                    if(dist >= best && field[fiori.get(i).getY()][fiori.get(i).getX()] == 'G') best = dist;
                }
                if(best >= better) better = best;
            }



            System.out.println("Case #" + index + ": " + better);
        }
    }
    public class Fiore{
        int x;
        int y;

        public Fiore(int y, int x) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public int dist(Fiore o){
            return Math.abs(this.x-o.x)+Math.abs(this.y-o.y);
        }
    }
}