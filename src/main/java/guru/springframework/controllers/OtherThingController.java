/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guru.springframework.controllers;

/**
 *
 * @author jomahony
 */
import guru.springframework.domain.OtherThing;
import guru.springframework.services.OtherThingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class OtherThingController {
  private OtherThingService otherThingService;
  
    @Autowired
    public void setOtherThingService(OtherThingService otherThingService) {
        this.otherThingService = otherThingService;
    }  
    
    @RequestMapping(value = "/otherthings", method = RequestMethod.GET)
    public String list(Model model){
        model.addAttribute("otherThings", otherThingService.listAllOtherThings());
        System.out.println("Returning OtherThings:");
        return "otherThings";
    }

    @RequestMapping("otherthings/{id}")
    public String showProduct(@PathVariable Integer id, Model model){
        model.addAttribute("otherThings", otherThingService.getOtherThingId(id));
        return "otherthingsshow";
    }

    @RequestMapping("otherThings/edit/{id}")
    public String edit(@PathVariable Integer id, Model model){
        model.addAttribute("product", otherThingService.getOtherThingId(id));
        return "otherthingsform";
    }

    @RequestMapping("otherThings/new")
    public String newOtherThings(Model model){
        model.addAttribute("otherThings", new OtherThing());
        return "otherthingsform";
    }

    @RequestMapping(value = "otherThings", method = RequestMethod.POST)
    public String saveOtherThings(OtherThing otherThings){

        otherThingService.saveOtherThing(otherThings);

        return "redirect:/otherThings/" + otherThings.getId();
    }    
}
