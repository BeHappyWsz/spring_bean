package wsz.spring.dao;
/**
 *用于设值注入测试
 *@author  wsz
 *@createdTime 2018年3月28日
*/
public class UserDao {

	/**
	 * bean初始化方法
	 */
	public void init() {
		System.out.println("UserDao.init()");
	}
	
	public void say() {
		System.out.println("UserDao.say()");
	}
	
	public void destroy() {
		System.out.println("UserDao.destroy()");
	}
}
