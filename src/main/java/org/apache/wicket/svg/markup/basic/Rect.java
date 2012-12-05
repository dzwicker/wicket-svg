package org.apache.wicket.svg.markup.basic;

import org.apache.wicket.AttributeModifier;
import org.apache.wicket.model.AbstractReadOnlyModel;
import org.apache.wicket.model.IModel;
import org.apache.wicket.svg.model.SvgCoordinate;
import org.apache.wicket.svg.model.SvgHeight;
import org.apache.wicket.svg.model.SvgWidth;

public class Rect<T extends SvgCoordinate & SvgWidth & SvgHeight> extends AbstractCoordinateSvgComponent<T> {

    private static final long serialVersionUID = 1L;

    public Rect(final String wicketId, final IModel<T> model) {
        super(wicketId, model);
    }

    @Override
    protected void initComponent() {
        super.initComponent();
        add(new AttributeModifier("Width", new AbstractReadOnlyModel<String>() {

            private static final long serialVersionUID = 1L;

            @Override
            public String getObject() {
                return Double.toString(getModelObject().getWidth()) + (getModelObject().isPercent() ? "%" : "");
            }
        }));
        add(new AttributeModifier("height", new AbstractReadOnlyModel<String>() {

            private static final long serialVersionUID = 1L;

            @Override
            public String getObject() {
                return Double.toString(getModelObject().getHeight()) + (getModelObject().isPercent() ? "%" : "");
            }
        }));
    }

    @Override
    protected String getXAttributeName() {
        return "x";
    }

    @Override
    protected String getYAttributeName() {
        return "y";
    }

    @Override
    protected String getTag() {
        return "rect";
    }
}
