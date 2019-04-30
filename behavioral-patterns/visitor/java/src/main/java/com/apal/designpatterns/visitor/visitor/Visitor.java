package com.apal.designpatterns.visitor.visitor;

import com.apal.designpatterns.visitor.shape.Circle;
import com.apal.designpatterns.visitor.shape.CompoundShape;
import com.apal.designpatterns.visitor.shape.Dot;
import com.apal.designpatterns.visitor.shape.Rectangle;

public interface Visitor {
    String visitDot(Dot dot);

    String visitCircle(Circle circle);

    String visitRectangle(Rectangle rectangle);

    String visitCompoundGraphic(CompoundShape cg);
}
