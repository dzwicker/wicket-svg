package org.apache.wicket.svg.model;

public class TextModelItem implements SvgCoordinate {

	private double x;
	private double y;
	private boolean percent;

	public TextModelItem(final double x, final double y, final boolean percent) {
		this.x = x;
		this.y = y;
		this.percent = percent;
	}

	@Override
	public double getX() {
		return x;
	}

	@Override
	public double getY() {
		return y;
	}

	@Override
	public boolean isPercent() {
		return percent;
	}
}
