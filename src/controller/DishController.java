package controller;

import model.Dish;
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


/**
 * Created with IntelliJ IDEA.
 * User: Jamie
 * Date: 24/06/13
 * Time: 11:47
 * To change this template use File | Settings | File Templates.
 */
@Controller

public class DishController {
    @Autowired
    ServletContext servletContext;

    @RequestMapping(value = "/DishAttributes", method = RequestMethod.GET)
    public String printDishAttributes(ModelMap dishmodel) {
        dishmodel.addAttribute("message", "Fried Beef " + " 10000");
        dishmodel.addAttribute("message1", "Beef Burger " + " 15000");
        return "DishAttributes";

    }

    @RequestMapping(value = "/DishPicture", method = RequestMethod.GET , produces = MediaType.IMAGE_JPEG_VALUE)
    @ResponseBody
    public byte[] renderPicture() throws IOException {
        String picturePath = "WEB-INF/pages/image/FriedBeef.jpg";

        return getPicture(picturePath);

    }

    public byte[] getPicture(String path) throws IOException {
        InputStream resourceAsStream;
        resourceAsStream = servletContext.getResourceAsStream(path);

        return org.apache.commons.io.IOUtils.toByteArray(resourceAsStream);
    }


}
