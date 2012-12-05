package org.apache.wicket.svg.model;

import org.apache.wicket.model.AbstractReadOnlyModel;

public class LineModel extends AbstractReadOnlyModel<LineModelItem> {

    private final LineModelItem lineModelItem;

    public LineModel(final double x1, final double y1, final double x2, final double y2, final boolean percent) {
        lineModelItem = new LineModelItem(x1, y1, x2, y2, percent);
    }

    @Override
    public LineModelItem getObject() {
        return lineModelItem;
    }
}
