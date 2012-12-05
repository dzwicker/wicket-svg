package org.apache.wicket.svg.model;

import org.apache.wicket.model.AbstractReadOnlyModel;

public class RectModel extends AbstractReadOnlyModel<RectModelItem> {

    private final RectModelItem rectModelItem;

    public RectModel(final double x, final double y, final double width, final double height, final boolean percent) {
        rectModelItem = new RectModelItem(x, y, width, height, percent);
    }

    @Override
    public RectModelItem getObject() {
        return rectModelItem;
    }
}
