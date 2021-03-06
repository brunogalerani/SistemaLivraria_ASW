package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import database.JPAUtil;
import models.Cliente;

public class ClienteDAO {
	private EntityManager manager;

	public ClienteDAO() {
		this.manager = JPAUtil.getEntityManager();
	}

	public void insert(Cliente cliente) {
		this.manager.getTransaction().begin();
		this.manager.persist(cliente);
		this.manager.getTransaction().commit();
	}

	public void update(Cliente cliente) {
		this.manager.getTransaction().begin();
		this.manager.merge(cliente);
		this.manager.getTransaction().commit();
	}

	public void remove(Cliente cliente) {
		this.manager.getTransaction().begin();
		cliente = this.manager.find(Cliente.class, cliente.getCpf());
		this.manager.remove(cliente);
		this.manager.getTransaction().commit();
	}

	@SuppressWarnings("unchecked")
	public List<Cliente> all() {
		Query query = this.manager.createQuery("select c from Cliente c");
		List<Cliente> list = query.getResultList();
		return list;
	}

	public Cliente selectFromEmail(String email) {
		TypedQuery<Cliente> query = this.manager.createQuery("select c from Cliente c where c.email=:email", Cliente.class);
		query.setParameter("email", email);
		return query.getSingleResult();
	}

	public void rollback() {
		this.manager.getTransaction().rollback();
	}

	@Override
	protected void finalize() throws Throwable {
		this.manager.close();
	}
}
