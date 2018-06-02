package spittr.web;

import static org.springframework.web.bind.annotation.RequestMethod.*;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import spittr.Spittle;

@Controller
@RequestMapping("/spittles")
public class SpittleController { 
	//@RequestMapping(value = "/", method = GET)
	//@RequestMapping(method=GET)
	//the logical view name is being returned
/*	public String home() {
		System.out.println("S11111111111111111111");
		return "spittles";
	}*/
	
	@RequestMapping(method=GET)
	public String home(Model model) {
		
		System.out.println("NEXT SET");
		List<Spittle> returnList = new ArrayList<Spittle>();
		returnList.add(new Spittle(null, "msg1", null, (double)1, (double)-1));
		returnList.add(new Spittle(null ,"msg2", null, (double)2, (double)-2));
		model.addAttribute("spittleList", returnList);
		return "spittles";
	}
}