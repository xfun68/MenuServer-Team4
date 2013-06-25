package controller;

import model.RestaurantName;
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
import static org.mockito.Mockito.eq;
import static org.mockito.Mockito.spy;

public class RestaurantControllerTest {
    private ModelMap model;
    @InjectMocks
    RestaurantController restaurantController;

    @Mock
    RestaurantName post;

    @Before
    public void setup() {
        restaurantController = new RestaurantController();
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void should_post_restaurant_name(){
        model = new ModelMap();
        String expectedView = "Restaurant";

        String actualView = restaurantController.printWelcome(model);

        assertThat(actualView, is(expectedView));
    }


    @Test
    public void should_render_to_a_picture() throws IOException {
        RestaurantController spyPostController = spy(restaurantController);
        byte[] expectedBytes = "Picture".getBytes();
        String picturePath = "WEB-INF/pages/image/food.jpg";

        Mockito.doReturn(expectedBytes).when(spyPostController).getPicture(eq(picturePath));

        assertThat(spyPostController.renderPicture(),is(expectedBytes));
    }

}
