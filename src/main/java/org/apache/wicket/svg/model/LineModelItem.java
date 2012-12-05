package org.apache.wicket.svg.model;

public class LineModelItem implements SvgCoordinate, SvgSecondCoordinate {

    private static final long serialVersionUID = 1L;

    private double x1;
    private double y1;
    private double x2;
    private double y2;
    private boolean percent;

    public LineModelItem() {
    }

    public LineModelItem(final double x1, final double y1, final boolean percent) {
        this.x1 = x1;
        this.y1 = y1;
        this.percent = percent;
    }

    public LineModelItem(final double x1, final double y1, final double x2, final double y2, final boolean percent) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.percent = percent;
    }

    @Override
    public double getX() {
        return x1;
    }

    @Override
    public double getY() {
        return y1;
    }

    @Override
    public double getX2() {
        return x2;
    }

    @Override
    public double getY2() {
        return y2;
    }

    @Override
    public boolean isPercent() {
        return percent;
    }
}
