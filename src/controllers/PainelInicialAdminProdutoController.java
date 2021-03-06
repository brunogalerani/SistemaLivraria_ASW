package controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import auxiliares.Session;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import models.Gerente;

public class PainelInicialAdminProdutoController implements Initializable {

	@FXML
	private Button buttonBarAdmin, buttonBarFuncionario, buttonProduto, buttonCliente, buttonFuncionario,
			buttonRegistrarVenda, buttonGerenciarProdutos, buttonListarProdutos;
	@FXML
	private AnchorPane ap;
	
	@FXML
	private MenuItem menuItemLogout;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		if (Session.funcOnline.getClass() != Gerente.class) {
			this.buttonBarAdmin.setDisable(true);
		}

	}

	@FXML
	private void handleBtnNavBarFuncionario() throws IOException {
		AnchorPane next = (AnchorPane) FXMLLoader
				.load(getClass().getResource("/views/PainelInicialFuncionarioProduto.fxml"));
		this.ap.getChildren().setAll(next);
	}

	@FXML
	private void handleBtnCliente() throws IOException {
		AnchorPane next = (AnchorPane) FXMLLoader.load(getClass().getResource("/views/PainelInicialAdminCliente.fxml"));
		this.ap.getChildren().setAll(next);
	}

	@FXML
	private void hanbleBtnFuncionario() throws IOException {
		AnchorPane next = (AnchorPane) FXMLLoader
				.load(getClass().getResource("/views/PainelInicialAdminFuncionario.fxml"));
		this.ap.getChildren().setAll(next);
	}

	@FXML
	private void handleButtonAddProdutos() throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(SelecaoTipoProdutoController.class.getResource("/views/SelecaoTipoProduto.fxml"));
		AnchorPane page = loader.load();
		Stage diaogStage = new Stage();
		diaogStage.setTitle("Selecionar o tipo de produto");
		Scene scene = new Scene(page);
		diaogStage.setScene(scene);
		SelecaoTipoProdutoController controller = loader.getController();
		controller.setDialogStage(diaogStage);
		diaogStage.showAndWait();
	}
	
	@FXML 
	public void handleButtonRegistrarVenda() throws IOException{
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(RegistroVendaController.class.
				getResource("/views/RegistroVenda.fxml"));
		AnchorPane page = loader.load();
		Stage diaogStage = new Stage();
		diaogStage.setTitle("Registrar Venda");
		Scene scene = new Scene(page);
		diaogStage.setScene(scene);
		diaogStage.showAndWait();
	}
	
	@FXML
	private void handleButtonListProdutos() throws IOException {
		AnchorPane nextAp = (AnchorPane) FXMLLoader
				.load(getClass().getResource("/views/ListaProdutos.fxml"));
		this.ap.getChildren().setAll(nextAp);
	}
	
	@FXML
	public void handleButtonLogout() throws IOException{
		Stage actual = (Stage) buttonBarAdmin.getScene().getWindow();
		actual.close();
		
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(ListaClientesController.class.getResource("/views/Login.fxml"));
		AnchorPane page = (AnchorPane) loader.load();

		Stage nextStage = new Stage();
		nextStage.setTitle("Sistema Livraria ASW");
		nextStage.setResizable(false);
		Scene scene = new Scene(page);
		nextStage.setScene(scene);

		nextStage.show();
	}

}
