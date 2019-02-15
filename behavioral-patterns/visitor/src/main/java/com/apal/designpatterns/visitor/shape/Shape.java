package com.apal.designpatterns.visitor.shape;

import com.apal.designpatterns.visitor.visitor.Visitor;

public interface Shape {
    void move(int x, int y);
    void draw();
    String accept(Visitor visitor);
}
