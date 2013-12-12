package valera.server.domain;

import javax.persistence.EntityManager;

public class UserRepository {
    
	EntityManager em = EntityManagerFactoryClass.getEntityManager();
	
	public User loadById(int id) {
		return em.find(User.class, id);
	}
}
