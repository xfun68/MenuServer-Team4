package model;

/**
 * Created with IntelliJ IDEA.
 * User: lilliansusan
 * Date: 6/18/13
 * Time: 4:42 PM
 * To change this template use File | Settings | File Templates.
 */
public class RestaurantName {

    String name;
    public RestaurantName(String name) {

               this.name = name;

    }

    @Override
    public String toString() {
        return  name ;
    }
}
