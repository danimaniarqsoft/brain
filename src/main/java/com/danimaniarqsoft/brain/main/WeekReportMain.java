package com.danimaniarqsoft.brain.main;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.danimaniarqsoft.brain.controller.ScreensController;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

/*
 * WeekReportMain class execute the main app.
 * 
 * @author Daniel Cortes Pichardo
 */
public class WeekReportMain extends Application {
	private static final Logger LOGGER = LoggerFactory.getLogger(WeekReportMain.class);
	private Stage primaryStage;

	public static final String MAIN = "main";
	public static final String MAIN_FILE = "/fxml/Main.fxml";
	public static final String PROPERTIES = "Properties";
	public static final String PROPERTIES_FILE = "/fxml/Properties.fxml";
	public static final String APPLICATION_ICON = "http://cdn1.iconfinder.com/data/icons/Copenhagen/PNG/32/people.png";
	public static final String SPLASH_IMAGE = "http://fxexperience.com/wp-content/uploads/2010/06/logo.png";

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws IOException {
		ScreensController mainContainer = new ScreensController();
		mainContainer.loadScreen(WeekReportMain.MAIN, WeekReportMain.MAIN_FILE);
		mainContainer.loadScreen(WeekReportMain.PROPERTIES, WeekReportMain.PROPERTIES_FILE);
		mainContainer.setScreen(WeekReportMain.MAIN);
		Group root = new Group();
		root.getChildren().addAll(mainContainer);
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Monkey Brain");
		scene.getStylesheets().add("/styles/JMetroLightTheme.css");
		primaryStage.show();
	}

	/**
	 * Returns the main stage.
	 * 
	 * @return
	 */
	public Stage getPrimaryStage() {
		LOGGER.debug(primaryStage.toString());
		return primaryStage;
	}
}
