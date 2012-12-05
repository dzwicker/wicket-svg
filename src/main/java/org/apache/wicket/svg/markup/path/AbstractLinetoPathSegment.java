package org.apache.wicket.svg.markup.path;

import org.apache.wicket.model.IModel;

public abstract class AbstractLinetoPathSegment extends AbstractPathSegment<Double> {

    private static final long serialVersionUID = 1L;

    protected AbstractLinetoPathSegment(final IModel<Double> linetoModel) {
        super(linetoModel);
    }

    @Override
    protected String getCommandValue() {
        return Double.toString(getModelObject());
    }

}
