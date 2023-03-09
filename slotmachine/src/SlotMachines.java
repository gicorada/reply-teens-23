import java.util.ArrayList;
import java.util.Scanner;

public class SlotMachines {
    public static void main(String[] args) {
        SlotMachines slot = new SlotMachines();
        slot.resolve();
    }

    public void resolve() {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();

        for (int index = 1; index <= T; index++) {
            int N = in.nextInt();
            int Bf = in.nextInt();
            int Bi = in.nextInt();
            int times = 0;

            ArrayList<Slot> slots = new ArrayList<>(N);

            for(int i=0; i<N; i++){
                slots.add(new Slot(in.nextInt(), in.nextInt()));
            }

            while (Bi < Bf) {
                int bestEarn = Integer.MIN_VALUE;
                Slot best = new Slot(0, 0);
                for (int i = 0; i < N; i++) {
                    if(slots.get(i).getCi() <= Bi && slots.get(i).getEarn() > bestEarn) {
                        bestEarn = slots.get(i).getEarn();
                        best = slots.get(i);
                    }
                }

                Bi -= best.getCi();
                Bi += best.getRi();
                times++;
            }

            System.out.println("Case #" + index + ": " + times);
        }
    }
}