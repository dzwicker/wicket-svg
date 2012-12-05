package org.apache.wicket.svg.model;

public class EllipseModelItem implements SvgCoordinate, SvgEllipseRadius {

    private double cx;
    private double cy;
    private double rx;
    private double ry;
    private boolean percent;

    public EllipseModelItem() {
    }

    public EllipseModelItem(final double cx, final double cy, final boolean percent) {
        this.cx = cx;
        this.cy = cy;
        this.percent = percent;
    }

    public EllipseModelItem(final double cx, final double cy, final double rx, final double ry, final boolean percent) {
        this.cx = cx;
        this.cy = cy;
        this.rx = rx;
        this.ry = ry;
        this.percent = percent;
    }

    @Override
    public double getX() {
        return cx;
    }

    @Override
    public double getY() {
        return cy;
    }

    @Override
    public double getRX() {
        return rx;
    }

    @Override
    public double getRY() {
        return ry;
    }

    @Override
    public boolean isPercent() {
        return percent;
    }
}
