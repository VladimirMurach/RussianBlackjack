package cards;

public class Isotope {

    private String name;
    private double halfLife;
    private double energy;
    private int number;

    public Isotope(String name, double halfLife, double energy, int number) {
        this.name = name;
        this.halfLife = halfLife;
        this.energy = energy;
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHalfLife() {
        return halfLife;
    }

    public void setHalfLife(double halfLife) {
        this.halfLife = halfLife;
    }

    public double getEnergy() {
        return energy;
    }

    public void setEnergy(double energy) {
        this.energy = energy;
    }

}
