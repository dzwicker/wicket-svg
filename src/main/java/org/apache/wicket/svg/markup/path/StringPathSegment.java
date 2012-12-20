package org.apache.wicket.svg.markup.path;

import org.apache.wicket.model.IModel;
import org.apache.wicket.model.Model;

public class StringPathSegment extends AbstractPathSegment<String> {

	public StringPathSegment(final IModel<String> model) {
		super(model);
	}

	public StringPathSegment(final String value) {
		super(Model.of(value));
	}

	@Override
	protected String getCommandValue() {
		return getModelObject();
	}

	@Override
	protected String getCommand() {
		return "";
	}
}
