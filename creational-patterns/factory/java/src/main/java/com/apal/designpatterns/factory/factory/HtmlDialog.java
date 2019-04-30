package com.apal.designpatterns.factory.factory;

import com.apal.designpatterns.factory.buttons.Button;
import com.apal.designpatterns.factory.buttons.HtmlButton;

public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }

}
