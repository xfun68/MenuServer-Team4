package model;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created with IntelliJ IDEA.
 * User: lilliansusan
 * Date: 6/18/13
 * Time: 4:19 PM
 * To change this template use File | Settings | File Templates.
 */
public class PostRestuarantTest {

    @Test
    public void should_display_restuarant_name(){
        PostName postName = new PostName("Panda Bite");

        String content = postName.toString();

        assertThat(content, is("Panda Bite"));
    }


}
