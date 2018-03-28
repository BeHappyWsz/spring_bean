package wsz.spring;

import wsz.spring.dao.UserDao;
import wsz.spring.service.AutoServiceImpl;
import wsz.spring.service.UserService;

/**
 *获取配置文件中的Bean:所有bean包含在xml中管理麻烦
 *@author  wsz
 *@createdTime 2018年3月28日
*/
public class GetBean {
	
	public static void main(String[] args) {
		/**
		 * setter注入
		 */
		UserDao bean = LoadFile.getBean("userDao");
		bean.say();
		
		/**
		 * 构造注入+常用数据类型注入默认值
		 */
		UserService userService = LoadFile.getBean("userService");
		userService.say();
		System.out.println(userService.toString());
		
		/**
		 * autowired自动注入
		 */
		LoadFile.getBean(AutoServiceImpl.class).say();
	}
}
