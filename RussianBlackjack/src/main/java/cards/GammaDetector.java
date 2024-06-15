package cards;

public class GammaDetector {

    public String detect(Card card) {
        Isotope isotope = card.getIsotope();
        return "Энергия: " + isotope.getEnergy() + " -> Изотоп: " + isotope.getName() + " -> Карта: " + card.getName();
    }

    public int checkValue(Card card) {
        return card.getValue();
    }
}
