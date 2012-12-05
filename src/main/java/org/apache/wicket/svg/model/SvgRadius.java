package org.apache.wicket.svg.model;

import java.io.Serializable;

public interface SvgRadius extends Serializable {

    double getRadius();

    boolean isPercent();
}
