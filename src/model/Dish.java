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
    private  String price;

    public Dish(String myDish) {
        this.myDish = myDish;
    }

    @Override
    public String toString() {
        return myDish;
    }


    public String printDishPrice(String price) {
        this.price = price;
        return price;
    }

    public String printDishName() {
         return myDish;
    }


    /** public String myDishAttributes() {

        String dishPrice = String.valueOf(price);

        return myDish + dishPrice;
    } **/
}
