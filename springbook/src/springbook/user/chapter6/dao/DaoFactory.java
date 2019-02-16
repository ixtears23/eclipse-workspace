package springbook.user.chapter6.dao;

public class DaoFactory {
	
	public UserDao userDao() {
		ConnectionMaker connectionMaker = new DConnectionMaker();
		UserDao userDao = new UserDao(connectionMaker);
		
		return userDao;
	}

}
