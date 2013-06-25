package com.sevak_avet.Controls;

import javafx.scene.control.TextField;

import com.aquafx_project.AquaFx;
import com.aquafx_project.controls.skin.styles.TextFieldType;
import com.aquafx_project.controls.skin.styles.styler.TextFieldStyler;

public class FXTextField extends TextField {
	
	public FXTextField(){
		TextFieldStyler tfStyler = AquaFx.createTextFieldStyler();
		tfStyler.setType(TextFieldType.REGULAR);
		tfStyler.style(this);
	}
	
	public FXTextField(String name, TextFieldType type) {
		super(name);
		TextFieldStyler tfStyler = AquaFx.createTextFieldStyler();
		tfStyler.setType(type);
		tfStyler.style(this);
	}
	
	public FXTextField(String name, TextFieldType type, int x, int y) {
		this(name, type);
		this.setLayoutX(x);
		this.setLayoutY(y);
	}

}
