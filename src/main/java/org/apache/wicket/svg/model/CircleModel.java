package org.apache.wicket.svg.model;

import org.apache.wicket.model.AbstractReadOnlyModel;

public class CircleModel extends AbstractReadOnlyModel<CircleModelItem> {

    private static final long serialVersionUID = 1L;

    private final CircleModelItem modelItem;

    public CircleModel(final double x, final double y, final double radius, final boolean percent) {
        modelItem = new CircleModelItem(x, y, radius, percent);
    }

    @Override
    public CircleModelItem getObject() {
        return modelItem;
    }

}
