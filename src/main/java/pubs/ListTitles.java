package pubs;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ListTitles {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pubs_persistence");
		EntityManager em = emf.createEntityManager();
		
//		var query = em.createQuery("select t from pubs.entities.Title t");
		var query = em.createQuery
		("select new pubs.entities.TitlePriceDTO(t.title, t.price) from pubs.entities.Title t");
		var titles = query.getResultList();
		
		for (var title : titles) {
			System.out.println(title);
		}
		em.close();
		emf.close();
	}
}