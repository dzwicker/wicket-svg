package org.apache.wicket.svg.model;

import java.io.Serializable;

public interface SvgCoordinate extends Serializable {

    double getX();

    double getY();

    boolean isPercent();
}
