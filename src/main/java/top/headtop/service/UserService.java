package top.headtop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import top.headtop.dao.BaseDao;
import top.headtop.entity.User;

@Service
@Transactional
public class UserService {
	@Autowired
	private BaseDao<User,Integer> userdao;
	
	public void userInsert(User user) {
		userdao.save(user);
	}
	
}
