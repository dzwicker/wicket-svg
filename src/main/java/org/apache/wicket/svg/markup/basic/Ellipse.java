package org.apache.wicket.svg.markup.basic;

import org.apache.wicket.AttributeModifier;
import org.apache.wicket.model.AbstractReadOnlyModel;
import org.apache.wicket.model.IModel;
import org.apache.wicket.svg.model.SvgCoordinate;
import org.apache.wicket.svg.model.SvgXYRadius;

public class Ellipse<T extends SvgCoordinate & SvgXYRadius> extends AbstractCoordinateSvgComponent<T> {

	private static final long serialVersionUID = 1L;

	public Ellipse(final String wicketId) {
		super(wicketId);
	}

	public Ellipse(final String wicketId, final IModel<T> model) {
		super(wicketId, model);
	}

	@Override
	protected void initComponent() {
		super.initComponent();
		add(new AttributeModifier("rx", new AbstractReadOnlyModel<String>() {

			private static final long serialVersionUID = 1L;

			@Override
			public String getObject() {
				return Double.toString(getModelObject().getRX()) + (getModelObject().isPercent() ? "%" : "");
			}
		}));
		add(new AttributeModifier("ry", new AbstractReadOnlyModel<String>() {

			private static final long serialVersionUID = 1L;

			@Override
			public String getObject() {
				return Double.toString(getModelObject().getRY()) + (getModelObject().isPercent() ? "%" : "");
			}
		}));

	}

	//        add(new AttributeModifier("cx", new AbstractReadOnlyModel<String>() {
//
//
//            @Override
//            public String getObject() {
//                return Double.toString(MapConstants.OFFSET +
//                        MapConstants.SCALE_FACTOR * riskModel.getObject().getX() + getOffsetX());
//            }
//        }));
//        add(new AttributeModifier("cy", new AbstractReadOnlyModel<String>() {
//
//            private static final long serialVersionUID = 1L;
//
//            @Override
//            public String getObject() {
//                return Double.toString(MapConstants.OFFSET +
//                        MapConstants.SCALE_FACTOR * riskModel.getObject().getY() + getOffsetY());
//            }
//        }));
//        add(new AttributeModifier("rx", new AbstractReadOnlyModel<String>() {
//
//            private static final long serialVersionUID = 1L;
//
//            @Override
//            public String getObject() {
//                return Double.toString(MapConstants.SCALE_FACTOR * getRX());
//            }
//        }));
//        add(new AttributeModifier("ry", new AbstractReadOnlyModel<String>() {
//
//            private static final long serialVersionUID = 1L;
//
//            @Override
//            public String getObject() {
//                return Double.toString(MapConstants.SCALE_FACTOR * getRY());
//            }
//        }));

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
		return "ellipse";
	}
}
