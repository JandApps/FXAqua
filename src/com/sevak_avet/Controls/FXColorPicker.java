package com.sevak_avet.Controls;

import javafx.scene.control.ColorPicker;
import javafx.scene.paint.Color;

public class FXColorPicker extends ColorPicker {

	public FXColorPicker() {
		// TODO Auto-generated constructor stub
	}
	
	public FXColorPicker(Color color) {
		super(color);
	}
	
	public FXColorPicker(Color color, int x, int y) {
		this(color);
		this.setLayoutX(x);
		this.setLayoutY(y);
	} 

}
