package controllers;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class LoginController implements Initializable {
	@FXML
	private TextField textFieldUsuario;
	@FXML
	private TextField textFieldSenha;
	@FXML
	private Button buttonLogin;
	@FXML
	private Button buttonFechar;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
	}

}