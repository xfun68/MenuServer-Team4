package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


import javax.servlet.ServletContext;
import java.io.IOException;
import java.io.InputStream;



@Controller
public class RestaurantController {
     @Autowired
     ServletContext servletContext;

    @RequestMapping(value = "/Restaurant", method = RequestMethod.GET)
    public String printWelcome(ModelMap model) {
        model.addAttribute("message", "Kololo Courts");
        return "Restaurant";
    }


    @RequestMapping(value = "/Picture", method = RequestMethod.GET , produces = MediaType.IMAGE_JPEG_VALUE)
    @ResponseBody
    public byte[] renderPicture() throws IOException {
        String picturePath = "WEB-INF/pages/image/food.jpg";

        return getPicture(picturePath);
    }

    public byte[] getPicture(String path) throws IOException{

       InputStream resourceAsStream;
       resourceAsStream = servletContext.getResourceAsStream(path);

        return org.apache.commons.io.IOUtils.toByteArray(resourceAsStream);
    }


}
