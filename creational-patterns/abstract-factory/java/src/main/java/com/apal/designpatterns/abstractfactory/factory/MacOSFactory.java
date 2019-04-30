package com.apal.designpatterns.abstractfactory.factory;

import com.apal.designpatterns.abstractfactory.button.Button;
import com.apal.designpatterns.abstractfactory.button.MacOSButton;
import com.apal.designpatterns.abstractfactory.checkbox.Checkbox;
import com.apal.designpatterns.abstractfactory.checkbox.MacOSCheckbox;


/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */
public class MacOSFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }

}
