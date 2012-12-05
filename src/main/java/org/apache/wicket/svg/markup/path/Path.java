package org.apache.wicket.svg.markup.path;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.apache.wicket.AttributeModifier;
import org.apache.wicket.model.AbstractReadOnlyModel;
import org.apache.wicket.model.IModel;
import org.apache.wicket.svg.markup.basic.AbstractSvgComponent;

public class Path extends AbstractSvgComponent {

    private static final long serialVersionUID = 1L;

    private final IModel<List<PathSegment>> pathSegments;

    public Path(final String wicketId, final IModel<List<PathSegment>> pathSegments) {
        super(wicketId);
        this.pathSegments = pathSegments;

        init();
    }

    private void init() {
        add(new AttributeModifier("d", new AbstractReadOnlyModel<String>() {

            private static final long serialVersionUID = 1L;

            @Override
            public String getObject() {
                return StringUtils.join(pathSegments.getObject(), " ");
            }
        }));
    }

    @Override
    public void detachModels() {
        super.detachModels();
        for (final PathSegment pathSegment : pathSegments.getObject()) {
            pathSegment.detach();
        }
        pathSegments.detach();
    }

    @Override
    protected String getTag() {
        return "path";
    }
}
