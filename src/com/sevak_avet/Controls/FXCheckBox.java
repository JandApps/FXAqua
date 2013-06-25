package com.sevak_avet.Controls;

import javafx.scene.control.CheckBox;

public class FXCheckBox extends CheckBox {
	
	public FXCheckBox() {
		// TODO Auto-generated constructor stub
	}
	
	public FXCheckBox(String name) {
		this.setText(name);
	}
	
	public FXCheckBox(String name, int x, int y) {
		this(name);
		this.setLayoutX(x);
		this.setLayoutY(y);
	}
	
	

}
