package com.apal.designpatterns.mediator;


import com.apal.designpatterns.mediator.components.*;
import com.apal.designpatterns.mediator.mediator.Editor;
import com.apal.designpatterns.mediator.mediator.Mediator;

import javax.swing.*;

public class MediatorApplication {

	public static void main(String[] args) {

		Mediator mediator = new Editor();

		mediator.registerComponent(new Title());
		mediator.registerComponent(new TextBox());
		mediator.registerComponent(new AddButton());
		mediator.registerComponent(new DeleteButton());
		mediator.registerComponent(new SaveButton());
		mediator.registerComponent(new List(new DefaultListModel()));
		mediator.registerComponent(new Filter());

		mediator.createGUI();

	}

}

