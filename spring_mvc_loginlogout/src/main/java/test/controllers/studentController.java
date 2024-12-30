package test.controllers;

import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import test.Dao.studentDao;
import test.beans.student;

@Controller
public class studentController {
	
	@Autowired
	studentDao sd;
	@RequestMapping("/demo")
	public void shoe()
	{
		System.out.println("helooo");
	}

	
	
	@RequestMapping("/studentInfo")
	public String studentInfo(@ModelAttribute("s1")student s1)
	{
		
		
		 List<student> existstd = sd.studentcheck(s1);

	        if (!existstd.isEmpty()) 
	        {
	           
	            return "redirect:/index";
	        }
	
	
	    	if(s1.getSpass().equals(s1.getScpass()))
		     {
			   student st=new student();
			
			    String x=UUID.randomUUID().toString();
			     st.setSid(x);
			    st.setSname(s1.getSname());
			    st.setSemail(s1.getSemail());
			    st.setSpass(s1.getSpass());
			    st.setScpass(s1.getScpass());
			
		        sd.registerdata(st);
		
		
		      return "redirect:/login";
		    }
		
		   else
		    {
	           
	            return "redirect:/index";
	        }
	    }
	
	@RequestMapping("/login")
	public String login()
	{
		return "login";
		
	}
	
	@RequestMapping("/checkInfo")
	public String checkInfo(@ModelAttribute("s1")student s1 ,HttpSession sk)
	{
		
		List<student> l1=sd.checkdata(s1);
		if(l1.isEmpty())	
		{
			
	       return "redirect:/login";
		}
		
		sk.setAttribute("temp", s1.getSemail());
		return "redirect:/dash";
		
	}
	
	@RequestMapping("/dash")
	public String dash(HttpSession hs)
	{
		String x=(String) hs.getAttribute("temp");
		if(x==null)
		{
			return "redirect:/login";
		}
		return "dash";
	}
	
	@RequestMapping("/logout")
	public String logout(HttpSession hs)
	
	{
		hs.invalidate();
		return "redirect:/login";
	}
	
	@RequestMapping("/Resetpass")
	public String Resetpass()
	{
		return"Resetpass";
	}
	
	@RequestMapping("/Resetpassword")
	public String reset(@ModelAttribute("s2")student s2)
	
	{
		 sd.resetpass(s2);
		 return "redirect:/login";
		 
	}
	
	
	
	
}

