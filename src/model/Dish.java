package model;

/**
 * Created with IntelliJ IDEA.
 * User: Jamie
 * Date: 24/06/13
 * Time: 11:33
 * To change this template use File | Settings | File Templates.
 */
public class Dish {
    private  String myDish;
    private  int price;

    public Dish(String myDish) {
        this.myDish = myDish;
    }

    public Dish(String myDish, int price) {
        this.myDish = myDish;
        this.price = price;
        //To change body of created methods use File | Settings | File Templates.
    }

    @Override
    public String toString() {
        return myDish;
    }


    public String myDishAttributes() {

        String dishPrice = String.valueOf(price);

        return myDish + dishPrice;
    }
}
