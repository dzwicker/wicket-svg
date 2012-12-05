package org.apache.wicket.svg.markup.path;

import org.apache.wicket.model.IModel;

public class RelativeEllipticalArc extends AbstractPathSegment<String> {

    private static final long serialVersionUID = 1L;

    public RelativeEllipticalArc(final IModel<String> ellipticalArcModel) {
        super(ellipticalArcModel);
    }

    @Override
    protected String getCommandValue() {
        return getModelObject();
    }

    @Override
    protected String getCommand() {
        return "a";
    }

}
