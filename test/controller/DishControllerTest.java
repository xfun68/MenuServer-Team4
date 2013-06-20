package controller;

import model.Dish;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.ui.ModelMap;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created with IntelliJ IDEA.
 * User: lilliansusan
 * Date: 6/20/13
 * Time: 11:51 AM
 * To change this template use File | Settings | File Templates.
 */
public class DishControllerTest {
    private ModelMap dishModel;

    @InjectMocks

   DishController dishController;

    @Mock

    Dish dish;


    @Before
    public void setup() {
        dishController = new DishController();
        MockitoAnnotations.initMocks(this);
    }

    @Test

    public void  should_display_dish_name(){

        dishModel = new ModelMap();
        String expectedView = "PandaBite";

        String actualView = dishController.printDishName(dishModel);

        assertThat(actualView, is(expectedView));
    }

    /*@Test
    public void should_render_to_xml_dish_name(){
        String expectedXml = "<?xml version=\"1.0\" encoding=\"utf-8\"?>" +
                "<message>Welcome to Panda Bite" +
                "<p>Here is your menu</p></message>";

        String actualXml = dishController.printWelcomeXml();

        assertThat(actualXml, is(expectedXml));
    }
                        */

}
