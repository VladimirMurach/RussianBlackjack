package cards;

public class Card {

    private String name;
    private int value;
    private Isotope isotope;

    public Card(String name, int value, Isotope isotope) {
        this.name = name;
        this.value = value;
        this.isotope = isotope;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Isotope getIsotope() {
        return isotope;
    }

    public void setIsotope(Isotope isotope) {
        this.isotope = isotope;
    }

}
