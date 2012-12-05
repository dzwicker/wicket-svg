package org.apache.wicket.svg.model;

public class CircleModelItem implements SvgCoordinate, SvgRadius {

    private static final long serialVersionUID = 1L;

    private double x;
    private double y;
    private double radius;
    private boolean percent;

    public CircleModelItem() {
    }

    public CircleModelItem(final double x, final double y, final boolean percent) {
        this.x = x;
        this.y = y;
        this.percent = percent;
    }

    public CircleModelItem(final double radius, final boolean percent) {
        this.radius = radius;
        this.percent = percent;
    }

    public CircleModelItem(final double x, final double y, final double radius, final boolean percent) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.percent = percent;
    }

    @Override
    public double getX() {
        return x;
    }

    public void setX(final double x) {
        this.x = x;
    }

    @Override
    public double getY() {
        return y;
    }

    @Override
    public boolean isPercent() {
        return percent;
    }

    public void setY(final double y) {
        this.y = y;
    }

    @Override
    public double getRadius() {
        return radius;
    }

    public void setRadius(final double radius) {
        this.radius = radius;
    }
}
