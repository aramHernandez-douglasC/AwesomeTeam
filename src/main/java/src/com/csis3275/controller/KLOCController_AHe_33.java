package src.com.csis3275.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import src.com.csis3275.model.KLOC_AHe_33;

@Controller
//Here we will have this controller respond to requests from /employee for the employee servlet.
@RequestMapping("/employee")
public class KLOCController_AHe_33 {
 /*
 * This method will serve as default GET handler.
 */
 @RequestMapping(method = RequestMethod.GET)
 public String newProfile(ModelMap model) {
 KLOC_AHe_33 count = new KLOC_AHe_33();
 model.addAttribute("count", count);
 return "KlocView_AHe_33";
 }
 /*
 * This method will be called on form submission, handling POST request It
 * also validates the user input
 */
 @RequestMapping(method = RequestMethod.POST)
 public String saveProfile(KLOC_AHe_33 count,
 BindingResult result, ModelMap model) {
	 
 if (result.hasErrors()) {
 return "KlocView_AHe_33";
 }
 
 model.addAttribute("success", "total is: " + count.getResult()  );
 model.addAttribute("count",count);
 return "success_AHe_33.jsp";
 }
 
 

}
