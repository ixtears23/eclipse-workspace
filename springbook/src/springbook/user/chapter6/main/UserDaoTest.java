package springbook.user.chapter6.main;

import java.sql.SQLException;

import springbook.user.chapter6.dao.DaoFactory;
import springbook.user.chapter6.dao.UserDao;
import springbook.user.domain.User;

public class UserDaoTest {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		UserDao userDao = new DaoFactory().userDao();
		
		User user = new User();
		user.setId("whiteship");
		user.setName("��⼱");
		user.setPassword("married");
		
		userDao.add(user);
		
		System.out.println(user.getId() + " ��� ����");
		
		User user2 = userDao.get(user.getId());
		System.out.println(user2.getName());
		System.out.println(user2.getPassword());
		
		System.out.println(user2.getId() + " ��ȸ ����");
	}
}
