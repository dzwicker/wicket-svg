package org.apache.wicket.svg.markup.basic;

import org.apache.wicket.AttributeModifier;
import org.apache.wicket.model.AbstractReadOnlyModel;
import org.apache.wicket.model.IModel;
import org.apache.wicket.svg.model.SvgCoordinate;
import org.apache.wicket.svg.model.SvgRadius;

public class Circle<T extends SvgCoordinate & SvgRadius> extends AbstractCoordinateSvgComponent<T> {

	private static final long serialVersionUID = 1L;

	public Circle(final String wicketId) {
		super(wicketId);
	}

	public Circle(final String wicketId, final IModel<T> model) {
		super(wicketId, model);
	}

	@Override
	protected void initComponent() {
		super.initComponent();
		add(new AttributeModifier("r", new AbstractReadOnlyModel<String>() {

			private static final long serialVersionUID = 1L;

			@Override
			public String getObject() {
				return Double.toString(getModelObject().getRadius()) + (getModelObject().isPercent() ? "%" : "");
			}
		}));
	}

	@Override
	protected String getXAttributeName() {
		return "cx";
	}

	@Override
	protected String getYAttributeName() {
		return "cy";
	}

	@Override
	protected String getTag() {
		return "circle";
	}
}
