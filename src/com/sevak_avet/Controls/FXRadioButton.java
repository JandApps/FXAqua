package com.sevak_avet.Controls;

import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

public class FXRadioButton extends RadioButton {
	
	public FXRadioButton() {
		// TODO Auto-generated constructor stub
	}
	
	public FXRadioButton(String name) {
		this.setText(name);
	}
	
	public FXRadioButton(String name, ToggleGroup toggleGroup) {
		this(name);
		this.setToggleGroup(toggleGroup);
	}
	
	public FXRadioButton(String name, ToggleGroup toggleGroup, int x, int y) {
		this(name, toggleGroup);
		this.setLayoutX(x);
		this.setLayoutY(y);
	}
}
