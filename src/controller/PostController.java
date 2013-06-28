package controller;
import org.apache.commons.io.IOUtils;
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
 * User: lilliansusan
 * Date: 6/18/13
 * Time: 5:01 PM
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class PostController {
     @Autowired
     ServletContext servletContext;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String printWelcome(ModelMap model) {
        model.addAttribute("message", "PandaBite");
        return "PandaBite";
    }


    @RequestMapping( value = "/picture", method = RequestMethod.GET , produces = MediaType.IMAGE_JPEG_VALUE)
    @ResponseBody
    public byte[] renderPicture() throws IOException {
        String picturePath = "WEB-INF/pages/image/food.jpg";

        return getPicture(picturePath);
    }

    public byte[] getPicture(String path) throws IOException{

       InputStream resourceAsStream;
       resourceAsStream = servletContext.getResourceAsStream(path);

        return IOUtils.toByteArray(resourceAsStream);
    }
}
