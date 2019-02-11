package com.apal.designpatterns.factory.factory;

import com.apal.designpatterns.factory.buttons.Button;
import com.apal.designpatterns.factory.buttons.WindowsButton;

public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

}
