package fundamentals.fistpart.date;

import java.util.Locale;

import utils.ClearTerminal;

public class DateClient {

   public static void main(String[] args) {
        ClearTerminal.run();
        Locale.setDefault(Locale.US);

        Date d1 = new Date(15, 9, 2023);
        System.out.println(d1);

        Date d2 = new Date(3, 10, -50);
        System.out.println(d2);

        // Date d3 = new Date(15, 13, 2023); // IllegalArgumentException: Enter a valid month number
        // Date d3 = new Date(15, 8, null); // NullPointerException: Enter valid years. -100 = 100 a.
        // Date d3 = new Date(31, 6, 2023); // IllegalArgumentException: Enter a valid number of days
   }

}
