package ShapeDomain;

public class TriangularPrism extends Prism {
    public TriangularPrism(double height, double edge) {
        super(height, edge);
    }

    @Override
    public double calcBaseArea() {
        return Math.pow(getEdge(), 2) * Math.sqrt(3) / 4;
    }

    @Override
    public double calcVolume() {
        return calcBaseArea() * getHeight();
    }

    @Override
    public String toString() {
        return String.format("%15s height = %15.2f edge   = %10.2f Base area = %30.2f Volume = %30.2f",
                this.getClass().getSimpleName(), getHeight(), getEdge(), calcBaseArea(), calcVolume());

    }
}
