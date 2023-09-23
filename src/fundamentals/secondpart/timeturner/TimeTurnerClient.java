package fundamentals.secondpart.timeturner;

import java.util.Locale;

import utils.ClearTerminal;

public class TimeTurnerClient {
    
    public static void main(String[] args) {
        ClearTerminal.run();
        Locale.setDefault(Locale.US);

        TimeTurner tt = new TimeTurner(5);

        System.out.println(tt);
        tt.advance();
        System.out.println(tt);
        tt.invertDirection();
        tt.advance();
        System.out.println(tt);
        tt.invertDirection();

        for (int i = 0; i < 6; i++){
            tt.advance();
            System.out.println(tt);
        }

        tt.invertDirection();

        for (int i = 0; i < 7; i++){
            tt.advance();
            System.out.println(tt);
        }
    }

}
