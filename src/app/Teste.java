package app;

import dao.GerenteDAO;
import encryption.EncryptPassword;
import models.Gerente;

public class Teste {
	public static void main(String[] args) {
		 Gerente gerente = new Gerente();
		 gerente.setCpf(123456);
		 gerente.setLogin("camila");
		 gerente.setSenha(EncryptPassword.encryptSHA256("123"));
		 GerenteDAO t = new GerenteDAO();
		 t.insert(gerente);
	}
}
