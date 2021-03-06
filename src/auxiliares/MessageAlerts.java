
package auxiliares;

import java.util.Optional;

import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;

public class MessageAlerts {
	private static Alert alert;

	public static void campoObrigatorioEmBranco() {
		alert = new Alert(Alert.AlertType.WARNING);
		alert.setTitle("Campos em branco!");
		alert.setHeaderText("Existem campos obrigat�rios em branco!");
		alert.setContentText("Por favor, preencha todos os campos antes de prosseguir!");
		alert.showAndWait();
	}

	public static void usuarioNaoEncontrado() {
		alert = new Alert(Alert.AlertType.WARNING);
		alert.setTitle("Usuario inv�lido!");
		alert.setHeaderText("O usu�rio informado n�o foi encontrado!");
		alert.setContentText("Por favor, verifique as credenciais e tente novamente!");
		alert.showAndWait();
	}

	public static void dadosRegistrados() {
		alert = new Alert(Alert.AlertType.INFORMATION);
		alert.setTitle("Sucesso!");
		alert.setHeaderText("Os dados foram registrados com sucesso!");
		alert.showAndWait();
	}

	public static void falhaRegistro() {
		alert = new Alert(Alert.AlertType.ERROR);
		alert.setTitle("Erro!");
		alert.setHeaderText("Ocorreu um erro e n�o foi poss�vel armazenar os dados!");
		alert.setContentText("Por favor, repita a opera��o novamente!");
		alert.showAndWait();
	}

	public static Optional<ButtonType> cancelarVenda() {
		alert = new Alert(Alert.AlertType.CONFIRMATION);
		alert.setTitle("Cancelar a venda!");
		alert.setHeaderText("Voc� deseja voltar e cancelar a venda?");
		return alert.showAndWait();
	}

	public static Optional<ButtonType> cancelarCadastro() {
		alert = new Alert(Alert.AlertType.CONFIRMATION);
		alert.setTitle("Cancelar cadastro!");
		alert.setHeaderText("Voce deseja voltar e cancelar o cadastro?");
		return alert.showAndWait();
	}

	public static Optional<ButtonType> removerItemAsk() {
		alert = new Alert(Alert.AlertType.CONFIRMATION);
		alert.setTitle("Exclus�o de item!");
		alert.setHeaderText("Voc� deseja excluir o item selecionado?");
		return alert.showAndWait();
	}

	public static void removerItemConfirmacao() {
		alert = new Alert(Alert.AlertType.INFORMATION);
		alert.setTitle("Item removido!");
		alert.setHeaderText("O item foi removido com sucesso!");
		alert.showAndWait();
	}

	public static void valorInvalido() {
		alert = new Alert(Alert.AlertType.WARNING);
		alert.setTitle("Valor inv�lido!");
		alert.setHeaderText("O valor informado � inv�lido!");
		alert.setContentText("Por favor, verifique o valor digitado e insira-o novamente");
		alert.showAndWait();
	}

	public static void valorInsuficiente() {
		alert = new Alert(Alert.AlertType.WARNING);
		alert.setTitle("Valor insuficiente!");
		alert.setHeaderText("N�o � poss�vel utilizar o valor informado!");
		alert.setContentText("Por favor, insira um valor menor do que o informado!");
		alert.showAndWait();
	}

	public static void objetoNaoSelecionado() {
		alert = new Alert(Alert.AlertType.WARNING);
		alert.setTitle("Item n�o selecionado!");
		alert.setHeaderText("N�o existe nenhum item selecionado!");
		alert.setContentText("Por favor, selecione um item!");
		alert.showAndWait();
	}

	public static void vendaRealizada() {
		alert = new Alert(Alert.AlertType.INFORMATION);
		alert.setTitle("Venda realizada!");
		alert.setHeaderText("A Venda foi realizada com sucesso!");
		alert.showAndWait();
	}
	
	public static void nomeIncompleto() {
		alert = new Alert(Alert.AlertType.WARNING);
		alert.setTitle("Nome incompleto!");
		alert.setHeaderText("Por favor, insira o nome completo no campo \"Nome\"!");
		alert.showAndWait();
	}
	
	public static void campoDuplicado(){
		alert = new Alert(Alert.AlertType.WARNING);
		alert.setTitle("Campo Duplicado!");
		alert.setHeaderText("Algum dos campos que n�o devem ter repeti��o j� est� cadastrado!");
		alert.setContentText("Verifique as informa��es e tente novamente!");
		alert.showAndWait();
	}

}