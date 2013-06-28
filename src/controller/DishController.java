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

    @RequestMapping(value = "/FriedBeef", method = RequestMethod.GET)
    public String printDishName(ModelMap dishmodel) {
        dishmodel.addAttribute("message", "Fried Beef");
        return "FriedBeef";
    }

    @RequestMapping(value = "/BeefPrice", method = RequestMethod.GET)
    public String printDishPrice(ModelMap dishmodel) {
        dishmodel.addAttribute("message1", "UGX 10,000");
        return "BeefPrice";
    }

    @RequestMapping(value = "/FriedPork", method = RequestMethod.GET)
    public String printPorkName(ModelMap dishmodel) {
        dishmodel.addAttribute("message", "Fried Pork");
        return "FriedPork";
    }

    @RequestMapping(value = "/PorkPrice", method = RequestMethod.GET)
    public String printPorkPrice(ModelMap dishmodel) {
        dishmodel.addAttribute("message1", "UGX 11,000");
        return "PorkPrice";
    }

    @RequestMapping(value = "/ChocolateCake", method = RequestMethod.GET)
    public String printChocolateCakeName(ModelMap dishmodel) {
        dishmodel.addAttribute("message", "Chocolate Cake");
        return "ChocolateCake";
    }

    @RequestMapping(value = "/ChocolateCakePrice", method = RequestMethod.GET)
    public String printChocolateCakePrice(ModelMap dishmodel) {
        dishmodel.addAttribute("message1", "UGX 15,000");
        return "ChocolateCakePrice";
    }

    @RequestMapping(value = "/Tiramisu", method = RequestMethod.GET)
    public String printTiramisuName(ModelMap dishmodel) {
        dishmodel.addAttribute("message", "Tiramisu");
        return "Tiramisu";
    }

    @RequestMapping(value = "/TiramisuPrice", method = RequestMethod.GET)
    public String printTiramisuPrice(ModelMap dishmodel) {
        dishmodel.addAttribute("message1", "UGX 14,000");
        return "TiramisuPrice";
    }

    @RequestMapping(value = "/FriedBeefImage", method = RequestMethod.GET , produces = MediaType.IMAGE_JPEG_VALUE)
    @ResponseBody
    public byte[] renderBeefPicture() throws IOException {
        String picturePath = "WEB-INF/pages/image/FriedBeef.jpg";

        return getPicture(picturePath);

    }

    @RequestMapping(value = "/FriedPorkImage", method = RequestMethod.GET , produces = MediaType.IMAGE_JPEG_VALUE)
    @ResponseBody
    public byte[] renderPorkPicture() throws IOException {
        String picturePath = "WEB-INF/pages/image/FriedPork.jpg";

        return getPicture(picturePath);

    }

    @RequestMapping(value = "/ChocolateCakeImage", method = RequestMethod.GET , produces = MediaType.IMAGE_JPEG_VALUE)
    @ResponseBody
    public byte[] renderCakePicture() throws IOException {
        String picturePath = "WEB-INF/pages/image/ChocolateCake.jpg";

        return getPicture(picturePath);

    }

    @RequestMapping(value = "/TiramisuImage", method = RequestMethod.GET , produces = MediaType.IMAGE_JPEG_VALUE)
    @ResponseBody
    public byte[] renderTiramisuPicture() throws IOException {
        String picturePath = "WEB-INF/pages/image/Tiramisu.jpg";

        return getPicture(picturePath);

    }

    public byte[] getPicture(String path) throws IOException {
        InputStream resourceAsStream;
        resourceAsStream = servletContext.getResourceAsStream(path);

        return org.apache.commons.io.IOUtils.toByteArray(resourceAsStream);
    }


    public byte[] renderPicture() {
        return new byte[0];  //To change body of created methods use File | Settings | File Templates.
    }


}
