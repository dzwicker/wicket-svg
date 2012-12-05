package org.apache.wicket.svg.markup.basic;

import org.apache.wicket.markup.ComponentTag;
import org.apache.wicket.markup.html.WebMarkupContainer;
import org.apache.wicket.model.IModel;

public abstract class AbstractSvgComponent<T> extends WebMarkupContainer {

    private static final long serialVersionUID = 1L;

    private IModel<T> model;

    public AbstractSvgComponent(final String wicketId) {
        super(wicketId);
    }

    public AbstractSvgComponent(final String wicketId, final IModel<T> model) {
        super(wicketId, model);
        this.model = model;
    }

    @Override
    protected void onComponentTag(final ComponentTag tag) {
        // Must be attached to an special tag
        checkComponentTag(tag, getTag());

        // Default handling for component tag
        super.onComponentTag(tag);
    }

    protected abstract String getTag();

    public IModel<T> getModel() {
        return model;
    }

    public void setModel(final IModel<T> model) {
        this.model = model;
    }

    public T getModelObject() {
        return model.getObject();
    }

    public void setModelObject(final T object) {
        model.setObject(object);
    }

}
