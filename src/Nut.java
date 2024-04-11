public class Nut {
    private double weight;

    public Nut() {
        this.weight = Math.random()*(25-5)+5;
    }

    public double getWeight() {
        return weight;
    }
}
