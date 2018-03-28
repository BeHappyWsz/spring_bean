package wsz.spring.service;

import java.util.List;
import java.util.Map;
import java.util.Set;

import wsz.spring.dao.UserDao;
import wsz.spring.dao.UserDao2;

/**
 *service实现类
 *@author  wsz
 *@createdTime 2018年3月28日
*/
public class UserServiceImpl implements UserService{

	/**
	 * setter设值注入<property name="userDao" ref="userDao"/>
	 * @param userDao
	 */
	private UserDao userDao;
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	/**
	 * 构造注入
	 * @param userDao2
	 */
	private UserDao2 userDao2;
	public UserServiceImpl(UserDao2 userDao2) {
		this.userDao2 = userDao2;
	}
	
	public void say() {
		System.out.println("UserService:say()");
		userDao.say();
		userDao2.say();
	}
	
	
	/**                 注入其他类型的参数默认值                          **/
	private int age;
	private String name;
	private List<String> list;
	private Set<String> set;
	private Map<String,Object> map;
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	public Set<String> getSet() {
		return set;
	}

	public void setSet(Set<String> set) {
		this.set = set;
	}

	public Map<String, Object> getMap() {
		return map;
	}

	public void setMap(Map<String, Object> map) {
		this.map = map;
	}

	@Override
	public String toString() {
		return "UserServiceImpl [age=" + age + ", name=" + name + ", list=" + list + ", set=" + set + ", map=" + map
				+ "]";
	}
	
	
}
