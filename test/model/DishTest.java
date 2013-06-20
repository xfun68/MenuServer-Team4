package model;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created with IntelliJ IDEA.
 * User: lilliansusan
 * Date: 6/20/13
 * Time: 9:25 AM
 * To change this template use File | Settings | File Templates.
 */
public class DishTest {

    @Test

    public void should_display_dish_name(){

        Dish dish = new Dish("Sushi");

        String dishName = dish.getDishName();

        assertThat(dishName, is("Sushi"));

    }



}
