package org.fit.cssbox.layout;

import org.w3c.dom.Element;

import java.awt.*;

public class FlexItemBlockBox extends BlockBox {
    public FlexItemBlockBox(Element n, Graphics2D g, VisualContext ctx) {
        super(n, g, ctx);
        isblock = true;
    }

    public FlexItemBlockBox(InlineBox src) {
        super(src);
        isblock = true;
    }
}
