package org.apache.wicket.svg.markup.basic;

import org.apache.wicket.AttributeModifier;
import org.apache.wicket.model.AbstractReadOnlyModel;
import org.apache.wicket.model.IModel;
import org.apache.wicket.svg.model.SvgCoordinate;

public abstract class AbstractCoordinateSvgComponent<T extends SvgCoordinate> extends AbstractSvgComponent<T> {

	private static final long serialVersionUID = 1L;

	public AbstractCoordinateSvgComponent(final String wicketId) {
		super(wicketId);
		initComponent();
	}

	public AbstractCoordinateSvgComponent(final String wicketId, final IModel<T> model) {
		super(wicketId, model);
		initComponent();
	}

	protected void initComponent() {
		add(new AttributeModifier(getXAttributeName(), new AbstractReadOnlyModel<String>() {

			private static final long serialVersionUID = 1L;

			@Override
			public String getObject() {
				return Double.toString(getModelObject().getX()) + (getModelObject().isPercent() ? "%" : "");
			}
		}));
		add(new AttributeModifier(getYAttributeName(), new AbstractReadOnlyModel<String>() {

			private static final long serialVersionUID = 1L;

			@Override
			public String getObject() {
				return Double.toString(getModelObject().getY()) + (getModelObject().isPercent() ? "%" : "");
			}
		}));
	}

	protected abstract String getXAttributeName();

	protected abstract String getYAttributeName();

}
