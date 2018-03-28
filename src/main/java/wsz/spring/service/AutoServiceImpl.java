package wsz.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import wsz.spring.dao.AutoDao;

/**
 *
 *@author  wsz
 *@createdTime 2018年3月28日
*/
@Service
public class AutoServiceImpl implements AutoService{

	@Autowired
	private AutoDao autoDao;
	
	public void say() {
		System.out.println("AutoServiceImpl.say()");
		autoDao.say();
	}

}
