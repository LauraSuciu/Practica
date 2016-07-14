package task_manager;

import java.util.List;
import java.util.Date;
import java.util.Iterator;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class userManager {
	private static SessionFactory factory;

	public static void main(String[] args) {
		try {
			factory = new Configuration().configure().buildSessionFactory();
		} catch (Throwable ex) {
			System.err.println("Failed to create sessionFactory object." + ex);
			throw new ExceptionInInitializerError(ex);
		}
		userManager ME = new userManager();

		/* Add few Users records in database */
		Integer empID1 = ME.addUsers("Alex", "123", 1," sgga");
		Integer empID2 = ME.addUsers("Laura", "1111", 2,"sfwF");
		Integer empID3 = ME.addUsers("Adi", "111", 2,"WFEWA");	

		/* List down all the Userss */
		ME.listUserss();

		/* Update Users's records */
		ME.updateUsers(empID1, 5000);

		/* Delete an Users from the database */
		ME.deleteUsers(empID2);

		/* List down new list of the Userss */
		ME.listUserss();
	}

	/* Method to CREATE an Users in the database */
	public Integer addUsers(String fname, String lname, int salary,String mail) {
		Session session = factory.openSession();
		Transaction tx = null;
		Integer UsersID = null;
		try {
			tx = session.beginTransaction();
			Users Users = new Users(fname, lname, salary,mail);
			UsersID = (Integer) session.save(Users);
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return UsersID;
	}

	/* Method to READ all the Userss */
	public void listUserss() {
		Session session = factory.openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			List Userss = session.createQuery("FROM Users").list();
			for (Iterator iterator = Userss.iterator(); iterator.hasNext();) {
				Users Users = (Users) iterator.next();
				System.out.print("First Name: " + Users.getUsername());
				System.out.print("  Last Name: " + Users.getPassword());
				System.out.println("  Salary: " + Users.getId_role());
			}
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

	/* Method to UPDATE Privileges for an Users */
	public void updateUsers(Integer UsersID, int salary) {
		Session session = factory.openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			Users Users = (Users) session.get(Users.class, UsersID);
			Users.setId_role(salary);
			session.update(Users);
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

	/* Method to DELETE an Users from the records */
	public void deleteUsers(Integer UsersID) {
		Session session = factory.openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			Users Users = (Users) session.get(Users.class, UsersID);
			session.delete(Users);
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
	}
}