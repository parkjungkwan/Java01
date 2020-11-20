package user;

public class UserServiceImpl implements UserService{
	
	private UserDto[] users;
	private int count;
	public UserServiceImpl() {
		users = new UserDto[3];
		count = 0;
	}

	@Override
	public void join(UserDto user) {
		users[count] = user;
		count++;
	}

	@Override
	public UserDto login(UserDto user) {
		UserDto result = null;
		for(int i=0; i< count; i++) {
			if(user.getUserid().equals(
					users[i].getUserid()) &&
					user.getPassword().equals(users[i].getPassword())) {
				result = users[i];
				break;
			}
		}
		return result;
	}

	@Override
	public void update(UserDto user) {
		for(int i=0; i< count; i++) {
			if(user.getUserid().equals(users[i].getUserid())) {
				users[i].setPassword(user.getPassword());
				break;
			}
		}
	}

	@Override
	public void delete(UserDto user) {
		for(int i=0; i< count; i++) {
			if(user.getUserid().equals(users[i].getUserid())
					&& user.getPassword().equals(users[i].getPassword())) {
				users[i] = users[count-1];
				users[count-1] = null;
				count--;
				break;
			}
		}
		
	}

	@Override
	public boolean idCheck(String id) {
		
		return false;
	}

	@Override
	public UserDto mypage(UserDto user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDto[] userList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDto idSearch(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDto[] nameSearch(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int count() {
		return count;
	}

}
