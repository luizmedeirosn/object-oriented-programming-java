package fistpart.wizard;

import java.util.Locale;

import utils.ClearTerminal;

public class WizardClient {
    
    public static void main(String[] args) {
        ClearTerminal.run();
        Locale.setDefault(Locale.US);

        Wizard w1 = new Wizard("Martha", HouseEnum.GRYFFINDOR, "Fire");
        Wizard w2 = new Wizard("Alex", HouseEnum.RAVENCLAW, "Water");
        Wizard w3 = new Wizard("Marcus", HouseEnum.valueOf(100), "Shadows");

        w1.castSpell();
        w2.castSpell();
        w3.castSpell();

        System.out.println(w1);
        System.out.println(w2);
        System.out.println(w3);
    }

}
