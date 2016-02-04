/**
 * @author matthew
 *
 */
import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class StockBroker extends Application{
	@Override
	public void start(Stage brokerLogin) {
		//Pane for adding buttons, textfields and labels
		GridPane loginPane = new GridPane();
		loginPane.setAlignment(Pos.CENTER);
		loginPane.setPadding(new Insets(11.5,12.5,13.5,14.5));
		loginPane.setHgap(5.5);
		loginPane.setVgap(5.5);
		
		//Pane Variables
		//Labels before text fields
		Label userNameLabel = new Label("Username:");
		Label passwordLabel = new Label("Password:");
		//TextFields for keyboard entry
		TextField userNameField = new TextField();
		userNameField.setPromptText("Username..");
		PasswordField passwordField = new PasswordField();
		passwordField.setPromptText("Password..");
		//Buttons for login and exit
		Button btLogin = new Button("Login");
		Button btExit  = new Button("Exit");

		
		//Login Variables
		
		//Add to pane
		loginPane.add(userNameLabel, 0, 0);
		loginPane.add(userNameField, 1,	0);
		loginPane.add(passwordLabel, 0, 1);
		loginPane.add(passwordField, 1, 1);
		loginPane.add(btLogin, 1, 2);
		loginPane.add(btExit, 1, 3);
		//GridPane.setHalignment(btLogin, HPos.LEFT);
		//GridPane.setHalignment(btExit, HPos.RIGHT);
		//Align buttons to left and right
		//loginButton.
		//Add buttons to the pane
		Scene brokerLoginScene = new Scene(loginPane, 300, 300);
		brokerLogin.setTitle("Broker Login");
		brokerLogin.setScene(brokerLoginScene);
		brokerLogin.show();
		
		
		btLogin.setOnAction(event -> {
			String username = new String();
			String password = new String();
			boolean login = false;
			username = userNameField.getText();
			password = passwordField.getText();
			login = checkLogin(username, password);
			if (login == true)
				System.out.println("Correct login,");
			else
				System.out.println("Incorrect login");
				System.out.println(username);
				System.out.println(password);
		});
		
		btExit.setOnAction(event -> {
			System.exit(1);
		});
	} //start
	
	/**
	 * @param args
	 */
	private static boolean checkLogin(String user, String pass) {
		String tempUser = new String("matthew");
		String tempPass = new String("tempPass");
		if (user.equals(tempUser) && pass.equals(tempPass))
			return true;
		return false;
		
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	} //main

} //StockBroker Class
