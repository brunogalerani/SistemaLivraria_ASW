package controllers;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

public class ListaProdutosController implements Initializable{
	@FXML
	private ListView listViewProdutos;
	@FXML
	private Button buttonCadastrar, buttonEditar, buttonApagar, buttonDetalhes, buttonVoltar;
	@FXML
	private Label labelNome, labelCodigoDeBarras, labelMarca, labelPreco;
	
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
	
	
}
