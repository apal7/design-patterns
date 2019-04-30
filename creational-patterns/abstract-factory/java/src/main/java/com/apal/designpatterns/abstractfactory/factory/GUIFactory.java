package com.apal.designpatterns.abstractfactory.factory;

import com.apal.designpatterns.abstractfactory.button.Button;
import com.apal.designpatterns.abstractfactory.checkbox.Checkbox;


/**
 * Abstract factory knows about all (abstract) product types.
 */
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
