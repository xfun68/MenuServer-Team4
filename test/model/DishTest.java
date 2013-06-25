package model;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created with IntelliJ IDEA.
 * User: Jamie
 * Date: 24/06/13
 * Time: 11:31
 * To change this template use File | Settings | File Templates.
 */
public class DishTest {

    @Test
    public  void should_display_dish_name_and_price(){
        Dish dish = new Dish("Fried Beef", 10000);
        String myDish = dish.myDishAttributes();

        assertThat(myDish.toString(),  is("Fried Beef" + "10000"));
    }

}
