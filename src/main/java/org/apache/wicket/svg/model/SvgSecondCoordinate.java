package org.apache.wicket.svg.model;

import java.io.Serializable;

public interface SvgSecondCoordinate extends Serializable {

	double getX2();

	double getY2();

	boolean isPercent();
}
