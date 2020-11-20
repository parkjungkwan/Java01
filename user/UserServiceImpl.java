package user;

public class UserServiceImpl implements UserService{
	private UserDto[] users;
	private int count;
	public UserServiceImpl() {
		users = new UserDto[3];
	}

	@Override
	public void join(UserDto user) {
		users[count] = user;
		count++;
	}

	@Override
	public UserDto login(UserDto user) {
		UserDto result = new UserDto();
		for(int i=0;i < count; i++) {
			if(user.getUserid().equals(users[i].getUserid()) &&
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
		for(int i=0; i< count; i ++) {
			if(user.getUserid().equals(users[i].getUserid())&&
					user.getPassword().equals(users[i].getPassword())) {
				users[i] = users[count-1];
				users[count-1] = null;
				count--;
				break;
			}
		}
		
	}

	@Override
	public boolean idCheck(String id) {
		boolean flag = false;
		for(int i=0; i<count; i++) {
			if(id.equals(users[i].getUserid())) {
				flag = true; 
				break;
			}
		}
		return flag;
	}

	@Override
	public UserDto mypage(UserDto user) {
		UserDto result = new UserDto();
		for(int i=0; i< count; i++) {
			if(user.getUserid().equals(users[i].getUserid())) {
				result = users[i];
				break;
			}
		}
		return result;
	}

	@Override
	public UserDto[] userList() {
		return users;
	}

	@Override
	public UserDto idSearch(String id) {
		UserDto user = new UserDto();
		for(int i = 0; i < count; i++) {
			if(id.equals(users[i].getUserid())) {
				user = users[i];
			}
		}
		return user;
	}
	@Override
	public int countSameName(String name) {
		int num = 0;
		for(int i = 0; i< count; i++) {
			if(name.equals(users[i].getName())) {
				num++;
			}
		}
		return num;
	}
	
	@Override
	public UserDto[] nameSearch(String name) {
		int num = countSameName(name);
		UserDto[] usersWithSameName = new UserDto[num];
		int j = 0;
		for(int i = 0; i< count; i++) {
			if(name.equals(users[i].getName())) {
				usersWithSameName[j] = users[i];
				j++;
				if(j==num) {break;}
			}
		}
		return usersWithSameName;
	}

	@Override
	public int count() {
		return count;
	}
	
}
