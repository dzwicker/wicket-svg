package org.apache.wicket.svg.markup.basic;

import org.apache.wicket.AttributeModifier;
import org.apache.wicket.model.AbstractReadOnlyModel;
import org.apache.wicket.model.IModel;
import org.apache.wicket.svg.model.SvgCoordinate;
import org.apache.wicket.svg.model.SvgSecondCoordinate;

public class Line<T extends SvgCoordinate & SvgSecondCoordinate> extends AbstractCoordinateSvgComponent<T> {

	private static final long serialVersionUID = 1L;

	public Line(final String wicketId) {
		super(wicketId);
	}

	public Line(final String wicketId, final IModel<T> model) {
		super(wicketId, model);
	}

	@Override
	protected void initComponent() {
		super.initComponent();
		add(new AttributeModifier("x2", new AbstractReadOnlyModel<String>() {

			private static final long serialVersionUID = 1L;

			@Override
			public String getObject() {
				return Double.toString(getModelObject().getX2()) + (getModelObject().isPercent() ? "%" : "");
			}
		}));
		add(new AttributeModifier("y2", new AbstractReadOnlyModel<String>() {

			private static final long serialVersionUID = 1L;

			@Override
			public String getObject() {
				return Double.toString(getModelObject().getY2()) + (getModelObject().isPercent() ? "%" : "");
			}
		}));
	}

	@Override
	protected String getXAttributeName() {
		return "x1";
	}

	@Override
	protected String getYAttributeName() {
		return "y1";
	}

	@Override
	protected String getTag() {
		return "line";
	}
}
