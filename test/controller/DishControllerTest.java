package controller;

import model.Dish;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.ui.ModelMap;

import java.io.IOException;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.spy;

/**
 * Created with IntelliJ IDEA.
 * User: Jamie
 * Date: 24/06/13
 * Time: 11:42
 * To change this template use File | Settings | File Templates.
 */
public class DishControllerTest {
    private ModelMap dishmodel;

    @InjectMocks
    DishController dishController;

    @Mock
    Dish dish;

    @Before
    public void setup(){
        dishController = new DishController();
        MockitoAnnotations.initMocks(this);
    }


    @Test
    public void should_display_dish_name(){
        dishmodel = new ModelMap();
        String expectedView = "DishName";
        String actualView = dishController.printDishName(dishmodel);

        assertThat(actualView, is(expectedView));
    }

    @Test
    public void should_display_dish_price(){
        dishmodel = new ModelMap();
        String expectedView = "DishPrice";
        String actualView = dishController.printDishPrice(dishmodel);

        assertThat(actualView, is(expectedView));
    }

    @Test
    public void should_render_to_a_picture() throws IOException {
        DishController spyDishController = spy(dishController);
        byte[] expectedBytes = "DishPicture".getBytes();
        String picturePath = "WEB-INF/pages/image/";

        Mockito.doReturn(expectedBytes).when(spyDishController).getPicture(eq(picturePath));

        assertThat(spyDishController.renderPicture(),is(expectedBytes));
    }

}
