package org.apache.wicket.svg.markup.path;

import org.apache.wicket.model.IModel;
import org.apache.wicket.svg.model.SvgCoordinate;

public class AbsoluteMoveto extends AbstractPathSegment {

    private static final long serialVersionUID = 1L;
    private final IModel<? extends SvgCoordinate> model;

    public AbsoluteMoveto(final IModel<? extends SvgCoordinate> model) {
        super(model);
        this.model = model;
    }

    @Override
    protected String getCommandValue() {
        final StringBuilder builder = new StringBuilder();
        builder.append(model.getObject().getX());
        if (model.getObject().isPercent()) {
            builder.append("%");
        }
        builder.append(",");
        builder.append(model.getObject().getY());
        if (model.getObject().isPercent()) {
            builder.append("%");
        }
        return builder.toString();
    }

    @Override
    protected String getCommand() {
        return "M";
    }

    @Override
    public void detach() {
        model.detach();
    }
}
