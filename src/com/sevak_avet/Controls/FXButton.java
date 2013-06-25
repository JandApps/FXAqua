package com.sevak_avet.Controls;
import javafx.scene.control.Button;

import com.aquafx_project.AquaFx;
import com.aquafx_project.controls.skin.styles.ButtonType;
import com.aquafx_project.controls.skin.styles.styler.ButtonStyler;


public class FXButton extends Button {
	
	public FXButton(){
		ButtonStyler buttonStyler = AquaFx.createButtonStyler();
		buttonStyler.setType(ButtonType.REGULAR);
		buttonStyler.style(this);
	}
	
	public FXButton(String name, ButtonType type) {
		super(name);
		ButtonStyler buttonStyler = AquaFx.createButtonStyler();
		buttonStyler.setType(type);
		buttonStyler.style(this);
	}
	
	public FXButton(String name, ButtonType type, int x, int y) {
		this(name, type);
		this.setLayoutX(x);
		this.setLayoutY(y);
	}
}
