package com.marticus.controller;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

import org.hibernate.Session;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.marticus.model.Users;
import com.marticus.utility.HibernateUtil;

@Controller
public class HomeController {

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		System.out.println("Home Page Requested, locale = " + locale);
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

		String formattedDate = dateFormat.format(date);

		model.addAttribute("serverTime", formattedDate);

		return "home";
	}

	@RequestMapping(value = "/user", method = RequestMethod.POST)
	public String user(@Validated Users users, Model model) {
		System.out.println("User Page Requested");
		
		Session session=com.marticus.utility.HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.save(users);
		session.getTransaction().commit();
//		HibernateUtil.shutdown();
		session.close();
		
		model.addAttribute("userName", users.getUserName());
		model.addAttribute("userAge", users.getUserAge());
		return "user";
	}
	
	@RequestMapping(value = "/search", method = RequestMethod.GET)
	public String search(Locale locale, Model model) {
		System.out.println("Home Page Requested, locale = " + locale);
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

		String formattedDate = dateFormat.format(date);

		model.addAttribute("serverTime", formattedDate);
		
		Users users= new Users();
//		u.setId(1);
//		session.load(u, new Integer(1));
		Session session=com.marticus.utility.HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		System.out.println("User Id : "+users.getId());
		System.out.println("User Name : "+users.getUserName());
		System.out.println("User Age : "+users.getUserAge());
		session.save(users);
		session.close();
	

		return "search";
	}
	@RequestMapping (value = "/searchresults", method = RequestMethod.POST) 
	public String getUser(String id, Model model) { 
		System.out.println("Search Results Requested");

	Session session =com.marticus.utility.HibernateUtil.getSessionFactory().openSession();
	session.beginTransaction(); 
	Users users=new Users();
	users.setId(Integer.parseInt(id)); 
	session. load(users, new Integer(id));
	
	System.out.println(users.getId());
	System.out.println(users.getUserName());
	System.out.println(users.getUserAge());
	model.addAttribute("userid", users.getId());
	model.addAttribute("userName",users.getUserName()); 
	model.addAttribute("userAge", users.getUserAge());

	session.getTransaction().commit();
	session.close();

	return "searchresults";
	
}
	@RequestMapping(value = "/userslist", method = RequestMethod.GET)
	public String usersList(Model model) {
		 //HQL - Hibenate Query Language
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		//select * from Users -- equivalent SQL
		List Users =session.createQuery("From Users").list();
		ArrayList <Users> uList = new ArrayList<Users>();
		for (Iterator iterator2 = Users.iterator(); iterator2.hasNext();){
            Users u = (Users) iterator2.next(); 
            
            uList.add(u);
            System.out.println("User: " + u.getId()); 
         }
		model.addAttribute("uList",uList );
//		List<EmployeeVO> empList=employeeManager.getAllEmployees();
//		model.addAttribute("employees",empList );
//		<c:forEach items="${uList}" var="user">
//		<td>${user.name}</td>
//
//		
//		/c:forEach>

		
//		model.addAttribute("userName", user.getUserName());
//		model.addAttribute("userAge", user.getUserAge());
		return "userslist";
	}

//	@RequestMapping(value = "/updateuser", method = RequestMethod.POST)
//	public String updateUsersData(@Validated Users user, Model model) {
//		 
//		Session session = HibernateUtil.getSessionFactory().openSession();
//		session.beginTransaction();
//		session.save(user);
//		session.getTransaction().commit();
//		session.close();	
//		model.addAttribute("userName", user.getUserName());
//		model.addAttribute("userAge", user.getUserAge());
//		return "redirect:/userlist";
//	}
	
	@RequestMapping(value="/update/{id}", method=RequestMethod.GET)
	public String updateUserForDisplay(@PathVariable("id") int id, Model model) throws Exception
    {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		Users users= new Users();
		users.setId(id);		
		session.load(users, new Integer(id));
		model.addAttribute("users", users);		 
		session.getTransaction().commit();
		session.close();		
    	return "rediret:/userslist";
    }
     
	
	@RequestMapping(value="/delete/{id}", method=RequestMethod.GET)
	public String deleteUser(@PathVariable("id") int id, Model model) throws Exception
    {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		Users users= new Users();
		users.setId(id);		
		session.load(users, new Integer(id));		
		session.delete(users);
		session.getTransaction().commit();
		session.close();		
		return "redirect:/userslist";
    }

}