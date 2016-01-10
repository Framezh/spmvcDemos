package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.portlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.demo.entity.User;

/**
 * @author zalman
 * @email 528091954@qq.com
 * @date: 2016年1月7日 @time: 上午10:58:54
 */
@Controller
@RequestMapping("/user")
public class UserController {

	@RequestMapping(value="/add",method=RequestMethod.GET)
	public String createUser() {
		return "login";
	}
	@RequestMapping(value="/list",method=RequestMethod.POST)
	public ModelAndView success(User user) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("user",user);
		mav.setViewName("success");
		return mav;
	}
	/**
	 * Demo 向页面 传递参数
	 * @param model
	 * (localhost:8080/..Projs/views/)
	 * @return user/hello.jsp
	 */
	@RequestMapping(value="/hello",method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		System.out.println("Say Hello...");
		model.addAttribute("message", "Spring-3-MVC 传递参数 Message");
		return "user/hello";
	}
	
	
	/**
	 * TestDemos
	 * @param username
	 * @param password
	 * @return
	 */
	@RequestMapping(value="/login1")
	public String loginT1(@RequestParam(value="username") String username, String password) {
		// @RequestParam是指请求url地址映射中必须含有的参数(除非属性required=false)
		// @RequestParam可简写为：@RequestParam("username")
		if (!"admin".equals(username) || !"123".equals(password)) {
			return "error";
		}
		return "success";
	}
	/**
	 * ???
	 * ModelAndView ???
	 */
	@RequestMapping(value="/login2")
	public ModelAndView loginT2(String username, String password) {
		// request和response不必非要出现在方法中，如果用不上的话可以去掉
        // 参数的名称是与页面控件的name相匹配，参数类型会自动被转换
		if (!"admin".equals(username) || !"123".equals(password)) {
			return new ModelAndView("error");
		}
		return new ModelAndView(new RedirectView("../index.jsp"));//采用重定向方式跳转页面
		//简单写法: return new ModelAndView("redirect:../index.jsp");
	}
	@RequestMapping(value="/login3")
	public ModelAndView loginT3(User user) {
		// 同样支持参数为表单对象，类似于Struts的ActionForm，User不需要任何配置，直接写即可
		String username = user.getUserName();
		String password = user.getPassword();
		if (!"admin".equals(username) || !"123".equals(password)) {
			return new ModelAndView("error");
		}
		return new ModelAndView("success");
	}
	
//	@Resource(name = "loginService")	// 获取applicationContext.xml中bean的id为loginService的，并注入
//	private LoginService loginService;	//等价于spring传统注入方式写get和set方法，这样的好处是简洁工整，省去了不必要得代码
//
//	@RequestMapping("/test/login4.do")
//	public String testLogin4(User user) {
//		if (loginService.login(user) == false) {
//			return "loginError";
//		}
//		return "loginSuccess";
//	}
	
}
