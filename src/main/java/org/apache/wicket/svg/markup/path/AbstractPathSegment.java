package org.apache.wicket.svg.markup.path;

import org.apache.wicket.model.IModel;

public abstract class AbstractPathSegment<T> implements PathSegment {

    private static final long serialVersionUID = 1L;

    private final IModel<T> model;

    protected AbstractPathSegment(final IModel<T> model) {
        this.model = model;
    }

    @Override
    public String getValue() {
        return getCommand() + getCommandValue();
    }

    @Override
    public String toString() {
        return getValue();
    }

    public IModel<T> getModel() {
        return model;
    }

    public T getModelObject() {
        return model.getObject();
    }

    @Override
    public void detach() {
        model.detach();
    }

    protected abstract String getCommandValue();

    protected abstract String getCommand();
}
