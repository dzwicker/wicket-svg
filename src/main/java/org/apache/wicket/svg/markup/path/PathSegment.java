package org.apache.wicket.svg.markup.path;

import org.apache.wicket.model.IDetachable;

public interface PathSegment extends IDetachable {

    String getValue();

    @Override
    String toString();
}
