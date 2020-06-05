package src.com.csis3275.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import src.com.csis3275.model.Member;

@Controller
@RequestMapping("/TeamView")
public class TeamController {
 /*
 * This method will serve as default GET handler.
 */
 @RequestMapping(method = RequestMethod.GET)
 public String newProfile(ModelMap model) {
 Member teamLeader = new Member();
 model.addAttribute("member", teamLeader);
 return "TeamView";
 }
 /*
 * This method will be called on form submission, handling POST request It
 * also validates the user input
 
 @RequestMapping(method = RequestMethod.POST)
 public String saveProfile(KLOC_AHe_33 count,
 BindingResult result, ModelMap model) {
	 
 if (result.hasErrors()) {
 return "KlocView_AHe_33";
 }
 
 model.addAttribute("success", "total is: " + count.getResult()  );
 model.addAttribute("count",count);
 return "success_AHe_33";
 }
 
 */
	
	 @ModelAttribute("members")
	 public List<Member> initializeMembers() {
	 List<Member> members = new ArrayList<Member>();
	 
	 Member member1 = new Member();
	 
	 /* 
	  * 
		Web Service Development & integration
		Scum Leader
		Back-end Developer
		Testing
		Back-end Development
		UML Documentation
		Database Creation and population
		UX/UI Design
		HTML/CSS Front End
		JSP
		
	*/
	 
	 member1.setName("Aram");
	 
	 ArrayList <String> tasksAram =  new ArrayList<String>();
	 tasksAram.add("Team Leader");
	 tasksAram.add("Web Service Development & integration");
	 tasksAram.add("UML Documentation");
	 tasksAram.add("Testing");
	 
	 member1.setTasks(tasksAram);
	 member1.setStudent_ID(300285533);
	 
	 
	 
	 
	
	 return members;
	 }
 
 

}
