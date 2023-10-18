package ShapeDomain;

public class PentagonalPrism extends Prism {
    public PentagonalPrism(double height, double edge) {
        super(height, edge);
    }

    @Override
    public double calcBaseArea() {
        return 5 * Math.pow(getEdge(), 2) * Math.tan(Math.toRadians(54)) / 4;
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
