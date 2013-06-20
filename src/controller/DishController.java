package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletContext;

/**
 * Created with IntelliJ IDEA.
 * User: lilliansusan
 * Date: 6/20/13
 * Time: 11:54 AM
 * To change this template use File | Settings | File Templates.
 */
@Controller

public class DishController {
    @Autowired
    ServletContext servletContext;

   /* @RequestMapping(value = "/PandaBite", method = RequestMethod.GET, headers={"Accept=application/xml"})
    @ResponseBody
    public String printWelcomeXml() {
        String xml = "<?xml version=\"1.0\" encoding=\"utf-8\"?>" +
                "<message>Welcome to Panda Bite" +
                "<p>Here is your menu</p></message>";
        return xml;
    }          */



    @RequestMapping(value = "/PandaBite", method = RequestMethod.GET)
        public String printDishName(ModelMap dishModel)
    {

        dishModel.addAttribute("message","Welcome to Panda Bite");
        dishModel.addAttribute("message2","Here is your menu");
        dishModel.addAttribute("dish","Sushi");
        dishModel.addAttribute("dish","Sushi");

        return "PandaBite";
    }
}
