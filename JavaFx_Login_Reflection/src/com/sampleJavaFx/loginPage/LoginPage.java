package com.sampleJavaFx.loginPage;


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.TitledPane;
import javafx.scene.effect.Reflection;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 * The Class LoginPage.
 */
public class LoginPage extends Application{

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		// Launch the actual Application
		Application.launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {

		// Declare variable for Title
		String TITLE = "Login";

		// Border Pane with background in white colour
		BorderPane borderPane = new BorderPane();
		borderPane.setPadding(new Insets(100, 150, 200, 150));
		borderPane.getStyleClass().add("back-white");

		// Login page drops when user clicks on Sign In
		TitledPane titledPane = new TitledPane("Click here to SignIn..", borderPane);
		titledPane.setExpanded(false);
		titledPane.getStyleClass().add("font-bold-size18");

		// HBox holding the welcome message
		HBox hbox = new HBox();
		hbox.setPadding(new Insets(0,0,50,80));

		// Welcome Label
		Label welcomeLabel = new Label("Welcome User!!");
		welcomeLabel.getStyleClass().add("font-bold-size20");

		// Add the child node welcomeLabel to HBox
		hbox.getChildren().addAll(welcomeLabel);

		// Set the HBox as the top content 
		borderPane.setTop(hbox);

		// Grid Pane to hold elements user name, password and login button
		GridPane gridPane = new GridPane();
		gridPane.setPadding(new Insets(20,20,20,40));
		gridPane.setVgap(10);
		gridPane.setVgap(5);

		// UserName Label
		Label labelUserName = new Label("UserName");
		labelUserName.getStyleClass().add("font-bold-size12");
		// UserName TextField
		TextField usrNameField = new TextField();

		// Password Label
		Label labelPassword = new Label("Password");
		labelPassword.getStyleClass().add("font-bold-size12");
		// Password TextField
		PasswordField pwdField = new PasswordField();

		// Login Button
		Button loginButton = new Button("Login");
		loginButton.getStyleClass().add("font-bold-size18");
		loginButton.setMaxSize(500, 10);

		// Adding the child nodes to grid pane
		gridPane.add(labelUserName, 0, 0);
		gridPane.add(usrNameField, 0, 1);
		gridPane.add(labelPassword, 0, 2);
		gridPane.add(pwdField, 0, 3);
		gridPane.add(loginButton, 0, 6);

		// Reflection object to get the mirror image of the login grid
		Reflection reflect = new Reflection();
		reflect.setTopOffset(20);
		reflect.setFraction(0.8f);
		gridPane.setEffect(reflect);
		gridPane.getStyleClass().add("login-border");

		// 	Set the grid pane to the center of the border pane 
		borderPane.setCenter(gridPane);

		// Fixed window of width 600 and height 600
		Scene scene = new Scene(titledPane, 600, 600);
		scene.getStylesheets().add("loginPage.css");
		stage.setScene(scene);
		stage.getIcons().add(new Image("login.gif"));
		stage.setTitle(TITLE);

		// Do not allow user to resize the window
		stage.setResizable(false);

		stage.show();
	}
}