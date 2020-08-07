package in.javadomain;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateConfig {
	private static SessionFactory sessionFactory;

	static {
		try {
			// do not forget to add hibernate-jpa-2.1 [which is required jar for
			// hibernate 4.3.6+]
			Configuration configuration = new Configuration().configure();
			StandardServiceRegistryBuilder standardSrvcRgstryBuilder = new StandardServiceRegistryBuilder()
					.applySettings(configuration.getProperties());
			sessionFactory = configuration.buildSessionFactory(standardSrvcRgstryBuilder.build());

		} catch (HibernateException e) {
			System.out.println("Problem while creating a sessionfactory!");
		}
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
}
