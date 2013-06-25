package com.sevak_avet.Controls;

import javafx.scene.control.TabPane;

import com.aquafx_project.AquaFx;
import com.aquafx_project.controls.skin.styles.TabPaneType;
import com.aquafx_project.controls.skin.styles.styler.TabPaneStyler;

public class FXTabPane extends TabPane {

	public FXTabPane() {
		TabPaneStyler tabPaneStyler = AquaFx.createTabPaneStyler();
		tabPaneStyler.setType(TabPaneType.REGULAR);
		tabPaneStyler.style(this);
	}
	
	public FXTabPane(TabPaneType type) {
		TabPaneStyler tabPaneStyler = AquaFx.createTabPaneStyler();
		tabPaneStyler.setType(type);
		tabPaneStyler.style(this);
	}
	
	public FXTabPane(TabPaneType type, int x, int y) {
		this(type);
		this.setLayoutX(x);
		this.setLayoutY(y);
	}
}
