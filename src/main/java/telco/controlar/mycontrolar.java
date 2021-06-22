package telco.controlar;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import telco.service.UserService;

@RestController
public class mycontrolar {
	
	@Autowired
	UserService userService;
	
	
	@RequestMapping(value="/hello", method = RequestMethod.GET)
	public String Name(Model model, RedirectAttributes redirectAttrs,HttpServletRequest request)
	{
		return "redirect:/test1.jsp";
	}
	
	@GetMapping("/getAlluserlist")
	public List<telco.model.User> getAlluser()
	{
		return userService.getAlluser();
	}
}
