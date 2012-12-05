package org.apache.wicket.svg.model;

public class RectModelItem implements SvgCoordinate, SvgHeight, SvgWidth {

    private double x;
    private double y;
    private double width;
    private double height;
    private boolean percent;

    public RectModelItem() {
    }

    public RectModelItem(final double x, final double y, final boolean percent) {
        this.x = x;
        this.y = y;
        this.percent = percent;
    }

    public RectModelItem(final double x, final double y, final double width, final double height,
            final boolean percent) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
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

    public void setY(final double y) {
        this.y = y;
    }

    @Override
    public double getWidth() {
        return width;
    }

    public void setWidth(final double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(final double height) {
        this.height = height;
    }

    public boolean isPercent() {
        return percent;
    }

    public void setPercent(final boolean percent) {
        this.percent = percent;
    }
}
