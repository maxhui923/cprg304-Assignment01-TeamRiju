package ShapeDomain;

public class SquarePrism extends Prism {
    public SquarePrism(double height, double edge) {
        super(height, edge);
    }

    @Override
    public double calcBaseArea() {
        return Math.pow(getEdge(), 2);
    }

    @Override
    public double calcVolume() {
        return Math.pow(getEdge(), 2) * getHeight();
    }

    @Override
    public String toString() {
        return String.format("%s\nHeight = %.2f\nEdge = %.2f\nBase area = %.2f\nVolume = %.2f",
                this.getClass().getSimpleName(), getHeight(), getEdge(), calcBaseArea(), calcVolume());

    }
}
