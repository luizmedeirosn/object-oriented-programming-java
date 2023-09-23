package fundamentals.fistpart.bankaccount;

import java.util.Locale;

import utils.ClearTerminal;

public class AccountClient {
    
    public static void main(String[] args) {
        ClearTerminal.run();
        Locale.setDefault(Locale.US);

        // Account a1 = new Account(1L, -1.0); // IllegalArgumentException
        Account a1 = new Account(1L, 0.0);
        System.out.println(a1);

        a1.credit(20.0);
        System.out.println(a1);

        a1.debit(10.0);
        System.out.println(a1);

        // a1.credit(20.0); // IllegalArgumentException (No balance)

    }

}
