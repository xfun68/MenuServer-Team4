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
public class RestaurantTest {

    @Test
    public void should_display_restaurant_name(){
        RestaurantName restaurantName = new RestaurantName("Kololo Courts");

        String content = restaurantName.toString();

        assertThat(content, is("Kololo Courts"));
    }


}
