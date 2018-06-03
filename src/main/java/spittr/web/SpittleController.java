package spittr.web;

import static org.springframework.web.bind.annotation.RequestMethod.*;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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
		//System.out.println(spittleRepository.findSpittles(1, 10));
		returnList.add(new Spittle(null, "msg1", null, (double)1, (double)-1));
		returnList.add(new Spittle(null ,"msg2", null, (double)2, (double)-2));
		model.addAttribute("spittleList", returnList);
		return "spittles";
	}
	
	/**
	 * request parameter is added after ? in URL
	 * 
	 * http://localhost:8080/spittr/spittles/show?spittle_id=234
	 * 
	 * @param spittleId
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/show", method=GET)
	public String showSpittleRequestParam(@RequestParam("spittle_id") String spittleId,
	Model model) {
		
		System.out.println("showSpittlet"+spittleId);
		Spittle spittle = new Spittle(null, "msg1", null, (double)1, (double)-1);
		model.addAttribute("spittle", spittle);
		return "spittle";
	}
	
	/**
	 * using path variable where the value can be directly passed from url
	 * 
	 * http://localhost:8080/spittr/spittles/22
	 * 
	 * @param spittleId
	 * @param model
	 * @return
	 */
/*	@RequestMapping(value="{spittleId}", method=GET)
	public String showSpittlePathVar(@PathVariable("spittleId") long spittleId,
	Model model) {
		
		System.out.println("showSpittlePathVar"+spittleId);
		Spittle spittle = new Spittle(null, "msg1", null, (double)1, (double)-1);
		model.addAttribute("spittle", spittle);
		return "spittle";
	}*/
	
	/**
	 * using path variable where the value can be directly passed from url
	 * 
	 * Here @PathVar does not have name mentioned
	 * 
	 * http://localhost:8080/spittr/spittles/22
	 * 
	 * @param spittleId
	 * @param model
	 * @return
	 */
	@RequestMapping(value="{spittleId}", method=GET)
	public String showSpittlePathVarNoName(@PathVariable long spittleId,
	Model model) {
		
		System.out.println("showSpittlePathVarNoNameg"+spittleId);
		Spittle spittle = new Spittle(null, "msg1", null, (double)1, (double)-1);
		model.addAttribute("spittle", spittle);
		return "spittle";
	}
	
	@RequestMapping(method=POST)
	public String submitSpittle(Spittle spittle) {
		
		System.out.println("showSpittlePathVarNoNameg"+spittle.getMessage());
		return "spittles";
	}
}