package org.apache.wicket.svg.markup.basic;

import org.apache.wicket.model.IModel;
import org.apache.wicket.svg.model.TextModelItem;

public class Text extends AbstractCoordinateSvgComponent<TextModelItem> {

	public Text(final String wicketId, final IModel<TextModelItem> model) {
		super(wicketId, model);
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
		return "text";
	}
}
