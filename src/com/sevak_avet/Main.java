package com.sevak_avet;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;

import com.aquafx_project.AquaFx;
import com.aquafx_project.controls.skin.styles.ButtonType;
import com.aquafx_project.controls.skin.styles.TabPaneType;
import com.aquafx_project.controls.skin.styles.TextFieldType;
import com.sevak_avet.Controls.FXButton;
import com.sevak_avet.Controls.FXCheckBox;
import com.sevak_avet.Controls.FXColorPicker;
import com.sevak_avet.Controls.FXProgressBar;
import com.sevak_avet.Controls.FXRadioButton;
import com.sevak_avet.Controls.FXTabPane;
import com.sevak_avet.Controls.FXTextField;

public class Main extends Application {
	
	private static Tab[] tabs = new Tab[]{
			new Tab("One"),
			new Tab("Two"),
			new Tab("Three"),
			new Tab("Four")
	};
	
	private static CheckBox[] chBoxes = new FXCheckBox[] {
			new FXCheckBox("ONE"), 
			new FXCheckBox("TWO"), 
			new FXCheckBox("THREE")
	};
	
	private static ToggleGroup group = new ToggleGroup();
	private static RadioButton[] rbs = new RadioButton[]{
			new FXRadioButton("ONE", group), 
			new FXRadioButton("TWO", group), 
			new FXRadioButton("THREE", group)};
	
	@Override
	public void start(Stage stage) {
		Group root = new Group();
		Scene scene = new Scene(root, 500,300);
				
		Button btn = new FXButton("CLICK ME", ButtonType.ROUND_RECT, 200, 100);
		root.getChildren().add(btn);
		
		TextField tf = new FXTextField("TextField", TextFieldType.REGULAR, 200,150);
		root.getChildren().add(tf);
		
		
		TabPane tabPane = new FXTabPane(TabPaneType.REGULAR, 200,20);
		tabPane.getTabs().addAll(tabs);
		root.getChildren().add(tabPane);
		
		
		int x = 30;
		int y = 50;
		for(CheckBox chBox : chBoxes) {
			chBox.setLayoutX(x);
			chBox.setLayoutY(y);
			root.getChildren().add(chBox);
			
			y += 20;
		}
		

		x = 100;
		y = 50;
		for(RadioButton rb : rbs) {
			rb.setLayoutX(x);
			rb.setLayoutY(y);
			root.getChildren().add(rb);
			
			y += 20;
		}
		
		
		ColorPicker colorPicker = new FXColorPicker(Color.BLACK, 30, 150);
		root.getChildren().add(colorPicker);
		
		
		ProgressBar progressBar = new FXProgressBar(30, 180);
		root.getChildren().add(progressBar);	
		
		final Timeline timeline = new Timeline(
		      new KeyFrame(Duration.millis(0),    new KeyValue(progressBar.progressProperty(), 0)),
		      new KeyFrame(Duration.millis(1000), new KeyValue(progressBar.progressProperty(), 1))
		    );
		 
		 btn.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				timeline.playFromStart();				
			}
		});
			
		
		AquaFx.styleStage(stage, StageStyle.DECORATED);
		AquaFx.style();
		
		stage.setScene(scene);
		stage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
