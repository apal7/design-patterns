package com.apal.designpatterns.abstractfactory.factory;

import com.apal.designpatterns.abstractfactory.button.Button;
import com.apal.designpatterns.abstractfactory.button.WindowsButton;
import com.apal.designpatterns.abstractfactory.checkbox.Checkbox;
import com.apal.designpatterns.abstractfactory.checkbox.WindowsCheckbox;



/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */
public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}

