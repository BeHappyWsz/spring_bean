package wsz.spring.dao;

import org.springframework.stereotype.Repository;

/**
 *
 *@author  wsz
 *@createdTime 2018年3月28日
*/
@Repository
public class AutoDaoImpl implements AutoDao{

	public void say() {
		System.out.println("AutoDaoImpl.say()");
	}
	
}
