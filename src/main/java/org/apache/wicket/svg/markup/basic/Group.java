package org.apache.wicket.svg.markup.basic;

public class Group extends AbstractSvgComponent<Void> {

    private static final long serialVersionUID = 1L;

    public Group(final String wicketId) {
        super(wicketId);
    }

    @Override
    protected String getTag() {
        return "g";
    }
}
