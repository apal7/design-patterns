package com.apal.designpatterns.mediator.components;

import com.apal.designpatterns.mediator.mediator.Mediator;

public interface Component {
    void setMediator(Mediator mediator);
    String getName();
}
