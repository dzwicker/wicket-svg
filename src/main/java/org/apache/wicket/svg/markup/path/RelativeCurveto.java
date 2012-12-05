package org.apache.wicket.svg.markup.path;

import org.apache.wicket.model.IModel;

public class RelativeCurveto extends AbstractPathSegment<String> {

    private static final long serialVersionUID = 1L;

    public RelativeCurveto(final IModel<String> curvetoModel) {
        super(curvetoModel);
    }

    @Override
    protected String getCommandValue() {
        return getModelObject();
    }

    @Override
    protected String getCommand() {
        return "c";
    }
}
