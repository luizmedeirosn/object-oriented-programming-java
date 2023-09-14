package fistpart.wizard;

public class Wizard {
    
    private String name;
    private HouseEnum house;
    private String spell;
    
    public Wizard() {
    }

    public Wizard(String name, HouseEnum house, String spell) {
        this.name = name;
        this.house = house;
        this.spell = spell;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HouseEnum getHouse() {
        return house;
    }

    public void setHouse(HouseEnum house) {
        this.house = house;
    }

    public String getSpell() {
        return spell;
    }

    public void setSpell(String spell) {
        this.spell = spell;
    }

    public void castSpell() {
        System.out.println("Cast a " + spell + " spell...");
    }

    @Override
    public String toString() {
        return String.format(
            "{%n" +
            "   name: %s,%n" +
            "   house: %s,%n" +
            "   spell: %s%n" +
            "}%n",
            name, house, spell
        );
    }
    
}
