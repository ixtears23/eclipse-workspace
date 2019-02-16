package springbook.user.chapter7.dao;

public class DaoFactory {
	
	
	// accountDao, messageDao 를 추가로 만들면 새로운 문제 발생
	// ConnectionMaker 구현 클래스를 선정하고 생성하는 코드의 중복이 발생
	/*
	public UserDao userDao() {
		UserDao userDao = new UserDao(new DConnectionMaker());
		
		return userDao;
	}
	public AccountDao accountDao() {
		AccountDao accountDao = new AccountDao(new DConnectionMaker());
		
		return accountDao;
	}
	public MessageDao messageDao() {
		MessageDao messageDao = new MessageDao(new DConnectionMaker());
		
		return messageDao;
	}
	*/
	
	public UserDao userDao() {
		UserDao userDao = new UserDao(connectionMaker());
		
		return userDao;
	}
	public AccountDao accountDao() {
		AccountDao accountDao = new AccountDao(connectionMaker());
		
		return accountDao;
	}
	public MessageDao messageDao() {
		MessageDao messageDao = new MessageDao(connectionMaker());
		
		return messageDao;
	}
	
	public ConnectionMaker connectionMaker() {
		return new DConnectionMaker();
	}


}
