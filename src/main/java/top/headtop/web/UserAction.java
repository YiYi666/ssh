package top.headtop.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import top.headtop.entity.User;
import top.headtop.service.UserService;

@Controller
@Scope("prototype")
public class UserAction extends ActionSupport implements ModelDriven<User>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Autowired
	private UserService userService;
	
	private User user = new User();
	
	public String userAdd() {
		userService.userInsert(user);
		return "index";
	}
	
	public String insert() {
		return "insert";
	}



	@Override
	public User getModel() {
		// TODO Auto-generated method stub
		return user;
	}
	

}
