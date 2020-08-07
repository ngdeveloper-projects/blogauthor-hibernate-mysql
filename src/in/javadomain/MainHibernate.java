package in.javadomain;

import org.hibernate.Session;

public class MainHibernate {
	public static void main(String[] args) {
		// creating the session from the sessionfactory
		Session session = HibernateConfig.getSessionFactory().openSession();

		// Save starts -- Naveen - Javadomain.in // save or insert
		session.beginTransaction();
		Author author = new Author();
		author.setAuthorID(3);
		author.setAuthorName("Naveen kumar Gunasekaran");
		author.getSiteInfo().setSiteName("Javadomain.in");
		author.getSiteInfo().setSitePurpose("programming blog");
		session.save(author);
		session.getTransaction().commit();
		// Save ends -- Naveen - Javadomain.in

		// fetching starts -- Naveen - Javadomain.in // fetching or select
		session.beginTransaction();
		Author authorFetch = (Author) session.get(Author.class, 3);
		System.out.println("Before :" + authorFetch.getAuthorName());
		System.out.println("Before :" + authorFetch.getSiteInfo().getSiteName());

		// fetching ends -- Naveen - Javadomain.in

		// update starts -- Naveen - Javadomain.in // update
		authorFetch.setAuthorName("Naveen G");
		authorFetch.getSiteInfo().setSiteName("www.mirthbees.com");
		session.getTransaction().commit();
		// update ends -- Naveen - Javadomain.in

		System.out.println("After :" + authorFetch.getAuthorName());
		System.out.println("After :" + authorFetch.getSiteInfo().getSiteName());
		// closing the session factory session session.close();
		HibernateConfig.getSessionFactory().close();
	}
}
