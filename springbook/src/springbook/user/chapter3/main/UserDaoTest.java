package springbook.user.chapter3.main;

import java.sql.SQLException;

import springbook.user.chapter3.dao.NUserDao;
import springbook.user.chapter3.dao.UserDao;
import springbook.user.domain.User;

public class UserDaoTest {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		UserDao userDao = new NUserDao();
		
		User user = new User();
		user.setId("whiteship");
		user.setName("백기선");
		user.setPassword("married");
		
		userDao.add(user);
		
		System.out.println(user.getId() + " 등록 성공");
		
		User user2 = userDao.get(user.getId());
		System.out.println(user2.getName());
		System.out.println(user2.getPassword());
		
		System.out.println(user2.getId() + " 조회 성공");
	}
}
