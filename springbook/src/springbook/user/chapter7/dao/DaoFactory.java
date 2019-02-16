package springbook.user.chapter7.dao;

public class DaoFactory {
	
	
	// accountDao, messageDao �� �߰��� ����� ���ο� ���� �߻�
	// ConnectionMaker ���� Ŭ������ �����ϰ� �����ϴ� �ڵ��� �ߺ��� �߻�
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
