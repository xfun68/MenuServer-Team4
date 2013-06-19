package controller;

import model.PostName;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.ui.ModelMap;

import java.io.IOException;
import java.util.Map;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.spy;

/**
 * Created with IntelliJ IDEA.
 * User: lilliansusan
 * Date: 6/18/13
 * Time: 4:51 PM
 * To change this template use File | Settings | File Templates.
 */
public class PostControllerTest {
    private ModelMap model;
    @InjectMocks
    PostController postController;

    @Mock
    PostName post;

    @Before
    public void setup() {
        postController = new PostController();
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void should_post_restaurant_name(){
        model = new ModelMap();
        String expectedView = "PandaBite";

        String actualView = postController.printWelcome(model);

        assertThat(actualView, is(expectedView));
    }

  /*  @Test

    public void should_render_to_a_picture() throws IOException {
        PostController spyPostController = spy(postController);
        byte[] expectedBytes = "Picture".getBytes();
        String picturePath = "WEB-INF/pages/image/oso.jpeg";

        Mockito.doReturn(expectedBytes).when(spyPostController).getPicture(eq(picturePath));

        assertThat(spyPostController.renderPicture(),is(expectedBytes));
    }      */

}
